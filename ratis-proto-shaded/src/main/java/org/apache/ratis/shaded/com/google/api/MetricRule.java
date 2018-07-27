// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/quota.proto

package org.apache.ratis.shaded.com.google.api;

/**
 * <pre>
 * Bind API methods to metrics. Binding a method to a metric causes that
 * metric's configured quota, billing, and monitoring behaviors to apply to the
 * method call.
 * Used by metric-based quotas only.
 * </pre>
 *
 * Protobuf type {@code google.api.MetricRule}
 */
public  final class MetricRule extends
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.MetricRule)
    MetricRuleOrBuilder {
  // Use MetricRule.newBuilder() to construct.
  private MetricRule(org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetricRule() {
    selector_ = "";
  }

  @java.lang.Override
  public final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MetricRule(
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

            selector_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              metricCosts_ = org.apache.ratis.shaded.com.google.protobuf.MapField.newMapField(
                  MetricCostsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            org.apache.ratis.shaded.com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
            metricCosts__ = input.readMessage(
                MetricCostsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            metricCosts_.getMutableMap().put(
                metricCosts__.getKey(), metricCosts__.getValue());
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
    return org.apache.ratis.shaded.com.google.api.QuotaProto.internal_static_google_api_MetricRule_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected org.apache.ratis.shaded.com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetMetricCosts();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.ratis.shaded.com.google.api.QuotaProto.internal_static_google_api_MetricRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.ratis.shaded.com.google.api.MetricRule.class, org.apache.ratis.shaded.com.google.api.MetricRule.Builder.class);
  }

  private int bitField0_;
  public static final int SELECTOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object selector_;
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      org.apache.ratis.shaded.com.google.protobuf.ByteString bs = 
          (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public org.apache.ratis.shaded.com.google.protobuf.ByteString
      getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
          org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_COSTS_FIELD_NUMBER = 2;
  private static final class MetricCostsDefaultEntryHolder {
    static final org.apache.ratis.shaded.com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            org.apache.ratis.shaded.com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                org.apache.ratis.shaded.com.google.api.QuotaProto.internal_static_google_api_MetricRule_MetricCostsEntry_descriptor, 
                org.apache.ratis.shaded.com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                org.apache.ratis.shaded.com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private org.apache.ratis.shaded.com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> metricCosts_;
  private org.apache.ratis.shaded.com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetMetricCosts() {
    if (metricCosts_ == null) {
      return org.apache.ratis.shaded.com.google.protobuf.MapField.emptyMapField(
          MetricCostsDefaultEntryHolder.defaultEntry);
    }
    return metricCosts_;
  }

  public int getMetricCostsCount() {
    return internalGetMetricCosts().getMap().size();
  }
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */

  public boolean containsMetricCosts(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetMetricCosts().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMetricCostsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getMetricCosts() {
    return getMetricCostsMap();
  }
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.Long> getMetricCostsMap() {
    return internalGetMetricCosts().getMap();
  }
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */

  public long getMetricCostsOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetMetricCosts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */

  public long getMetricCostsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetMetricCosts().getMap();
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
    if (!getSelectorBytes().isEmpty()) {
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMetricCosts(),
        MetricCostsDefaultEntryHolder.defaultEntry,
        2);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSelectorBytes().isEmpty()) {
      size += org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetMetricCosts().getMap().entrySet()) {
      org.apache.ratis.shaded.com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      metricCosts__ = MetricCostsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, metricCosts__);
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
    if (!(obj instanceof org.apache.ratis.shaded.com.google.api.MetricRule)) {
      return super.equals(obj);
    }
    org.apache.ratis.shaded.com.google.api.MetricRule other = (org.apache.ratis.shaded.com.google.api.MetricRule) obj;

    boolean result = true;
    result = result && getSelector()
        .equals(other.getSelector());
    result = result && internalGetMetricCosts().equals(
        other.internalGetMetricCosts());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    if (!internalGetMetricCosts().getMap().isEmpty()) {
      hash = (37 * hash) + METRIC_COSTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetricCosts().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
      java.nio.ByteBuffer data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(byte[] data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
      byte[] data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.api.MetricRule parseFrom(
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
  public static Builder newBuilder(org.apache.ratis.shaded.com.google.api.MetricRule prototype) {
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
   * Bind API methods to metrics. Binding a method to a metric causes that
   * metric's configured quota, billing, and monitoring behaviors to apply to the
   * method call.
   * Used by metric-based quotas only.
   * </pre>
   *
   * Protobuf type {@code google.api.MetricRule}
   */
  public static final class Builder extends
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.MetricRule)
      org.apache.ratis.shaded.com.google.api.MetricRuleOrBuilder {
    public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.ratis.shaded.com.google.api.QuotaProto.internal_static_google_api_MetricRule_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected org.apache.ratis.shaded.com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMetricCosts();
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
          return internalGetMutableMetricCosts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.ratis.shaded.com.google.api.QuotaProto.internal_static_google_api_MetricRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.ratis.shaded.com.google.api.MetricRule.class, org.apache.ratis.shaded.com.google.api.MetricRule.Builder.class);
    }

    // Construct using org.apache.ratis.shaded.com.google.api.MetricRule.newBuilder()
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
      selector_ = "";

      internalGetMutableMetricCosts().clear();
      return this;
    }

    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.ratis.shaded.com.google.api.QuotaProto.internal_static_google_api_MetricRule_descriptor;
    }

    public org.apache.ratis.shaded.com.google.api.MetricRule getDefaultInstanceForType() {
      return org.apache.ratis.shaded.com.google.api.MetricRule.getDefaultInstance();
    }

    public org.apache.ratis.shaded.com.google.api.MetricRule build() {
      org.apache.ratis.shaded.com.google.api.MetricRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.ratis.shaded.com.google.api.MetricRule buildPartial() {
      org.apache.ratis.shaded.com.google.api.MetricRule result = new org.apache.ratis.shaded.com.google.api.MetricRule(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.selector_ = selector_;
      result.metricCosts_ = internalGetMetricCosts();
      result.metricCosts_.makeImmutable();
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
      if (other instanceof org.apache.ratis.shaded.com.google.api.MetricRule) {
        return mergeFrom((org.apache.ratis.shaded.com.google.api.MetricRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.ratis.shaded.com.google.api.MetricRule other) {
      if (other == org.apache.ratis.shaded.com.google.api.MetricRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        onChanged();
      }
      internalGetMutableMetricCosts().mergeFrom(
          other.internalGetMetricCosts());
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
      org.apache.ratis.shaded.com.google.api.MetricRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.ratis.shaded.com.google.api.MetricRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object selector_ = "";
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString bs =
            (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public org.apache.ratis.shaded.com.google.protobuf.ByteString
        getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        org.apache.ratis.shaded.com.google.protobuf.ByteString b = 
            org.apache.ratis.shaded.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (org.apache.ratis.shaded.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      selector_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder clearSelector() {
      
      selector_ = getDefaultInstance().getSelector();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelectorBytes(
        org.apache.ratis.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      selector_ = value;
      onChanged();
      return this;
    }

    private org.apache.ratis.shaded.com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> metricCosts_;
    private org.apache.ratis.shaded.com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetMetricCosts() {
      if (metricCosts_ == null) {
        return org.apache.ratis.shaded.com.google.protobuf.MapField.emptyMapField(
            MetricCostsDefaultEntryHolder.defaultEntry);
      }
      return metricCosts_;
    }
    private org.apache.ratis.shaded.com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetMutableMetricCosts() {
      onChanged();;
      if (metricCosts_ == null) {
        metricCosts_ = org.apache.ratis.shaded.com.google.protobuf.MapField.newMapField(
            MetricCostsDefaultEntryHolder.defaultEntry);
      }
      if (!metricCosts_.isMutable()) {
        metricCosts_ = metricCosts_.copy();
      }
      return metricCosts_;
    }

    public int getMetricCostsCount() {
      return internalGetMetricCosts().getMap().size();
    }
    /**
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */

    public boolean containsMetricCosts(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetMetricCosts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMetricCostsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getMetricCosts() {
      return getMetricCostsMap();
    }
    /**
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Long> getMetricCostsMap() {
      return internalGetMetricCosts().getMap();
    }
    /**
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */

    public long getMetricCostsOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetMetricCosts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */

    public long getMetricCostsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetMetricCosts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetricCosts() {
      internalGetMutableMetricCosts().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */

    public Builder removeMetricCosts(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMetricCosts().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
    getMutableMetricCosts() {
      return internalGetMutableMetricCosts().getMutableMap();
    }
    /**
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */
    public Builder putMetricCosts(
        java.lang.String key,
        long value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      internalGetMutableMetricCosts().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Metrics to update when the selected methods are called, and the associated
     * cost applied to each metric.
     * The key of the map is the metric name, and the values are the amount
     * increased for the metric against which the quota limits are defined.
     * The value must not be negative.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
     */

    public Builder putAllMetricCosts(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableMetricCosts().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:google.api.MetricRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.MetricRule)
  private static final org.apache.ratis.shaded.com.google.api.MetricRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.ratis.shaded.com.google.api.MetricRule();
  }

  public static org.apache.ratis.shaded.com.google.api.MetricRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.ratis.shaded.com.google.protobuf.Parser<MetricRule>
      PARSER = new org.apache.ratis.shaded.com.google.protobuf.AbstractParser<MetricRule>() {
    public MetricRule parsePartialFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new MetricRule(input, extensionRegistry);
    }
  };

  public static org.apache.ratis.shaded.com.google.protobuf.Parser<MetricRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.ratis.shaded.com.google.protobuf.Parser<MetricRule> getParserForType() {
    return PARSER;
  }

  public org.apache.ratis.shaded.com.google.api.MetricRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

