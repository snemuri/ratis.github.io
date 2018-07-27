// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/date.proto

package org.apache.ratis.shaded.com.google.type;

/**
 * <pre>
 * Represents a whole calendar date, e.g. date of birth. The time of day and
 * time zone are either specified elsewhere or are not significant. The date
 * is relative to the Proleptic Gregorian Calendar. The day may be 0 to
 * represent a year and month where the day is not significant, e.g. credit card
 * expiration date. The year may be 0 to represent a month and day independent
 * of year, e.g. anniversary date. Related types are [google.type.TimeOfDay][google.type.TimeOfDay]
 * and `google.protobuf.Timestamp`.
 * </pre>
 *
 * Protobuf type {@code google.type.Date}
 */
public  final class Date extends
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.type.Date)
    DateOrBuilder {
  // Use Date.newBuilder() to construct.
  private Date(org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Date() {
    year_ = 0;
    month_ = 0;
    day_ = 0;
  }

  @java.lang.Override
  public final org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.ratis.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Date(
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
          case 8: {

            year_ = input.readInt32();
            break;
          }
          case 16: {

            month_ = input.readInt32();
            break;
          }
          case 24: {

            day_ = input.readInt32();
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
    return org.apache.ratis.shaded.com.google.type.DateProto.internal_static_google_type_Date_descriptor;
  }

  protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.ratis.shaded.com.google.type.DateProto.internal_static_google_type_Date_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.ratis.shaded.com.google.type.Date.class, org.apache.ratis.shaded.com.google.type.Date.Builder.class);
  }

  public static final int YEAR_FIELD_NUMBER = 1;
  private int year_;
  /**
   * <pre>
   * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
   * a year.
   * </pre>
   *
   * <code>int32 year = 1;</code>
   */
  public int getYear() {
    return year_;
  }

  public static final int MONTH_FIELD_NUMBER = 2;
  private int month_;
  /**
   * <pre>
   * Month of year. Must be from 1 to 12.
   * </pre>
   *
   * <code>int32 month = 2;</code>
   */
  public int getMonth() {
    return month_;
  }

  public static final int DAY_FIELD_NUMBER = 3;
  private int day_;
  /**
   * <pre>
   * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
   * if specifying a year/month where the day is not significant.
   * </pre>
   *
   * <code>int32 day = 3;</code>
   */
  public int getDay() {
    return day_;
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
    if (year_ != 0) {
      output.writeInt32(1, year_);
    }
    if (month_ != 0) {
      output.writeInt32(2, month_);
    }
    if (day_ != 0) {
      output.writeInt32(3, day_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (year_ != 0) {
      size += org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, year_);
    }
    if (month_ != 0) {
      size += org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, month_);
    }
    if (day_ != 0) {
      size += org.apache.ratis.shaded.com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, day_);
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
    if (!(obj instanceof org.apache.ratis.shaded.com.google.type.Date)) {
      return super.equals(obj);
    }
    org.apache.ratis.shaded.com.google.type.Date other = (org.apache.ratis.shaded.com.google.type.Date) obj;

    boolean result = true;
    result = result && (getYear()
        == other.getYear());
    result = result && (getMonth()
        == other.getMonth());
    result = result && (getDay()
        == other.getDay());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear();
    hash = (37 * hash) + MONTH_FIELD_NUMBER;
    hash = (53 * hash) + getMonth();
    hash = (37 * hash) + DAY_FIELD_NUMBER;
    hash = (53 * hash) + getDay();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
      java.nio.ByteBuffer data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.ByteString data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(byte[] data)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
      byte[] data,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
      org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.ratis.shaded.com.google.type.Date parseFrom(
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
  public static Builder newBuilder(org.apache.ratis.shaded.com.google.type.Date prototype) {
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
   * Represents a whole calendar date, e.g. date of birth. The time of day and
   * time zone are either specified elsewhere or are not significant. The date
   * is relative to the Proleptic Gregorian Calendar. The day may be 0 to
   * represent a year and month where the day is not significant, e.g. credit card
   * expiration date. The year may be 0 to represent a month and day independent
   * of year, e.g. anniversary date. Related types are [google.type.TimeOfDay][google.type.TimeOfDay]
   * and `google.protobuf.Timestamp`.
   * </pre>
   *
   * Protobuf type {@code google.type.Date}
   */
  public static final class Builder extends
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Date)
      org.apache.ratis.shaded.com.google.type.DateOrBuilder {
    public static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.ratis.shaded.com.google.type.DateProto.internal_static_google_type_Date_descriptor;
    }

    protected org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.ratis.shaded.com.google.type.DateProto.internal_static_google_type_Date_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.ratis.shaded.com.google.type.Date.class, org.apache.ratis.shaded.com.google.type.Date.Builder.class);
    }

    // Construct using org.apache.ratis.shaded.com.google.type.Date.newBuilder()
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
      year_ = 0;

      month_ = 0;

      day_ = 0;

      return this;
    }

    public org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.ratis.shaded.com.google.type.DateProto.internal_static_google_type_Date_descriptor;
    }

    public org.apache.ratis.shaded.com.google.type.Date getDefaultInstanceForType() {
      return org.apache.ratis.shaded.com.google.type.Date.getDefaultInstance();
    }

    public org.apache.ratis.shaded.com.google.type.Date build() {
      org.apache.ratis.shaded.com.google.type.Date result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.ratis.shaded.com.google.type.Date buildPartial() {
      org.apache.ratis.shaded.com.google.type.Date result = new org.apache.ratis.shaded.com.google.type.Date(this);
      result.year_ = year_;
      result.month_ = month_;
      result.day_ = day_;
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
      if (other instanceof org.apache.ratis.shaded.com.google.type.Date) {
        return mergeFrom((org.apache.ratis.shaded.com.google.type.Date)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.ratis.shaded.com.google.type.Date other) {
      if (other == org.apache.ratis.shaded.com.google.type.Date.getDefaultInstance()) return this;
      if (other.getYear() != 0) {
        setYear(other.getYear());
      }
      if (other.getMonth() != 0) {
        setMonth(other.getMonth());
      }
      if (other.getDay() != 0) {
        setDay(other.getDay());
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
      org.apache.ratis.shaded.com.google.type.Date parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.ratis.shaded.com.google.type.Date) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int year_ ;
    /**
     * <pre>
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
     * a year.
     * </pre>
     *
     * <code>int32 year = 1;</code>
     */
    public int getYear() {
      return year_;
    }
    /**
     * <pre>
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
     * a year.
     * </pre>
     *
     * <code>int32 year = 1;</code>
     */
    public Builder setYear(int value) {
      
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
     * a year.
     * </pre>
     *
     * <code>int32 year = 1;</code>
     */
    public Builder clearYear() {
      
      year_ = 0;
      onChanged();
      return this;
    }

    private int month_ ;
    /**
     * <pre>
     * Month of year. Must be from 1 to 12.
     * </pre>
     *
     * <code>int32 month = 2;</code>
     */
    public int getMonth() {
      return month_;
    }
    /**
     * <pre>
     * Month of year. Must be from 1 to 12.
     * </pre>
     *
     * <code>int32 month = 2;</code>
     */
    public Builder setMonth(int value) {
      
      month_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Month of year. Must be from 1 to 12.
     * </pre>
     *
     * <code>int32 month = 2;</code>
     */
    public Builder clearMonth() {
      
      month_ = 0;
      onChanged();
      return this;
    }

    private int day_ ;
    /**
     * <pre>
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
     * if specifying a year/month where the day is not significant.
     * </pre>
     *
     * <code>int32 day = 3;</code>
     */
    public int getDay() {
      return day_;
    }
    /**
     * <pre>
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
     * if specifying a year/month where the day is not significant.
     * </pre>
     *
     * <code>int32 day = 3;</code>
     */
    public Builder setDay(int value) {
      
      day_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
     * if specifying a year/month where the day is not significant.
     * </pre>
     *
     * <code>int32 day = 3;</code>
     */
    public Builder clearDay() {
      
      day_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.type.Date)
  }

  // @@protoc_insertion_point(class_scope:google.type.Date)
  private static final org.apache.ratis.shaded.com.google.type.Date DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.ratis.shaded.com.google.type.Date();
  }

  public static org.apache.ratis.shaded.com.google.type.Date getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.ratis.shaded.com.google.protobuf.Parser<Date>
      PARSER = new org.apache.ratis.shaded.com.google.protobuf.AbstractParser<Date>() {
    public Date parsePartialFrom(
        org.apache.ratis.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.ratis.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new Date(input, extensionRegistry);
    }
  };

  public static org.apache.ratis.shaded.com.google.protobuf.Parser<Date> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.ratis.shaded.com.google.protobuf.Parser<Date> getParserForType() {
    return PARSER;
  }

  public org.apache.ratis.shaded.com.google.type.Date getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

