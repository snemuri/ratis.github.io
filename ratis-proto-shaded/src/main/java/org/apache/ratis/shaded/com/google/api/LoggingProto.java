// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/logging.proto

package org.apache.ratis.shaded.com.google.api;

public final class LoggingProto {
  private LoggingProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Logging_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Logging_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Logging_LoggingDestination_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Logging_LoggingDestination_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/logging.proto\022\ngoogle.api\032\034" +
      "google/api/annotations.proto\"\327\001\n\007Logging" +
      "\022E\n\025producer_destinations\030\001 \003(\0132&.google" +
      ".api.Logging.LoggingDestination\022E\n\025consu" +
      "mer_destinations\030\002 \003(\0132&.google.api.Logg" +
      "ing.LoggingDestination\032>\n\022LoggingDestina" +
      "tion\022\032\n\022monitored_resource\030\003 \001(\t\022\014\n\004logs" +
      "\030\001 \003(\tBn\n\016com.google.apiB\014LoggingProtoP\001" +
      "ZEgoogle.golang.org/genproto/googleapis/" +
      "api/serviceconfig;serviceconfig\242\002\004GAPIb\006",
      "proto3"
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
    internal_static_google_api_Logging_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Logging_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Logging_descriptor,
        new java.lang.String[] { "ProducerDestinations", "ConsumerDestinations", });
    internal_static_google_api_Logging_LoggingDestination_descriptor =
      internal_static_google_api_Logging_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Logging_LoggingDestination_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Logging_LoggingDestination_descriptor,
        new java.lang.String[] { "MonitoredResource", "Logs", });
    org.apache.ratis.shaded.com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
