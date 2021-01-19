package org.jetbrains.r.editor.mlcompletion.model.updater

import com.intellij.openapi.components.service
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.progress.ProcessCanceledException
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.Task
import com.intellij.openapi.project.Project
import com.intellij.util.concurrency.SequentialTaskExecutor
import com.intellij.util.io.HttpRequests
import org.apache.maven.artifact.repository.metadata.io.xpp3.MetadataXpp3Reader
import org.eclipse.aether.util.version.GenericVersionScheme
import org.jetbrains.r.RBundle
import org.jetbrains.r.editor.mlcompletion.MachineLearningCompletionModelFilesService
import java.nio.file.Paths
import java.util.concurrent.atomic.AtomicBoolean


class MachineLearningCompletionDownloadModelService {

  companion object {
    fun getInstance() = service<MachineLearningCompletionDownloadModelService>()
    private val LOG = Logger.getInstance(MachineLearningCompletionModelFilesService::class.java)
    val isBeingDownloaded = AtomicBoolean(false)
    private val executor = SequentialTaskExecutor.createSequentialApplicationPoolExecutor("MachineLearningCompletionUpdateChecker")
    private val completionFilesService = MachineLearningCompletionModelFilesService.getInstance()

    private fun <T> submitBackgroundJob(job: () -> T, onSuccessCallback: (T) -> Unit) =
      executor.execute {
        try {
          onSuccessCallback(job())
        }
        catch (ignored: ProcessCanceledException) {
          isBeingDownloaded.set(false)
        }
        catch (e: Throwable) {
          LOG.info(e)
          isBeingDownloaded.set(false)
        }
      }
  }

  private fun getArtifactsToDownload() : List<MachineLearningCompletionRemoteArtifact> =
    MachineLearningCompletionRemoteArtifact.values().filter { artifact ->
      val artifactMetadataUrl = artifact.metadataUrl
      val metadata = HttpRequests.request(artifactMetadataUrl).readString()
      val latestVersion = GenericVersionScheme().parseVersion(
        MetadataXpp3Reader().read(metadata.byteInputStream()).versioning.latest
      )
      artifact.latestVersion = latestVersion
      val currentVersion = artifact.currentVersion

      currentVersion == null || currentVersion < latestVersion
    }

  fun getArtifactsToDownloadDescriptorsAsync(onSuccessCallback: (List<MachineLearningCompletionRemoteArtifact>) -> Unit) {
    if (!isBeingDownloaded.compareAndSet(false, true)) {
      return
    }

    submitBackgroundJob(this::getArtifactsToDownload, onSuccessCallback)
  }

 fun getArtifactsSize(artifacts: List<MachineLearningCompletionRemoteArtifact>): Long =
    artifacts.map { artifact ->
      val artifactUrl = artifact.getArtifactUrl(artifact.latestVersion.toString())
      HttpRequests.request(artifactUrl).connect { request ->
        request.connection.contentLengthLong
      }
    }.sum()

  fun createDownloadAndUpdateTask(project: Project,
                                  artifacts: List<MachineLearningCompletionRemoteArtifact>,
                                  onSuccessCallback: () -> Unit,
                                  onFinishedCallback: () -> Unit) =
    object : Task.Backgroundable(project, RBundle.message("rmlcompletion.task.downloadAndUpdate"), true) {
      override fun run(indicator: ProgressIndicator) = artifacts.forEach { artifact ->
        val artifactLocalPath = Paths.get(completionFilesService.localServerDirectory!!, artifact.id + artifact.latestVersion.toString())
        HttpRequests.request(artifact.getArtifactUrl(artifact.latestVersion.toString()))
          .saveToFile(artifactLocalPath, indicator)
      }

      override fun onSuccess() = onSuccessCallback()

      override fun onFinished() = onFinishedCallback()
    }
}
