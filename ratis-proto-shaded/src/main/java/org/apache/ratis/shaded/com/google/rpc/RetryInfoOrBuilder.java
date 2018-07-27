// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package org.apache.ratis.shaded.com.google.rpc;

public interface RetryInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.RetryInfo)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  boolean hasRetryDelay();
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.Duration getRetryDelay();
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder();
}
