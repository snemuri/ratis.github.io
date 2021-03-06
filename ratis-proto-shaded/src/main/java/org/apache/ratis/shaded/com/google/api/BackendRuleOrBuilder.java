// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/backend.proto

package org.apache.ratis.shaded.com.google.api;

public interface BackendRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.BackendRule)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * The number of seconds to wait for a response from a request.  The
   * default depends on the deployment context.
   * </pre>
   *
   * <code>double deadline = 3;</code>
   */
  double getDeadline();
}
