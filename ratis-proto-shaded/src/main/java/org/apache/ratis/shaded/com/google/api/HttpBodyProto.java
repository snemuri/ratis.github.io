// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/httpbody.proto

package org.apache.ratis.shaded.com.google.api;

public final class HttpBodyProto {
  private HttpBodyProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_HttpBody_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_HttpBody_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/api/httpbody.proto\022\ngoogle.api\"" +
      ".\n\010HttpBody\022\024\n\014content_type\030\001 \001(\t\022\014\n\004dat" +
      "a\030\002 \001(\014Be\n\016com.google.apiB\rHttpBodyProto" +
      "P\001Z;google.golang.org/genproto/googleapi" +
      "s/api/httpbody;httpbody\242\002\004GAPIb\006proto3"
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
    internal_static_google_api_HttpBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_HttpBody_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_HttpBody_descriptor,
        new java.lang.String[] { "ContentType", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
