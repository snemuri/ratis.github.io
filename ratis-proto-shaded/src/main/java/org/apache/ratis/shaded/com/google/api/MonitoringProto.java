// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitoring.proto

package org.apache.ratis.shaded.com.google.api;

public final class MonitoringProto {
  private MonitoringProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Monitoring_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Monitoring_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Monitoring_MonitoringDestination_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033google/api/monitoring.proto\022\ngoogle.ap" +
      "i\032\034google/api/annotations.proto\"\354\001\n\nMoni" +
      "toring\022K\n\025producer_destinations\030\001 \003(\0132,." +
      "google.api.Monitoring.MonitoringDestinat" +
      "ion\022K\n\025consumer_destinations\030\002 \003(\0132,.goo" +
      "gle.api.Monitoring.MonitoringDestination" +
      "\032D\n\025MonitoringDestination\022\032\n\022monitored_r" +
      "esource\030\001 \001(\t\022\017\n\007metrics\030\002 \003(\tBq\n\016com.go" +
      "ogle.apiB\017MonitoringProtoP\001ZEgoogle.gola" +
      "ng.org/genproto/googleapis/api/serviceco",
      "nfig;serviceconfig\242\002\004GAPIb\006proto3"
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
    internal_static_google_api_Monitoring_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Monitoring_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Monitoring_descriptor,
        new java.lang.String[] { "ProducerDestinations", "ConsumerDestinations", });
    internal_static_google_api_Monitoring_MonitoringDestination_descriptor =
      internal_static_google_api_Monitoring_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Monitoring_MonitoringDestination_descriptor,
        new java.lang.String[] { "MonitoredResource", "Metrics", });
    org.apache.ratis.shaded.com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
