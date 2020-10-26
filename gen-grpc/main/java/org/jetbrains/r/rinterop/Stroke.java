// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.jetbrains.r.rinterop;

/**
 * Protobuf type {@code rplugininterop.Stroke}
 */
public final class Stroke extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rplugininterop.Stroke)
    StrokeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Stroke.newBuilder() to construct.
  private Stroke(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Stroke() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Stroke();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Stroke(
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
          case 13: {

            width_ = input.readFloat();
            break;
          }
          case 16: {

            cap_ = input.readInt32();
            break;
          }
          case 24: {

            join_ = input.readInt32();
            break;
          }
          case 37: {

            miterLimit_ = input.readFloat();
            break;
          }
          case 40: {

            pattern_ = input.readInt32();
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
    return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_Stroke_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_Stroke_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.r.rinterop.Stroke.class, org.jetbrains.r.rinterop.Stroke.Builder.class);
  }

  public static final int WIDTH_FIELD_NUMBER = 1;
  private float width_;
  /**
   * <code>float width = 1;</code>
   * @return The width.
   */
  @java.lang.Override
  public float getWidth() {
    return width_;
  }

  public static final int CAP_FIELD_NUMBER = 2;
  private int cap_;
  /**
   * <code>int32 cap = 2;</code>
   * @return The cap.
   */
  @java.lang.Override
  public int getCap() {
    return cap_;
  }

  public static final int JOIN_FIELD_NUMBER = 3;
  private int join_;
  /**
   * <code>int32 join = 3;</code>
   * @return The join.
   */
  @java.lang.Override
  public int getJoin() {
    return join_;
  }

  public static final int MITERLIMIT_FIELD_NUMBER = 4;
  private float miterLimit_;
  /**
   * <code>float miterLimit = 4;</code>
   * @return The miterLimit.
   */
  @java.lang.Override
  public float getMiterLimit() {
    return miterLimit_;
  }

  public static final int PATTERN_FIELD_NUMBER = 5;
  private int pattern_;
  /**
   * <code>int32 pattern = 5;</code>
   * @return The pattern.
   */
  @java.lang.Override
  public int getPattern() {
    return pattern_;
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
    if (width_ != 0F) {
      output.writeFloat(1, width_);
    }
    if (cap_ != 0) {
      output.writeInt32(2, cap_);
    }
    if (join_ != 0) {
      output.writeInt32(3, join_);
    }
    if (miterLimit_ != 0F) {
      output.writeFloat(4, miterLimit_);
    }
    if (pattern_ != 0) {
      output.writeInt32(5, pattern_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (width_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, width_);
    }
    if (cap_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, cap_);
    }
    if (join_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, join_);
    }
    if (miterLimit_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, miterLimit_);
    }
    if (pattern_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, pattern_);
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
    if (!(obj instanceof org.jetbrains.r.rinterop.Stroke)) {
      return super.equals(obj);
    }
    org.jetbrains.r.rinterop.Stroke other = (org.jetbrains.r.rinterop.Stroke) obj;

    if (java.lang.Float.floatToIntBits(getWidth())
        != java.lang.Float.floatToIntBits(
            other.getWidth())) return false;
    if (getCap()
        != other.getCap()) return false;
    if (getJoin()
        != other.getJoin()) return false;
    if (java.lang.Float.floatToIntBits(getMiterLimit())
        != java.lang.Float.floatToIntBits(
            other.getMiterLimit())) return false;
    if (getPattern()
        != other.getPattern()) return false;
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
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getWidth());
    hash = (37 * hash) + CAP_FIELD_NUMBER;
    hash = (53 * hash) + getCap();
    hash = (37 * hash) + JOIN_FIELD_NUMBER;
    hash = (53 * hash) + getJoin();
    hash = (37 * hash) + MITERLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMiterLimit());
    hash = (37 * hash) + PATTERN_FIELD_NUMBER;
    hash = (53 * hash) + getPattern();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.r.rinterop.Stroke parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.Stroke parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.r.rinterop.Stroke parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.r.rinterop.Stroke parseFrom(
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
  public static Builder newBuilder(org.jetbrains.r.rinterop.Stroke prototype) {
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
   * Protobuf type {@code rplugininterop.Stroke}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rplugininterop.Stroke)
      org.jetbrains.r.rinterop.StrokeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_Stroke_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_Stroke_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.r.rinterop.Stroke.class, org.jetbrains.r.rinterop.Stroke.Builder.class);
    }

    // Construct using org.jetbrains.r.rinterop.Stroke.newBuilder()
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
      width_ = 0F;

      cap_ = 0;

      join_ = 0;

      miterLimit_ = 0F;

      pattern_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.r.rinterop.Service.internal_static_rplugininterop_Stroke_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.r.rinterop.Stroke getDefaultInstanceForType() {
      return org.jetbrains.r.rinterop.Stroke.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.r.rinterop.Stroke build() {
      org.jetbrains.r.rinterop.Stroke result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.r.rinterop.Stroke buildPartial() {
      org.jetbrains.r.rinterop.Stroke result = new org.jetbrains.r.rinterop.Stroke(this);
      result.width_ = width_;
      result.cap_ = cap_;
      result.join_ = join_;
      result.miterLimit_ = miterLimit_;
      result.pattern_ = pattern_;
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
      if (other instanceof org.jetbrains.r.rinterop.Stroke) {
        return mergeFrom((org.jetbrains.r.rinterop.Stroke)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.r.rinterop.Stroke other) {
      if (other == org.jetbrains.r.rinterop.Stroke.getDefaultInstance()) return this;
      if (other.getWidth() != 0F) {
        setWidth(other.getWidth());
      }
      if (other.getCap() != 0) {
        setCap(other.getCap());
      }
      if (other.getJoin() != 0) {
        setJoin(other.getJoin());
      }
      if (other.getMiterLimit() != 0F) {
        setMiterLimit(other.getMiterLimit());
      }
      if (other.getPattern() != 0) {
        setPattern(other.getPattern());
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
      org.jetbrains.r.rinterop.Stroke parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.r.rinterop.Stroke) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float width_ ;
    /**
     * <code>float width = 1;</code>
     * @return The width.
     */
    @java.lang.Override
    public float getWidth() {
      return width_;
    }
    /**
     * <code>float width = 1;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(float value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float width = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0F;
      onChanged();
      return this;
    }

    private int cap_ ;
    /**
     * <code>int32 cap = 2;</code>
     * @return The cap.
     */
    @java.lang.Override
    public int getCap() {
      return cap_;
    }
    /**
     * <code>int32 cap = 2;</code>
     * @param value The cap to set.
     * @return This builder for chaining.
     */
    public Builder setCap(int value) {
      
      cap_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cap = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCap() {
      
      cap_ = 0;
      onChanged();
      return this;
    }

    private int join_ ;
    /**
     * <code>int32 join = 3;</code>
     * @return The join.
     */
    @java.lang.Override
    public int getJoin() {
      return join_;
    }
    /**
     * <code>int32 join = 3;</code>
     * @param value The join to set.
     * @return This builder for chaining.
     */
    public Builder setJoin(int value) {
      
      join_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 join = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJoin() {
      
      join_ = 0;
      onChanged();
      return this;
    }

    private float miterLimit_ ;
    /**
     * <code>float miterLimit = 4;</code>
     * @return The miterLimit.
     */
    @java.lang.Override
    public float getMiterLimit() {
      return miterLimit_;
    }
    /**
     * <code>float miterLimit = 4;</code>
     * @param value The miterLimit to set.
     * @return This builder for chaining.
     */
    public Builder setMiterLimit(float value) {
      
      miterLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float miterLimit = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMiterLimit() {
      
      miterLimit_ = 0F;
      onChanged();
      return this;
    }

    private int pattern_ ;
    /**
     * <code>int32 pattern = 5;</code>
     * @return The pattern.
     */
    @java.lang.Override
    public int getPattern() {
      return pattern_;
    }
    /**
     * <code>int32 pattern = 5;</code>
     * @param value The pattern to set.
     * @return This builder for chaining.
     */
    public Builder setPattern(int value) {
      
      pattern_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pattern = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPattern() {
      
      pattern_ = 0;
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


    // @@protoc_insertion_point(builder_scope:rplugininterop.Stroke)
  }

  // @@protoc_insertion_point(class_scope:rplugininterop.Stroke)
  private static final org.jetbrains.r.rinterop.Stroke DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.r.rinterop.Stroke();
  }

  public static org.jetbrains.r.rinterop.Stroke getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Stroke>
      PARSER = new com.google.protobuf.AbstractParser<Stroke>() {
    @java.lang.Override
    public Stroke parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Stroke(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Stroke> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Stroke> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.r.rinterop.Stroke getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

