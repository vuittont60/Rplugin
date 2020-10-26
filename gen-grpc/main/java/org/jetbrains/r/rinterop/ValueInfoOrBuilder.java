// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.jetbrains.r.rinterop;

public interface ValueInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rplugininterop.ValueInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string cls = 1;</code>
   * @return A list containing the cls.
   */
  java.util.List<java.lang.String>
      getClsList();
  /**
   * <code>repeated string cls = 1;</code>
   * @return The count of cls.
   */
  int getClsCount();
  /**
   * <code>repeated string cls = 1;</code>
   * @param index The index of the element to return.
   * @return The cls at the given index.
   */
  java.lang.String getCls(int index);
  /**
   * <code>repeated string cls = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cls at the given index.
   */
  com.google.protobuf.ByteString
      getClsBytes(int index);

  /**
   * <code>.rplugininterop.ValueInfo.Unevaluated unevaluated = 2;</code>
   * @return Whether the unevaluated field is set.
   */
  boolean hasUnevaluated();
  /**
   * <code>.rplugininterop.ValueInfo.Unevaluated unevaluated = 2;</code>
   * @return The unevaluated.
   */
  org.jetbrains.r.rinterop.ValueInfo.Unevaluated getUnevaluated();
  /**
   * <code>.rplugininterop.ValueInfo.Unevaluated unevaluated = 2;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.UnevaluatedOrBuilder getUnevaluatedOrBuilder();

  /**
   * <code>.rplugininterop.ValueInfo.Value value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.rplugininterop.ValueInfo.Value value = 3;</code>
   * @return The value.
   */
  org.jetbrains.r.rinterop.ValueInfo.Value getValue();
  /**
   * <code>.rplugininterop.ValueInfo.Value value = 3;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.ValueOrBuilder getValueOrBuilder();

  /**
   * <code>.rplugininterop.ValueInfo.List list = 4;</code>
   * @return Whether the list field is set.
   */
  boolean hasList();
  /**
   * <code>.rplugininterop.ValueInfo.List list = 4;</code>
   * @return The list.
   */
  org.jetbrains.r.rinterop.ValueInfo.List getList();
  /**
   * <code>.rplugininterop.ValueInfo.List list = 4;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.ListOrBuilder getListOrBuilder();

  /**
   * <code>.rplugininterop.ValueInfo.DataFrame dataFrame = 5;</code>
   * @return Whether the dataFrame field is set.
   */
  boolean hasDataFrame();
  /**
   * <code>.rplugininterop.ValueInfo.DataFrame dataFrame = 5;</code>
   * @return The dataFrame.
   */
  org.jetbrains.r.rinterop.ValueInfo.DataFrame getDataFrame();
  /**
   * <code>.rplugininterop.ValueInfo.DataFrame dataFrame = 5;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.DataFrameOrBuilder getDataFrameOrBuilder();

  /**
   * <code>.rplugininterop.ValueInfo.Function function = 6;</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <code>.rplugininterop.ValueInfo.Function function = 6;</code>
   * @return The function.
   */
  org.jetbrains.r.rinterop.ValueInfo.Function getFunction();
  /**
   * <code>.rplugininterop.ValueInfo.Function function = 6;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.FunctionOrBuilder getFunctionOrBuilder();

  /**
   * <code>.rplugininterop.ValueInfo.Environment environment = 7;</code>
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   * <code>.rplugininterop.ValueInfo.Environment environment = 7;</code>
   * @return The environment.
   */
  org.jetbrains.r.rinterop.ValueInfo.Environment getEnvironment();
  /**
   * <code>.rplugininterop.ValueInfo.Environment environment = 7;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.EnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   * <code>.google.protobuf.Empty graph = 8;</code>
   * @return Whether the graph field is set.
   */
  boolean hasGraph();
  /**
   * <code>.google.protobuf.Empty graph = 8;</code>
   * @return The graph.
   */
  com.google.protobuf.Empty getGraph();
  /**
   * <code>.google.protobuf.Empty graph = 8;</code>
   */
  com.google.protobuf.EmptyOrBuilder getGraphOrBuilder();

  /**
   * <code>.rplugininterop.ValueInfo.Error error = 9;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.rplugininterop.ValueInfo.Error error = 9;</code>
   * @return The error.
   */
  org.jetbrains.r.rinterop.ValueInfo.Error getError();
  /**
   * <code>.rplugininterop.ValueInfo.Error error = 9;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>.rplugininterop.ValueInfo.Matrix matrix = 10;</code>
   * @return Whether the matrix field is set.
   */
  boolean hasMatrix();
  /**
   * <code>.rplugininterop.ValueInfo.Matrix matrix = 10;</code>
   * @return The matrix.
   */
  org.jetbrains.r.rinterop.ValueInfo.Matrix getMatrix();
  /**
   * <code>.rplugininterop.ValueInfo.Matrix matrix = 10;</code>
   */
  org.jetbrains.r.rinterop.ValueInfo.MatrixOrBuilder getMatrixOrBuilder();

  public org.jetbrains.r.rinterop.ValueInfo.InfoCase getInfoCase();
}
