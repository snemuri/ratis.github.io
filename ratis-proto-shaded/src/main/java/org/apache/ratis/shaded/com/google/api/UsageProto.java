// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/usage.proto

package org.apache.ratis.shaded.com.google.api;

public final class UsageProto {
  private UsageProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Usage_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Usage_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_UsageRule_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_UsageRule_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/api/usage.proto\022\ngoogle.api\032\034go" +
      "ogle/api/annotations.proto\"j\n\005Usage\022\024\n\014r" +
      "equirements\030\001 \003(\t\022$\n\005rules\030\006 \003(\0132\025.googl" +
      "e.api.UsageRule\022%\n\035producer_notification" +
      "_channel\030\007 \001(\t\"]\n\tUsageRule\022\020\n\010selector\030" +
      "\001 \001(\t\022 \n\030allow_unregistered_calls\030\002 \001(\010\022" +
      "\034\n\024skip_service_control\030\003 \001(\010Bl\n\016com.goo" +
      "gle.apiB\nUsageProtoP\001ZEgoogle.golang.org" +
      "/genproto/googleapis/api/serviceconfig;s" +
      "erviceconfig\242\002\004GAPIb\006proto3"
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
        }, assigner);
    internal_static_google_api_Usage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Usage_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Usage_descriptor,
        new java.lang.String[] { "Requirements", "Rules", "ProducerNotificationChannel", });
    internal_static_google_api_UsageRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_UsageRule_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_UsageRule_descriptor,
        new java.lang.String[] { "Selector", "AllowUnregisteredCalls", "SkipServiceControl", });
    org.apache.ratis.shaded.com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}