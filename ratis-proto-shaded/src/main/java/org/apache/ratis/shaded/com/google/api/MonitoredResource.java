// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package org.apache.ratis.shaded.com.google.api;

/**
 * <pre>
 * An object representing a resource that can be used for monitoring, logging,
 * billing, or other purposes. Examples include virtual machine instances,
 * databases, and storage devices such as disks. The `type` field identifies a
 * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object that describes the resource's
 * schema. Information in the `labels` field identifies the actual resource and
 * its attributes according to the schema. For example, a particular Compute
 * Engine VM instance could be represented by the following object, because the
 * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] for `"gce_instance"` has labels
 * `"instance_id"` and `"zone"`:
 *     { "type": "gce_instance",
 *       "labels": { "instance_id": "12345678901234",
 *                   "zone": "us-central1-a" }}
 * </pre>
 *
 * Protobuf type {@code google.api.MonitoredResource}
 */
public  final class MonitoredResource extends
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.MonitoredResource)
    MonitoredResourceOrBuilder {
  // Use MonitoredResource.newBuilder() to construct.
  private MonitoredResource(org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MonitoredResource() {
    type_ = "";
  }

  @java.lang.Override
  public final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MonitoredResource(
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

            type_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              labels_ = org.apache.ratis.shaded.com.google.protobuf.MapField.newMapField(
                  LabelsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            org.apache.ratis.shaded.com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            labels__ = input.readMessage(
                LabelsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            labels_.getMutableMap().put(
                labels__.getKey(), labels__.getValue());
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
    return org.apache.ratis.shaded.com.google.api.MonitoredResourceProto.internal_static_google_api_MonitoredResource_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected org.apache.ratis.shaded.com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetLabels();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.ratis.shaded.com.google.api.MonitoredResourceProto.internal_static_google_api_MonitoredResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.ratis.shaded.com.google.api.MonitoredResource.class, org.apache.ratis.shaded.com.google.api.MonitoredResource.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Cloud SQL database is `"cloudsql_database"`.
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      org.apache.ratis.shaded.com.google.protobuf.ByteString bs = 
          (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Cloud SQL database is `"cloudsql_database"`.
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
          org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABELS_FIELD_NUMBER = 2;
  private static final class LabelsDefaultEntryHolder {
    static final org.apache.ratis.shaded.com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            org.apache.ratis.shaded.com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.apache.ratis.shaded.com.google.api.MonitoredResourceProto.internal_static_google_api_MonitoredResource_LabelsEntry_descriptor, 
                org.apache.ratis.shaded.com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                org.apache.ratis.shaded.com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private org.apache.ratis.shaded.com.google.protobuf.MapField<
      java.lang.String, java.lang.String> labels_;
  private org.apache.ratis.shaded.com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetLabels() {
    if (labels_ == null) {
      return org.apache.ratis.shaded.com.google.protobuf.MapField.emptyMapField(
          LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public boolean containsLabels(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetLabels().getMap().containsKey(key);
  }
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Cloud SQL databases use the labels
   * `"database_id"` and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  public java.lang.String getLabelsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getTypeBytes().isEmpty()) {
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetLabels(),
        LabelsDefaultEntryHolder.defaultEntry,
        2);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetLabels().getMap().entrySet()) {
      org.apache.ratis.shaded.com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      labels__ = LabelsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, labels__);
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
    if (!(obj instanceof org.apache.ratis.shaded.com.google.api.MonitoredResource)) {
      return super.equals(obj);
    }
    org.apache.ratis.shaded.com.google.api.MonitoredResource other = (org.apache.ratis.shaded.com.google.api.MonitoredResource) obj;

    boolean result = true;
    result = result && getType()
        .equals(other.getType());
    result = result && internalGetLabels().equals(
        other.internalGetLabels());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
      java.nio.ByteBuffer data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(byte[] data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
      byte[] data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.MonitoredResource parseFrom(
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
  public static Builder newBuilder(org.apache.ratis.shaded.com.google.api.MonitoredResource prototype) {
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
   * An object representing a resource that can be used for monitoring, logging,
   * billing, or other purposes. Examples include virtual machine instances,
   * databases, and storage devices such as disks. The `type` field identifies a
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object that describes the resource's
   * schema. Information in the `labels` field identifies the actual resource and
   * its attributes according to the schema. For example, a particular Compute
   * Engine VM instance could be represented by the following object, because the
   * [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] for `"gce_instance"` has labels
   * `"instance_id"` and `"zone"`:
   *     { "type": "gce_instance",
   *       "labels": { "instance_id": "12345678901234",
   *                   "zone": "us-central1-a" }}
   * </pre>
   *
   * Protobuf type {@code google.api.MonitoredResource}
   */
  public static final class Builder extends
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.MonitoredResource)
      org.apache.ratis.shaded.com.google.api.MonitoredResourceOrBuilder {
    public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.ratis.shaded.com.google.api.MonitoredResourceProto.internal_static_google_api_MonitoredResource_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected org.apache.ratis.shaded.com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected org.apache.ratis.shaded.com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.ratis.shaded.com.google.api.MonitoredResourceProto.internal_static_google_api_MonitoredResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.ratis.shaded.com.google.api.MonitoredResource.class, org.apache.ratis.shaded.com.google.api.MonitoredResource.Builder.class);
    }

    // Construct using org.apache.ratis.shaded.com.google.api.MonitoredResource.newBuilder()
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
      type_ = "";

      internalGetMutableLabels().clear();
      return this;
    }

    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.ratis.shaded.com.google.api.MonitoredResourceProto.internal_static_google_api_MonitoredResource_descriptor;
    }

    public org.apache.ratis.shaded.com.google.api.MonitoredResource getDefaultInstanceForType() {
      return org.apache.ratis.shaded.com.google.api.MonitoredResource.getDefaultInstance();
    }

    public org.apache.ratis.shaded.com.google.api.MonitoredResource build() {
      org.apache.ratis.shaded.com.google.api.MonitoredResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.ratis.shaded.com.google.api.MonitoredResource buildPartial() {
      org.apache.ratis.shaded.com.google.api.MonitoredResource result = new org.apache.ratis.shaded.com.google.api.MonitoredResource(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.type_ = type_;
      result.labels_ = internalGetLabels();
      result.labels_.makeImmutable();
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
      if (other instanceof org.apache.ratis.shaded.com.google.api.MonitoredResource) {
        return mergeFrom((org.apache.ratis.shaded.com.google.api.MonitoredResource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.ratis.shaded.com.google.api.MonitoredResource other) {
      if (other == org.apache.ratis.shaded.com.google.api.MonitoredResource.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      internalGetMutableLabels().mergeFrom(
          other.internalGetLabels());
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
      org.apache.ratis.shaded.com.google.api.MonitoredResource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.ratis.shaded.com.google.api.MonitoredResource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString bs =
            (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
            org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The monitored resource type. This field must match
     * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
     * example, the type of a Cloud SQL database is `"cloudsql_database"`.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public Builder setTypeBytes(
        org.apache.ratis.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private org.apache.ratis.shaded.com.google.protobuf.MapField<
        java.lang.String, java.lang.String> labels_;
    private org.apache.ratis.shaded.com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetLabels() {
      if (labels_ == null) {
        return org.apache.ratis.shaded.com.google.protobuf.MapField.emptyMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }
    private org.apache.ratis.shaded.com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableLabels() {
      onChanged();;
      if (labels_ == null) {
        labels_ = org.apache.ratis.shaded.com.google.protobuf.MapField.newMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public boolean containsLabels(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetLabels().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLabelsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public java.lang.String getLabelsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public java.lang.String getLabelsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      internalGetMutableLabels().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public Builder removeLabels(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableLabels().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableLabels() {
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder putLabels(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableLabels().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Required. Values for all of the labels listed in the associated monitored
     * resource descriptor. For example, Cloud SQL databases use the labels
     * `"database_id"` and `"zone"`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */

    public Builder putAllLabels(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:google.api.MonitoredResource)
  }

  // @@protoc_insertion_point(class_scope:google.api.MonitoredResource)
  private static final org.apache.ratis.shaded.com.google.api.MonitoredResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.ratis.shaded.com.google.api.MonitoredResource();
  }

  public static org.apache.ratis.shaded.com.google.api.MonitoredResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.ratis.shaded.com.google.protobuf.Parser<MonitoredResource>
      PARSER = new org.apache.ratis.shaded.com.google.protobuf.AbstractParser<MonitoredResource>() {
    public MonitoredResource parsePartialFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new MonitoredResource(input, extensionRegistry);
    }
  };

  public static org.apache.ratis.shaded.com.google.protobuf.Parser<MonitoredResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.ratis.shaded.com.google.protobuf.Parser<MonitoredResource> getParserForType() {
    return PARSER;
  }

  public org.apache.ratis.shaded.com.google.api.MonitoredResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

