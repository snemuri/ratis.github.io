// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package org.apache.ratis.shaded.com.google.rpc;

/**
 * <pre>
 * Describes when the clients can retry a failed request. Clients could ignore
 * the recommendation here or retry when this information is missing from error
 * responses.
 * It's always recommended that clients should use exponential backoff when
 * retrying.
 * Clients should wait until `retry_delay` amount of time has passed since
 * receiving the error response before retrying.  If retrying requests also
 * fail, clients should use an exponential backoff scheme to gradually increase
 * the delay between retries based on `retry_delay`, until either a maximum
 * number of retires have been reached or a maximum retry delay cap has been
 * reached.
 * </pre>
 *
 * Protobuf type {@code google.rpc.RetryInfo}
 */
public  final class RetryInfo extends
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.rpc.RetryInfo)
    RetryInfoOrBuilder {
  // Use RetryInfo.newBuilder() to construct.
  private RetryInfo(org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetryInfo() {
  }

  @java.lang.Override
  public final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RetryInfo(
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
            org.apache.ratis.shaded.com.google.protobuf.Duration.Builder subBuilder = null;
            if (retryDelay_ != null) {
              subBuilder = retryDelay_.toBuilder();
            }
            retryDelay_ = input.readMessage(org.apache.ratis.shaded.com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(retryDelay_);
              retryDelay_ = subBuilder.buildPartial();
            }

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
      makeExtensionsImmutable();
    }
  }
  public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
  }

  protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.ratis.shaded.com.google.rpc.RetryInfo.class, org.apache.ratis.shaded.com.google.rpc.RetryInfo.Builder.class);
  }

  public static final int RETRY_DELAY_FIELD_NUMBER = 1;
  private org.apache.ratis.shaded.com.google.protobuf.Duration retryDelay_;
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  public boolean hasRetryDelay() {
    return retryDelay_ != null;
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.Duration getRetryDelay() {
    return retryDelay_ == null ? org.apache.ratis.shaded.com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
  }
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
    return getRetryDelay();
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
    if (retryDelay_ != null) {
      output.writeMessage(1, getRetryDelay());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retryDelay_ != null) {
      size += org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRetryDelay());
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
    if (!(obj instanceof org.apache.ratis.shaded.com.google.rpc.RetryInfo)) {
      return super.equals(obj);
    }
    org.apache.ratis.shaded.com.google.rpc.RetryInfo other = (org.apache.ratis.shaded.com.google.rpc.RetryInfo) obj;

    boolean result = true;
    result = result && (hasRetryDelay() == other.hasRetryDelay());
    if (hasRetryDelay()) {
      result = result && getRetryDelay()
          .equals(other.getRetryDelay());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRetryDelay()) {
      hash = (37 * hash) + RETRY_DELAY_FIELD_NUMBER;
      hash = (53 * hash) + getRetryDelay().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
      java.nio.ByteBuffer data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(byte[] data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
      byte[] data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo parseFrom(
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
  public static Builder newBuilder(org.apache.ratis.shaded.com.google.rpc.RetryInfo prototype) {
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
   * Describes when the clients can retry a failed request. Clients could ignore
   * the recommendation here or retry when this information is missing from error
   * responses.
   * It's always recommended that clients should use exponential backoff when
   * retrying.
   * Clients should wait until `retry_delay` amount of time has passed since
   * receiving the error response before retrying.  If retrying requests also
   * fail, clients should use an exponential backoff scheme to gradually increase
   * the delay between retries based on `retry_delay`, until either a maximum
   * number of retires have been reached or a maximum retry delay cap has been
   * reached.
   * </pre>
   *
   * Protobuf type {@code google.rpc.RetryInfo}
   */
  public static final class Builder extends
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.RetryInfo)
      org.apache.ratis.shaded.com.google.rpc.RetryInfoOrBuilder {
    public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
    }

    protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.ratis.shaded.com.google.rpc.RetryInfo.class, org.apache.ratis.shaded.com.google.rpc.RetryInfo.Builder.class);
    }

    // Construct using org.apache.ratis.shaded.com.google.rpc.RetryInfo.newBuilder()
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
      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }
      return this;
    }

    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.ratis.shaded.com.google.rpc.ErrorDetailsProto.internal_static_google_rpc_RetryInfo_descriptor;
    }

    public org.apache.ratis.shaded.com.google.rpc.RetryInfo getDefaultInstanceForType() {
      return org.apache.ratis.shaded.com.google.rpc.RetryInfo.getDefaultInstance();
    }

    public org.apache.ratis.shaded.com.google.rpc.RetryInfo build() {
      org.apache.ratis.shaded.com.google.rpc.RetryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.ratis.shaded.com.google.rpc.RetryInfo buildPartial() {
      org.apache.ratis.shaded.com.google.rpc.RetryInfo result = new org.apache.ratis.shaded.com.google.rpc.RetryInfo(this);
      if (retryDelayBuilder_ == null) {
        result.retryDelay_ = retryDelay_;
      } else {
        result.retryDelay_ = retryDelayBuilder_.build();
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
      if (other instanceof org.apache.ratis.shaded.com.google.rpc.RetryInfo) {
        return mergeFrom((org.apache.ratis.shaded.com.google.rpc.RetryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.ratis.shaded.com.google.rpc.RetryInfo other) {
      if (other == org.apache.ratis.shaded.com.google.rpc.RetryInfo.getDefaultInstance()) return this;
      if (other.hasRetryDelay()) {
        mergeRetryDelay(other.getRetryDelay());
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
      org.apache.ratis.shaded.com.google.rpc.RetryInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.ratis.shaded.com.google.rpc.RetryInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.apache.ratis.shaded.com.google.protobuf.Duration retryDelay_ = null;
    private org.apache.ratis.shaded.com.google.protobuf.SingleFieldBuilderV3<
        org.apache.ratis.shaded.com.google.protobuf.Duration, org.apache.ratis.shaded.com.google.protobuf.Duration.Builder, org.apache.ratis.shaded.com.google.protobuf.DurationOrBuilder> retryDelayBuilder_;
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public boolean hasRetryDelay() {
      return retryDelayBuilder_ != null || retryDelay_ != null;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.Duration getRetryDelay() {
      if (retryDelayBuilder_ == null) {
        return retryDelay_ == null ? org.apache.ratis.shaded.com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      } else {
        return retryDelayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(org.apache.ratis.shaded.com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retryDelay_ = value;
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder setRetryDelay(
        org.apache.ratis.shaded.com.google.protobuf.Duration.Builder builderForValue) {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = builderForValue.build();
        onChanged();
      } else {
        retryDelayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder mergeRetryDelay(org.apache.ratis.shaded.com.google.protobuf.Duration value) {
      if (retryDelayBuilder_ == null) {
        if (retryDelay_ != null) {
          retryDelay_ =
            org.apache.ratis.shaded.com.google.protobuf.Duration.newBuilder(retryDelay_).mergeFrom(value).buildPartial();
        } else {
          retryDelay_ = value;
        }
        onChanged();
      } else {
        retryDelayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public Builder clearRetryDelay() {
      if (retryDelayBuilder_ == null) {
        retryDelay_ = null;
        onChanged();
      } else {
        retryDelay_ = null;
        retryDelayBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.Duration.Builder getRetryDelayBuilder() {
      
      onChanged();
      return getRetryDelayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder() {
      if (retryDelayBuilder_ != null) {
        return retryDelayBuilder_.getMessageOrBuilder();
      } else {
        return retryDelay_ == null ?
            org.apache.ratis.shaded.com.google.protobuf.Duration.getDefaultInstance() : retryDelay_;
      }
    }
    /**
     * <pre>
     * Clients should wait at least this long between retrying the same request.
     * </pre>
     *
     * <code>.google.protobuf.Duration retry_delay = 1;</code>
     */
    private org.apache.ratis.shaded.com.google.protobuf.SingleFieldBuilderV3<
        org.apache.ratis.shaded.com.google.protobuf.Duration, org.apache.ratis.shaded.com.google.protobuf.Duration.Builder, org.apache.ratis.shaded.com.google.protobuf.DurationOrBuilder> 
        getRetryDelayFieldBuilder() {
      if (retryDelayBuilder_ == null) {
        retryDelayBuilder_ = new org.apache.ratis.shaded.com.google.protobuf.SingleFieldBuilderV3<
            org.apache.ratis.shaded.com.google.protobuf.Duration, org.apache.ratis.shaded.com.google.protobuf.Duration.Builder, org.apache.ratis.shaded.com.google.protobuf.DurationOrBuilder>(
                getRetryDelay(),
                getParentForChildren(),
                isClean());
        retryDelay_ = null;
      }
      return retryDelayBuilder_;
    }
    public final Builder setUnknownFields(
        final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.rpc.RetryInfo)
  }

  // @@protoc_insertion_point(class_scope:google.rpc.RetryInfo)
  private static final org.apache.ratis.shaded.com.google.rpc.RetryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.ratis.shaded.com.google.rpc.RetryInfo();
  }

  public static org.apache.ratis.shaded.com.google.rpc.RetryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.ratis.shaded.com.google.protobuf.Parser<RetryInfo>
      PARSER = new org.apache.ratis.shaded.com.google.protobuf.AbstractParser<RetryInfo>() {
    public RetryInfo parsePartialFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new RetryInfo(input, extensionRegistry);
    }
  };

  public static org.apache.ratis.shaded.com.google.protobuf.Parser<RetryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.ratis.shaded.com.google.protobuf.Parser<RetryInfo> getParserForType() {
    return PARSER;
  }

  public org.apache.ratis.shaded.com.google.rpc.RetryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

