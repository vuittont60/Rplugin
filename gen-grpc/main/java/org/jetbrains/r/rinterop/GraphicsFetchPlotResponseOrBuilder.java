// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.jetbrains.r.rinterop;

public interface GraphicsFetchPlotResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rplugininterop.GraphicsFetchPlotResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.rplugininterop.Plot plot = 2;</code>
   * @return Whether the plot field is set.
   */
  boolean hasPlot();
  /**
   * <code>.rplugininterop.Plot plot = 2;</code>
   * @return The plot.
   */
  org.jetbrains.r.rinterop.Plot getPlot();
  /**
   * <code>.rplugininterop.Plot plot = 2;</code>
   */
  org.jetbrains.r.rinterop.PlotOrBuilder getPlotOrBuilder();
}
