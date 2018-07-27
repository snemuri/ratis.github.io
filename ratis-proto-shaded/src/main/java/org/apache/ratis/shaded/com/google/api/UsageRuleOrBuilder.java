// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/usage.proto

package org.apache.ratis.shaded.com.google.api;

public interface UsageRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.UsageRule)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * True, if the method allows unregistered calls; false otherwise.
   * </pre>
   *
   * <code>bool allow_unregistered_calls = 2;</code>
   */
  boolean getAllowUnregisteredCalls();

  /**
   * <pre>
   * True, if the method should skip service control. If so, no control plane
   * feature (like quota and billing) will be enabled.
   * </pre>
   *
   * <code>bool skip_service_control = 3;</code>
   */
  boolean getSkipServiceControl();
}