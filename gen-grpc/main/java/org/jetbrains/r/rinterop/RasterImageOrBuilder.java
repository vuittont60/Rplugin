// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.jetbrains.r.rinterop;

public interface RasterImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rplugininterop.RasterImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 width = 1;</code>
   */
  int getWidth();

  /**
   * <code>int32 height = 2;</code>
   */
  int getHeight();

  /**
   * <pre>
   * little-endian uint32[] ARGB
   * </pre>
   *
   * <code>bytes data = 3;</code>
   */
  com.google.protobuf.ByteString getData();
}
