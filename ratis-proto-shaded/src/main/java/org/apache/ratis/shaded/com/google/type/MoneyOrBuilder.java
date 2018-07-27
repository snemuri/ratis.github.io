// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/money.proto

package org.apache.ratis.shaded.com.google.type;

public interface MoneyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.Money)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * The whole units of the amount.
   * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
   * </pre>
   *
   * <code>int64 units = 2;</code>
   */
  long getUnits();

  /**
   * <pre>
   * Number of nano (10^-9) units of the amount.
   * The value must be between -999,999,999 and +999,999,999 inclusive.
   * If `units` is positive, `nanos` must be positive or zero.
   * If `units` is zero, `nanos` can be positive, zero, or negative.
   * If `units` is negative, `nanos` must be negative or zero.
   * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * </pre>
   *
   * <code>int32 nanos = 3;</code>
   */
  int getNanos();
}
