// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.jetbrains.r.rinterop;

/**
 * Protobuf type {@code rplugininterop.GraphicsInstallRequest}
 */
public final class GraphicsInstallRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rplugininterop.GraphicsInstallRequest)
    GraphicsInstallRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GraphicsInstallRequest.newBuilder() to construct.
  private GraphicsInstallRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GraphicsInstallRequest() {
    packagePath_ = "";
    libraryPath_ = "";
    packageType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GraphicsInstallRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GraphicsInstallRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            packagePath_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            libraryPath_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            packageType_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_GraphicsInstallRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_GraphicsInstallRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.r.rinterop.GraphicsInstallRequest.class, org.jetbrains.r.rinterop.GraphicsInstallRequest.Builder.class);
  }

  public static final int PACKAGEPATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object packagePath_;
  /**
   * <code>string packagePath = 1;</code>
   * @return The packagePath.
   */
  @java.lang.Override
  public java.lang.String getPackagePath() {
    java.lang.Object ref = packagePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packagePath_ = s;
      return s;
    }
  }
  /**
   * <code>string packagePath = 1;</code>
   * @return The bytes for packagePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPackagePathBytes() {
    java.lang.Object ref = packagePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      packagePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIBRARYPATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object libraryPath_;
  /**
   * <code>string libraryPath = 2;</code>
   * @return The libraryPath.
   */
  @java.lang.Override
  public java.lang.String getLibraryPath() {
    java.lang.Object ref = libraryPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      libraryPath_ = s;
      return s;
    }
  }
  /**
   * <code>string libraryPath = 2;</code>
   * @return The bytes for libraryPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLibraryPathBytes() {
    java.lang.Object ref = libraryPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      libraryPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGETYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object packageType_;
  /**
   * <code>string packageType = 3;</code>
   * @return The packageType.
   */
  @java.lang.Override
  public java.lang.String getPackageType() {
    java.lang.Object ref = packageType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageType_ = s;
      return s;
    }
  }
  /**
   * <code>string packageType = 3;</code>
   * @return The bytes for packageType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPackageTypeBytes() {
    java.lang.Object ref = packageType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      packageType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPackagePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, packagePath_);
    }
    if (!getLibraryPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, libraryPath_);
    }
    if (!getPackageTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, packageType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPackagePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, packagePath_);
    }
    if (!getLibraryPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, libraryPath_);
    }
    if (!getPackageTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, packageType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.jetbrains.r.rinterop.GraphicsInstallRequest)) {
      return super.equals(obj);
    }
    org.jetbrains.r.rinterop.GraphicsInstallRequest other = (org.jetbrains.r.rinterop.GraphicsInstallRequest) obj;

    if (!getPackagePath()
        .equals(other.getPackagePath())) return false;
    if (!getLibraryPath()
        .equals(other.getLibraryPath())) return false;
    if (!getPackageType()
        .equals(other.getPackageType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PACKAGEPATH_FIELD_NUMBER;
    hash = (53 * hash) + getPackagePath().hashCode();
    hash = (37 * hash) + LIBRARYPATH_FIELD_NUMBER;
    hash = (53 * hash) + getLibraryPath().hashCode();
    hash = (37 * hash) + PACKAGETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPackageType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.r.rinterop.GraphicsInstallRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.jetbrains.r.rinterop.GraphicsInstallRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rplugininterop.GraphicsInstallRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rplugininterop.GraphicsInstallRequest)
      org.jetbrains.r.rinterop.GraphicsInstallRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_GraphicsInstallRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_GraphicsInstallRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.r.rinterop.GraphicsInstallRequest.class, org.jetbrains.r.rinterop.GraphicsInstallRequest.Builder.class);
    }

    // Construct using org.jetbrains.r.rinterop.GraphicsInstallRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      packagePath_ = "";

      libraryPath_ = "";

      packageType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_GraphicsInstallRequest_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.r.rinterop.GraphicsInstallRequest getDefaultInstanceForType() {
      return org.jetbrains.r.rinterop.GraphicsInstallRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.r.rinterop.GraphicsInstallRequest build() {
      org.jetbrains.r.rinterop.GraphicsInstallRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.r.rinterop.GraphicsInstallRequest buildPartial() {
      org.jetbrains.r.rinterop.GraphicsInstallRequest result = new org.jetbrains.r.rinterop.GraphicsInstallRequest(this);
      result.packagePath_ = packagePath_;
      result.libraryPath_ = libraryPath_;
      result.packageType_ = packageType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.jetbrains.r.rinterop.GraphicsInstallRequest) {
        return mergeFrom((org.jetbrains.r.rinterop.GraphicsInstallRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.r.rinterop.GraphicsInstallRequest other) {
      if (other == org.jetbrains.r.rinterop.GraphicsInstallRequest.getDefaultInstance()) return this;
      if (!other.getPackagePath().isEmpty()) {
        packagePath_ = other.packagePath_;
        onChanged();
      }
      if (!other.getLibraryPath().isEmpty()) {
        libraryPath_ = other.libraryPath_;
        onChanged();
      }
      if (!other.getPackageType().isEmpty()) {
        packageType_ = other.packageType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.r.rinterop.GraphicsInstallRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.r.rinterop.GraphicsInstallRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object packagePath_ = "";
    /**
     * <code>string packagePath = 1;</code>
     * @return The packagePath.
     */
    public java.lang.String getPackagePath() {
      java.lang.Object ref = packagePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packagePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string packagePath = 1;</code>
     * @return The bytes for packagePath.
     */
    public com.google.protobuf.ByteString
        getPackagePathBytes() {
      java.lang.Object ref = packagePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        packagePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string packagePath = 1;</code>
     * @param value The packagePath to set.
     * @return This builder for chaining.
     */
    public Builder setPackagePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      packagePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string packagePath = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPackagePath() {
      
      packagePath_ = getDefaultInstance().getPackagePath();
      onChanged();
      return this;
    }
    /**
     * <code>string packagePath = 1;</code>
     * @param value The bytes for packagePath to set.
     * @return This builder for chaining.
     */
    public Builder setPackagePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      packagePath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object libraryPath_ = "";
    /**
     * <code>string libraryPath = 2;</code>
     * @return The libraryPath.
     */
    public java.lang.String getLibraryPath() {
      java.lang.Object ref = libraryPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        libraryPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string libraryPath = 2;</code>
     * @return The bytes for libraryPath.
     */
    public com.google.protobuf.ByteString
        getLibraryPathBytes() {
      java.lang.Object ref = libraryPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        libraryPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string libraryPath = 2;</code>
     * @param value The libraryPath to set.
     * @return This builder for chaining.
     */
    public Builder setLibraryPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      libraryPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string libraryPath = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLibraryPath() {
      
      libraryPath_ = getDefaultInstance().getLibraryPath();
      onChanged();
      return this;
    }
    /**
     * <code>string libraryPath = 2;</code>
     * @param value The bytes for libraryPath to set.
     * @return This builder for chaining.
     */
    public Builder setLibraryPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      libraryPath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object packageType_ = "";
    /**
     * <code>string packageType = 3;</code>
     * @return The packageType.
     */
    public java.lang.String getPackageType() {
      java.lang.Object ref = packageType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string packageType = 3;</code>
     * @return The bytes for packageType.
     */
    public com.google.protobuf.ByteString
        getPackageTypeBytes() {
      java.lang.Object ref = packageType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        packageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string packageType = 3;</code>
     * @param value The packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      packageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string packageType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPackageType() {
      
      packageType_ = getDefaultInstance().getPackageType();
      onChanged();
      return this;
    }
    /**
     * <code>string packageType = 3;</code>
     * @param value The bytes for packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      packageType_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rplugininterop.GraphicsInstallRequest)
  }

  // @@protoc_insertion_point(class_scope:rplugininterop.GraphicsInstallRequest)
  private static final org.jetbrains.r.rinterop.GraphicsInstallRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.r.rinterop.GraphicsInstallRequest();
  }

  public static org.jetbrains.r.rinterop.GraphicsInstallRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GraphicsInstallRequest>
      PARSER = new com.google.protobuf.AbstractParser<GraphicsInstallRequest>() {
    @java.lang.Override
    public GraphicsInstallRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GraphicsInstallRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GraphicsInstallRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphicsInstallRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.r.rinterop.GraphicsInstallRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

