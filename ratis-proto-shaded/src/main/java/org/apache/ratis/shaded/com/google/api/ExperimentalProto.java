// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/experimental/experimental.proto

package org.apache.ratis.shaded.com.google.api;

public final class ExperimentalProto {
  private ExperimentalProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Experimental_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Experimental_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/api/experimental/experimental.p" +
      "roto\022\ngoogle.api\032\034google/api/annotations" +
      ".proto\0322google/api/experimental/authoriz" +
      "ation_config.proto\"F\n\014Experimental\0226\n\rau" +
      "thorization\030\010 \001(\0132\037.google.api.Authoriza" +
      "tionConfigB[\n\016com.google.apiB\021Experiment" +
      "alProtoP\001Z-google.golang.org/genproto/go" +
      "ogleapis/api;api\242\002\004GAPIb\006proto3"
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
          org.apache.ratis.shaded.com.google.api.AnnotationsProto.getDescriptor(),
          org.apache.ratis.shaded.com.google.api.AuthorizationConfigProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_Experimental_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Experimental_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Experimental_descriptor,
        new java.lang.String[] { "Authorization", });
    org.apache.ratis.shaded.com.google.api.AnnotationsProto.getDescriptor();
    org.apache.ratis.shaded.com.google.api.AuthorizationConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
