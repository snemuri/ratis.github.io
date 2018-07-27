// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package org.apache.ratis.shaded.com.google.api;

public interface HttpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Http)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   */
  java.util.List<org.apache.ratis.shaded.com.google.api.HttpRule> 
      getRulesList();
  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   */
  org.apache.ratis.shaded.com.google.api.HttpRule getRules(int index);
  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   */
  java.util.List<? extends org.apache.ratis.shaded.com.google.api.HttpRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1;</code>
   */
  org.apache.ratis.shaded.com.google.api.HttpRuleOrBuilder getRulesOrBuilder(
      int index);
}