// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package org.apache.ratis.shaded.com.google.api;

public final class MonitoredResourceProto {
  private MonitoredResourceProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResourceDescriptor_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResourceDescriptor_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResource_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResource_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MonitoredResource_LabelsEntry_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MonitoredResource_LabelsEntry_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/api/monitored_resource.proto\022\ng" +
      "oogle.api\032\026google/api/label.proto\"\221\001\n\033Mo" +
      "nitoredResourceDescriptor\022\014\n\004name\030\005 \001(\t\022" +
      "\014\n\004type\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013d" +
      "escription\030\003 \001(\t\022+\n\006labels\030\004 \003(\0132\033.googl" +
      "e.api.LabelDescriptor\"\213\001\n\021MonitoredResou" +
      "rce\022\014\n\004type\030\001 \001(\t\0229\n\006labels\030\002 \003(\0132).goog" +
      "le.api.MonitoredResource.LabelsEntry\032-\n\013" +
      "LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:" +
      "\0028\001By\n\016com.google.apiB\026MonitoredResource",
      "ProtoP\001ZCgoogle.golang.org/genproto/goog" +
      "leapis/api/monitoredres;monitoredres\370\001\001\242" +
      "\002\004GAPIb\006proto3"
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
          org.apache.ratis.shaded.com.google.api.LabelProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_MonitoredResourceDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_MonitoredResourceDescriptor_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResourceDescriptor_descriptor,
        new java.lang.String[] { "Name", "Type", "DisplayName", "Description", "Labels", });
    internal_static_google_api_MonitoredResource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_MonitoredResource_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResource_descriptor,
        new java.lang.String[] { "Type", "Labels", });
    internal_static_google_api_MonitoredResource_LabelsEntry_descriptor =
      internal_static_google_api_MonitoredResource_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MonitoredResource_LabelsEntry_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MonitoredResource_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.apache.ratis.shaded.com.google.api.LabelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
