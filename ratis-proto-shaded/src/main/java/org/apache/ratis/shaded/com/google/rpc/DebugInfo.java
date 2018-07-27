// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package org.apache.ratis.shaded.com.google.rpc;

/**
 * <pre>
 * Describes additional debugging info.
 * </pre>
 *
 * Protobuf type {@code google.rpc.DebugInfo}
 */
public  final class DebugInfo extends
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.rpc.DebugInfo)
    DebugInfoOrBuilder {
  // Use DebugInfo.newBuilder() to construct.
  private DebugInfo(org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DebugInfo() {
    stackEntries_ = org.apache.ratis.shaded.com.google.protobuf.LazyStringArrayList.EMPTY;
    detail_ = "";
  }

  @java.lang.Override
  public final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DebugInfo(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              stackEntries_ = new org.apache.ratis.shaded.com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            stackEntries_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            detail_ = s;
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
        stackEntries_ = stackEntries_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_descriptor;
  }

  protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.ratis.shaded.com.google.rpc.DebugInfo.class, org.apache.ratis.shaded.com.google.rpc.DebugInfo.Builder.class);
  }

  private int bitField0_;
  public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
  private org.apache.ratis.shaded.com.google.protobuf.LazyStringList stackEntries_;
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.ProtocolStringList
      getStackEntriesList() {
    return stackEntries_;
  }
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public int getStackEntriesCount() {
    return stackEntries_.size();
  }
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public java.lang.String getStackEntries(int index) {
    return stackEntries_.get(index);
  }
  /**
   * <pre>
   * The stack trace entries indicating where the error occurred.
   * </pre>
   *
   * <code>repeated string stack_entries = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.ByteString
      getStackEntriesBytes(int index) {
    return stackEntries_.getByteString(index);
  }

  public static final int DETAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object detail_;
  /**
   * <pre>
   * Additional debugging information provided by the server.
   * </pre>
   *
   * <code>string detail = 2;</code>
   */
  public java.lang.String getDetail() {
    java.lang.Object ref = detail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      org.apache.ratis.shaded.com.google.protobuf.ByteString bs = 
          (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detail_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Additional debugging information provided by the server.
   * </pre>
   *
   * <code>string detail = 2;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.ByteString
      getDetailBytes() {
    java.lang.Object ref = detail_;
    if (ref instanceof java.lang.String) {
      org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
          org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detail_ = b;
      return b;
    } else {
      return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < stackEntries_.size(); i++) {
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stackEntries_.getRaw(i));
    }
    if (!getDetailBytes().isEmpty()) {
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 2, detail_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < stackEntries_.size(); i++) {
        dataSize += computeStringSizeNoTag(stackEntries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStackEntriesList().size();
    }
    if (!getDetailBytes().isEmpty()) {
      size += org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.computeStringSize(2, detail_);
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
    if (!(obj instanceof org.apache.ratis.shaded.com.google.rpc.DebugInfo)) {
      return super.equals(obj);
    }
    org.apache.ratis.shaded.com.google.rpc.DebugInfo other = (org.apache.ratis.shaded.com.google.rpc.DebugInfo) obj;

    boolean result = true;
    result = result && getStackEntriesList()
        .equals(other.getStackEntriesList());
    result = result && getDetail()
        .equals(other.getDetail());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStackEntriesCount() > 0) {
      hash = (37 * hash) + STACK_ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getStackEntriesList().hashCode();
    }
    hash = (37 * hash) + DETAIL_FIELD_NUMBER;
    hash = (53 * hash) + getDetail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
      java.nio.ByteBuffer data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(byte[] data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
      byte[] data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo parseFrom(
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
  public static Builder newBuilder(org.apache.ratis.shaded.com.google.rpc.DebugInfo prototype) {
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
   * Describes additional debugging info.
   * </pre>
   *
   * Protobuf type {@code google.rpc.DebugInfo}
   */
  public static final class Builder extends
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.DebugInfo)
      org.apache.ratis.shaded.com.google.rpc.DebugInfoOrBuilder {
    public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_descriptor;
    }

    protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.ratis.shaded.com.google.rpc.DebugInfo.class, org.apache.ratis.shaded.com.google.rpc.DebugInfo.Builder.class);
    }

    // Construct using org.apache.ratis.shaded.com.google.rpc.DebugInfo.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      stackEntries_ = org.apache.ratis.shaded.com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      detail_ = "";

      return this;
    }

    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_DebugInfo_descriptor;
    }

    public org.apache.ratis.shaded.com.google.rpc.DebugInfo getDefaultInstanceForType() {
      return org.apache.ratis.shaded.com.google.rpc.DebugInfo.getDefaultInstance();
    }

    public org.apache.ratis.shaded.com.google.rpc.DebugInfo build() {
      org.apache.ratis.shaded.com.google.rpc.DebugInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.ratis.shaded.com.google.rpc.DebugInfo buildPartial() {
      org.apache.ratis.shaded.com.google.rpc.DebugInfo result = new org.apache.ratis.shaded.com.google.rpc.DebugInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        stackEntries_ = stackEntries_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.stackEntries_ = stackEntries_;
      result.detail_ = detail_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.apache.ratis.shaded.com.google.rpc.DebugInfo) {
        return mergeFrom((org.apache.ratis.shaded.com.google.rpc.DebugInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.ratis.shaded.com.google.rpc.DebugInfo other) {
      if (other == org.apache.ratis.shaded.com.google.rpc.DebugInfo.getDefaultInstance()) return this;
      if (!other.stackEntries_.isEmpty()) {
        if (stackEntries_.isEmpty()) {
          stackEntries_ = other.stackEntries_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStackEntriesIsMutable();
          stackEntries_.addAll(other.stackEntries_);
        }
        onChanged();
      }
      if (!other.getDetail().isEmpty()) {
        detail_ = other.detail_;
        onChanged();
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
      org.apache.ratis.shaded.com.google.rpc.DebugInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.ratis.shaded.com.google.rpc.DebugInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.apache.ratis.shaded.com.google.protobuf.LazyStringList stackEntries_ = org.apache.ratis.shaded.com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStackEntriesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        stackEntries_ = new org.apache.ratis.shaded.com.google.protobuf.LazyStringArrayList(stackEntries_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.ProtocolStringList
        getStackEntriesList() {
      return stackEntries_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public int getStackEntriesCount() {
      return stackEntries_.size();
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public java.lang.String getStackEntries(int index) {
      return stackEntries_.get(index);
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.ByteString
        getStackEntriesBytes(int index) {
      return stackEntries_.getByteString(index);
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder setStackEntries(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStackEntriesIsMutable();
      stackEntries_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder addStackEntries(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStackEntriesIsMutable();
      stackEntries_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder addAllStackEntries(
        java.lang.Iterable<java.lang.String> values) {
      ensureStackEntriesIsMutable();
      org.apache.ratis.shaded.com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, stackEntries_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder clearStackEntries() {
      stackEntries_ = org.apache.ratis.shaded.com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The stack trace entries indicating where the error occurred.
     * </pre>
     *
     * <code>repeated string stack_entries = 1;</code>
     */
    public Builder addStackEntriesBytes(
        org.apache.ratis.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStackEntriesIsMutable();
      stackEntries_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object detail_ = "";
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public java.lang.String getDetail() {
      java.lang.Object ref = detail_;
      if (!(ref instanceof java.lang.String)) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString bs =
            (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.ByteString
        getDetailBytes() {
      java.lang.Object ref = detail_;
      if (ref instanceof String) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
            org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detail_ = b;
        return b;
      } else {
        return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public Builder setDetail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      detail_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public Builder clearDetail() {
      
      detail_ = getDefaultInstance().getDetail();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional debugging information provided by the server.
     * </pre>
     *
     * <code>string detail = 2;</code>
     */
    public Builder setDetailBytes(
        org.apache.ratis.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      detail_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.rpc.DebugInfo)
  }

  // @@protoc_insertion_point(class_scope:google.rpc.DebugInfo)
  private static final org.apache.ratis.shaded.com.google.rpc.DebugInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.ratis.shaded.com.google.rpc.DebugInfo();
  }

  public static org.apache.ratis.shaded.com.google.rpc.DebugInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.ratis.shaded.com.google.protobuf.Parser<DebugInfo>
      PARSER = new org.apache.ratis.shaded.com.google.protobuf.AbstractParser<DebugInfo>() {
    public DebugInfo parsePartialFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new DebugInfo(input, extensionRegistry);
    }
  };

  public static org.apache.ratis.shaded.com.google.protobuf.Parser<DebugInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.ratis.shaded.com.google.protobuf.Parser<DebugInfo> getParserForType() {
    return PARSER;
  }

  public org.apache.ratis.shaded.com.google.rpc.DebugInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
