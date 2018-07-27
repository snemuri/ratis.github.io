// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package org.apache.ratis.shaded.com.google.api;

/**
 * <pre>
 * User-defined authentication requirements, including support for
 * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * </pre>
 *
 * Protobuf type {@code google.api.AuthRequirement}
 */
public  final class AuthRequirement extends
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.AuthRequirement)
    AuthRequirementOrBuilder {
  // Use AuthRequirement.newBuilder() to construct.
  private AuthRequirement(org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthRequirement() {
    providerId_ = "";
    audiences_ = "";
  }

  @java.lang.Override
  public final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AuthRequirement(
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

            providerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            audiences_ = s;
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
    return org.apache.ratis.shaded.com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
  }

  protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.ratis.shaded.com.google.api.AuthProto.internal_static_google_api_AuthRequirement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.ratis.shaded.com.google.api.AuthRequirement.class, org.apache.ratis.shaded.com.google.api.AuthRequirement.Builder.class);
  }

  public static final int PROVIDER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object providerId_;
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>string provider_id = 1;</code>
   */
  public java.lang.String getProviderId() {
    java.lang.Object ref = providerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      org.apache.ratis.shaded.com.google.protobuf.ByteString bs = 
          (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      providerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>string provider_id = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.ByteString
      getProviderIdBytes() {
    java.lang.Object ref = providerId_;
    if (ref instanceof java.lang.String) {
      org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
          org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      providerId_ = b;
      return b;
    } else {
      return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIENCES_FIELD_NUMBER = 2;
  private volatile java.lang.Object audiences_;
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>string audiences = 2;</code>
   */
  public java.lang.String getAudiences() {
    java.lang.Object ref = audiences_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      org.apache.ratis.shaded.com.google.protobuf.ByteString bs = 
          (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audiences_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>string audiences = 2;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.ByteString
      getAudiencesBytes() {
    java.lang.Object ref = audiences_;
    if (ref instanceof java.lang.String) {
      org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
          org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      audiences_ = b;
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
    if (!getProviderIdBytes().isEmpty()) {
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, providerId_);
    }
    if (!getAudiencesBytes().isEmpty()) {
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audiences_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProviderIdBytes().isEmpty()) {
      size += org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, providerId_);
    }
    if (!getAudiencesBytes().isEmpty()) {
      size += org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.computeStringSize(2, audiences_);
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
    if (!(obj instanceof org.apache.ratis.shaded.com.google.api.AuthRequirement)) {
      return super.equals(obj);
    }
    org.apache.ratis.shaded.com.google.api.AuthRequirement other = (org.apache.ratis.shaded.com.google.api.AuthRequirement) obj;

    boolean result = true;
    result = result && getProviderId()
        .equals(other.getProviderId());
    result = result && getAudiences()
        .equals(other.getAudiences());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROVIDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProviderId().hashCode();
    hash = (37 * hash) + AUDIENCES_FIELD_NUMBER;
    hash = (53 * hash) + getAudiences().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
      java.nio.ByteBuffer data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(byte[] data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
      byte[] data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.AuthRequirement parseFrom(
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
  public static Builder newBuilder(org.apache.ratis.shaded.com.google.api.AuthRequirement prototype) {
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
   * User-defined authentication requirements, including support for
   * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
   * </pre>
   *
   * Protobuf type {@code google.api.AuthRequirement}
   */
  public static final class Builder extends
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.AuthRequirement)
      org.apache.ratis.shaded.com.google.api.AuthRequirementOrBuilder {
    public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.ratis.shaded.com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
    }

    protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.ratis.shaded.com.google.api.AuthProto.internal_static_google_api_AuthRequirement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.ratis.shaded.com.google.api.AuthRequirement.class, org.apache.ratis.shaded.com.google.api.AuthRequirement.Builder.class);
    }

    // Construct using org.apache.ratis.shaded.com.google.api.AuthRequirement.newBuilder()
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
      providerId_ = "";

      audiences_ = "";

      return this;
    }

    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.ratis.shaded.com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
    }

    public org.apache.ratis.shaded.com.google.api.AuthRequirement getDefaultInstanceForType() {
      return org.apache.ratis.shaded.com.google.api.AuthRequirement.getDefaultInstance();
    }

    public org.apache.ratis.shaded.com.google.api.AuthRequirement build() {
      org.apache.ratis.shaded.com.google.api.AuthRequirement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.ratis.shaded.com.google.api.AuthRequirement buildPartial() {
      org.apache.ratis.shaded.com.google.api.AuthRequirement result = new org.apache.ratis.shaded.com.google.api.AuthRequirement(this);
      result.providerId_ = providerId_;
      result.audiences_ = audiences_;
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
      if (other instanceof org.apache.ratis.shaded.com.google.api.AuthRequirement) {
        return mergeFrom((org.apache.ratis.shaded.com.google.api.AuthRequirement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.ratis.shaded.com.google.api.AuthRequirement other) {
      if (other == org.apache.ratis.shaded.com.google.api.AuthRequirement.getDefaultInstance()) return this;
      if (!other.getProviderId().isEmpty()) {
        providerId_ = other.providerId_;
        onChanged();
      }
      if (!other.getAudiences().isEmpty()) {
        audiences_ = other.audiences_;
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
      org.apache.ratis.shaded.com.google.api.AuthRequirement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.ratis.shaded.com.google.api.AuthRequirement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object providerId_ = "";
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     */
    public java.lang.String getProviderId() {
      java.lang.Object ref = providerId_;
      if (!(ref instanceof java.lang.String)) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString bs =
            (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        providerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.ByteString
        getProviderIdBytes() {
      java.lang.Object ref = providerId_;
      if (ref instanceof String) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
            org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        providerId_ = b;
        return b;
      } else {
        return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     */
    public Builder setProviderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      providerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     */
    public Builder clearProviderId() {
      
      providerId_ = getDefaultInstance().getProviderId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>string provider_id = 1;</code>
     */
    public Builder setProviderIdBytes(
        org.apache.ratis.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      providerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object audiences_ = "";
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     */
    public java.lang.String getAudiences() {
      java.lang.Object ref = audiences_;
      if (!(ref instanceof java.lang.String)) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString bs =
            (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audiences_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.ByteString
        getAudiencesBytes() {
      java.lang.Object ref = audiences_;
      if (ref instanceof String) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
            org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        audiences_ = b;
        return b;
      } else {
        return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     */
    public Builder setAudiences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      audiences_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     */
    public Builder clearAudiences() {
      
      audiences_ = getDefaultInstance().getAudiences();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>string audiences = 2;</code>
     */
    public Builder setAudiencesBytes(
        org.apache.ratis.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      audiences_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.api.AuthRequirement)
  }

  // @@protoc_insertion_point(class_scope:google.api.AuthRequirement)
  private static final org.apache.ratis.shaded.com.google.api.AuthRequirement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.ratis.shaded.com.google.api.AuthRequirement();
  }

  public static org.apache.ratis.shaded.com.google.api.AuthRequirement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.ratis.shaded.com.google.protobuf.Parser<AuthRequirement>
      PARSER = new org.apache.ratis.shaded.com.google.protobuf.AbstractParser<AuthRequirement>() {
    public AuthRequirement parsePartialFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new AuthRequirement(input, extensionRegistry);
    }
  };

  public static org.apache.ratis.shaded.com.google.protobuf.Parser<AuthRequirement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.ratis.shaded.com.google.protobuf.Parser<AuthRequirement> getParserForType() {
    return PARSER;
  }

  public org.apache.ratis.shaded.com.google.api.AuthRequirement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
