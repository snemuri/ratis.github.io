// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/source_info.proto

package org.apache.ratis.shaded.com.google.api;

/**
 * <pre>
 * Source information used to create a Service Config
 * </pre>
 *
 * Protobuf type {@code google.api.SourceInfo}
 */
public  final class SourceInfo extends
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.SourceInfo)
    SourceInfoOrBuilder {
  // Use SourceInfo.newBuilder() to construct.
  private SourceInfo(org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SourceInfo() {
    sourceFiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SourceInfo(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              sourceFiles_ = new java.util.ArrayList<org.apache.ratis.shaded.com.google.protobuf.Any>();
              mutable_bitField0_ |= 0x00000001;
            }
            sourceFiles_.add(
                input.readMessage(org.apache.ratis.shaded.com.google.protobuf.Any.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        sourceFiles_ = java.util.Collections.unmodifiableList(sourceFiles_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.ratis.shaded.com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_descriptor;
  }

  protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.ratis.shaded.com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.ratis.shaded.com.google.api.SourceInfo.class, org.apache.ratis.shaded.com.google.api.SourceInfo.Builder.class);
  }

  public static final int SOURCE_FILES_FIELD_NUMBER = 1;
  private java.util.List<org.apache.ratis.shaded.com.google.protobuf.Any> sourceFiles_;
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  public java.util.List<org.apache.ratis.shaded.com.google.protobuf.Any> getSourceFilesList() {
    return sourceFiles_;
  }
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  public java.util.List<? extends org.apache.ratis.shaded.com.google.protobuf.AnyOrBuilder> 
      getSourceFilesOrBuilderList() {
    return sourceFiles_;
  }
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  public int getSourceFilesCount() {
    return sourceFiles_.size();
  }
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.Any getSourceFiles(int index) {
    return sourceFiles_.get(index);
  }
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.AnyOrBuilder getSourceFilesOrBuilder(
      int index) {
    return sourceFiles_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < sourceFiles_.size(); i++) {
      output.writeMessage(1, sourceFiles_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sourceFiles_.size(); i++) {
      size += org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sourceFiles_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.ratis.shaded.com.google.api.SourceInfo)) {
      return super.equals(obj);
    }
    org.apache.ratis.shaded.com.google.api.SourceInfo other = (org.apache.ratis.shaded.com.google.api.SourceInfo) obj;

    boolean result = true;
    result = result && getSourceFilesList()
        .equals(other.getSourceFilesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSourceFilesCount() > 0) {
      hash = (37 * hash) + SOURCE_FILES_FIELD_NUMBER;
      hash = (53 * hash) + getSourceFilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      java.nio.ByteBuffer data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(byte[] data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      byte[] data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.SourceInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.ratis.shaded.com.google.api.SourceInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Source information used to create a Service Config
   * </pre>
   *
   * Protobuf type {@code google.api.SourceInfo}
   */
  public static final class Builder extends
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.SourceInfo)
      org.apache.ratis.shaded.com.google.api.SourceInfoOrBuilder {
    public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.ratis.shaded.com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_descriptor;
    }

    protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.ratis.shaded.com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.ratis.shaded.com.google.api.SourceInfo.class, org.apache.ratis.shaded.com.google.api.SourceInfo.Builder.class);
    }

    // Construct using org.apache.ratis.shaded.com.google.api.SourceInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSourceFilesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (sourceFilesBuilder_ == null) {
        sourceFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sourceFilesBuilder_.clear();
      }
      return this;
    }

    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.ratis.shaded.com.google.api.SourceInfoProto.internal_static_google_api_SourceInfo_descriptor;
    }

    public org.apache.ratis.shaded.com.google.api.SourceInfo getDefaultInstanceForType() {
      return org.apache.ratis.shaded.com.google.api.SourceInfo.getDefaultInstance();
    }

    public org.apache.ratis.shaded.com.google.api.SourceInfo build() {
      org.apache.ratis.shaded.com.google.api.SourceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.ratis.shaded.com.google.api.SourceInfo buildPartial() {
      org.apache.ratis.shaded.com.google.api.SourceInfo result = new org.apache.ratis.shaded.com.google.api.SourceInfo(this);
      int from_bitField0_ = bitField0_;
      if (sourceFilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          sourceFiles_ = java.util.Collections.unmodifiableList(sourceFiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sourceFiles_ = sourceFiles_;
      } else {
        result.sourceFiles_ = sourceFilesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        org.apache.ratis.shaded.com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        org.apache.ratis.shaded.com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        org.apache.ratis.shaded.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        org.apache.ratis.shaded.com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        org.apache.ratis.shaded.com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(org.apache.ratis.shaded.com.google.protobuf.Message other) {
      if (other instanceof org.apache.ratis.shaded.com.google.api.SourceInfo) {
        return mergeFrom((org.apache.ratis.shaded.com.google.api.SourceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.ratis.shaded.com.google.api.SourceInfo other) {
      if (other == org.apache.ratis.shaded.com.google.api.SourceInfo.getDefaultInstance()) return this;
      if (sourceFilesBuilder_ == null) {
        if (!other.sourceFiles_.isEmpty()) {
          if (sourceFiles_.isEmpty()) {
            sourceFiles_ = other.sourceFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSourceFilesIsMutable();
            sourceFiles_.addAll(other.sourceFiles_);
          }
          onChanged();
        }
      } else {
        if (!other.sourceFiles_.isEmpty()) {
          if (sourceFilesBuilder_.isEmpty()) {
            sourceFilesBuilder_.dispose();
            sourceFilesBuilder_ = null;
            sourceFiles_ = other.sourceFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sourceFilesBuilder_ = 
              org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSourceFilesFieldBuilder() : null;
          } else {
            sourceFilesBuilder_.addAllMessages(other.sourceFiles_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.ratis.shaded.com.google.api.SourceInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.ratis.shaded.com.google.api.SourceInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.ratis.shaded.com.google.protobuf.Any> sourceFiles_ =
      java.util.Collections.emptyList();
    private void ensureSourceFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        sourceFiles_ = new java.util.ArrayList<org.apache.ratis.shaded.com.google.protobuf.Any>(sourceFiles_);
        bitField0_ |= 0x00000001;
       }
    }

    private org.apache.ratis.shaded.com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.ratis.shaded.com.google.protobuf.Any, org.apache.ratis.shaded.com.google.protobuf.Any.Builder, org.apache.ratis.shaded.com.google.protobuf.AnyOrBuilder> sourceFilesBuilder_;

    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public java.util.List<org.apache.ratis.shaded.com.google.protobuf.Any> getSourceFilesList() {
      if (sourceFilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sourceFiles_);
      } else {
        return sourceFilesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public int getSourceFilesCount() {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.size();
      } else {
        return sourceFilesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.Any getSourceFiles(int index) {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.get(index);
      } else {
        return sourceFilesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder setSourceFiles(
        int index, org.apache.ratis.shaded.com.google.protobuf.Any value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.set(index, value);
        onChanged();
      } else {
        sourceFilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder setSourceFiles(
        int index, org.apache.ratis.shaded.com.google.protobuf.Any.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(org.apache.ratis.shaded.com.google.protobuf.Any value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.add(value);
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(
        int index, org.apache.ratis.shaded.com.google.protobuf.Any value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.add(index, value);
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(
        org.apache.ratis.shaded.com.google.protobuf.Any.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.add(builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addSourceFiles(
        int index, org.apache.ratis.shaded.com.google.protobuf.Any.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder addAllSourceFiles(
        java.lang.Iterable<? extends org.apache.ratis.shaded.com.google.protobuf.Any> values) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        org.apache.ratis.shaded.com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sourceFiles_);
        onChanged();
      } else {
        sourceFilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder clearSourceFiles() {
      if (sourceFilesBuilder_ == null) {
        sourceFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sourceFilesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public Builder removeSourceFiles(int index) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.remove(index);
        onChanged();
      } else {
        sourceFilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.Any.Builder getSourceFilesBuilder(
        int index) {
      return getSourceFilesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.AnyOrBuilder getSourceFilesOrBuilder(
        int index) {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.get(index);  } else {
        return sourceFilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public java.util.List<? extends org.apache.ratis.shaded.com.google.protobuf.AnyOrBuilder> 
         getSourceFilesOrBuilderList() {
      if (sourceFilesBuilder_ != null) {
        return sourceFilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sourceFiles_);
      }
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.Any.Builder addSourceFilesBuilder() {
      return getSourceFilesFieldBuilder().addBuilder(
          org.apache.ratis.shaded.com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.Any.Builder addSourceFilesBuilder(
        int index) {
      return getSourceFilesFieldBuilder().addBuilder(
          index, org.apache.ratis.shaded.com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * All files used during config generation.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any source_files = 1;</code>
     */
    public java.util.List<org.apache.ratis.shaded.com.google.protobuf.Any.Builder> 
         getSourceFilesBuilderList() {
      return getSourceFilesFieldBuilder().getBuilderList();
    }
    private org.apache.ratis.shaded.com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.ratis.shaded.com.google.protobuf.Any, org.apache.ratis.shaded.com.google.protobuf.Any.Builder, org.apache.ratis.shaded.com.google.protobuf.AnyOrBuilder> 
        getSourceFilesFieldBuilder() {
      if (sourceFilesBuilder_ == null) {
        sourceFilesBuilder_ = new org.apache.ratis.shaded.com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.ratis.shaded.com.google.protobuf.Any, org.apache.ratis.shaded.com.google.protobuf.Any.Builder, org.apache.ratis.shaded.com.google.protobuf.AnyOrBuilder>(
                sourceFiles_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        sourceFiles_ = null;
      }
      return sourceFilesBuilder_;
    }
    public final Builder setUnknownFields(
        final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.SourceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.api.SourceInfo)
  private static final org.apache.ratis.shaded.com.google.api.SourceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.ratis.shaded.com.google.api.SourceInfo();
  }

  public static org.apache.ratis.shaded.com.google.api.SourceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.ratis.shaded.com.google.protobuf.Parser<SourceInfo>
      PARSER = new org.apache.ratis.shaded.com.google.protobuf.AbstractParser<SourceInfo>() {
    public SourceInfo parsePartialFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new SourceInfo(input, extensionRegistry);
    }
  };

  public static org.apache.ratis.shaded.com.google.protobuf.Parser<SourceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.ratis.shaded.com.google.protobuf.Parser<SourceInfo> getParserForType() {
    return PARSER;
  }

  public org.apache.ratis.shaded.com.google.api.SourceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

