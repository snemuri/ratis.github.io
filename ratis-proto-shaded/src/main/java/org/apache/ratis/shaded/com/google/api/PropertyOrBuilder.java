// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/consumer.proto

package org.apache.ratis.shaded.com.google.api;

public interface PropertyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Property)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the property (a.k.a key).
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>.google.api.Property.PropertyType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of this property.
   * </pre>
   *
   * <code>.google.api.Property.PropertyType type = 2;</code>
   */
  org.apache.ratis.shaded.com.google.api.Property.PropertyType getType();

  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the property
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getDescriptionBytes();
}
