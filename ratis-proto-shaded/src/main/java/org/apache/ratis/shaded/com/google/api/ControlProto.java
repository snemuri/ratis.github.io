// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/control.proto

package org.apache.ratis.shaded.com.google.api;

public final class ControlProto {
  private ControlProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Control_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Control_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/control.proto\022\ngoogle.api\"\036" +
      "\n\007Control\022\023\n\013environment\030\001 \001(\tBn\n\016com.go" +
      "ogle.apiB\014ControlProtoP\001ZEgoogle.golang." +
      "org/genproto/googleapis/api/serviceconfi" +
      "g;serviceconfig\242\002\004GAPIb\006proto3"
    };
    org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_api_Control_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Control_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Control_descriptor,
        new java.lang.String[] { "Environment", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
