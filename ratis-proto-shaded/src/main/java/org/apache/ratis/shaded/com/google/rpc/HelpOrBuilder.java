// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package org.apache.ratis.shaded.com.google.rpc;

public interface HelpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.Help)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  java.util.List<org.apache.ratis.shaded.com.google.rpc.Help.Link> 
      getLinksList();
  /**
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  org.apache.ratis.shaded.com.google.rpc.Help.Link getLinks(int index);
  /**
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  int getLinksCount();
  /**
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  java.util.List<? extends org.apache.ratis.shaded.com.google.rpc.Help.LinkOrBuilder> 
      getLinksOrBuilderList();
  /**
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.rpc.Help.Link links = 1;</code>
   */
  org.apache.ratis.shaded.com.google.rpc.Help.LinkOrBuilder getLinksOrBuilder(
      int index);
}
