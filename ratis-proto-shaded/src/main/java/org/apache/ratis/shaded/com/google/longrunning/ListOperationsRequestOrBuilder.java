// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package org.apache.ratis.shaded.com.google.longrunning;

public interface ListOperationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.ListOperationsRequest)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The standard list filter.
   * </pre>
   *
   * <code>string filter = 1;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The standard list filter.
   * </pre>
   *
   * <code>string filter = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getPageTokenBytes();
}
