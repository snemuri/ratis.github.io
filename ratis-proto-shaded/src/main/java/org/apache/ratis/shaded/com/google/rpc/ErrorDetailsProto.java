// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package org.apache.ratis.shaded.com.google.rpc;

public final class ErrorDetailsProto {
  private ErrorDetailsProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_RetryInfo_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_RetryInfo_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_DebugInfo_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_DebugInfo_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_QuotaFailure_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_QuotaFailure_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_QuotaFailure_Violation_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_QuotaFailure_Violation_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_PreconditionFailure_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_PreconditionFailure_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_PreconditionFailure_Violation_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_PreconditionFailure_Violation_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_BadRequest_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_BadRequest_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_BadRequest_FieldViolation_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_BadRequest_FieldViolation_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_RequestInfo_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_RequestInfo_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_ResourceInfo_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_ResourceInfo_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_Help_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_Help_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_Help_Link_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_Help_Link_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_rpc_LocalizedMessage_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_rpc_LocalizedMessage_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036google/rpc/error_details.proto\022\ngoogle" +
      ".rpc\032\036google/protobuf/duration.proto\";\n\t" +
      "RetryInfo\022.\n\013retry_delay\030\001 \001(\0132\031.google." +
      "protobuf.Duration\"2\n\tDebugInfo\022\025\n\rstack_" +
      "entries\030\001 \003(\t\022\016\n\006detail\030\002 \001(\t\"y\n\014QuotaFa" +
      "ilure\0226\n\nviolations\030\001 \003(\0132\".google.rpc.Q" +
      "uotaFailure.Violation\0321\n\tViolation\022\017\n\007su" +
      "bject\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\"\225\001\n\023Pre" +
      "conditionFailure\022=\n\nviolations\030\001 \003(\0132).g" +
      "oogle.rpc.PreconditionFailure.Violation\032",
      "?\n\tViolation\022\014\n\004type\030\001 \001(\t\022\017\n\007subject\030\002 " +
      "\001(\t\022\023\n\013description\030\003 \001(\t\"\203\001\n\nBadRequest\022" +
      "?\n\020field_violations\030\001 \003(\0132%.google.rpc.B" +
      "adRequest.FieldViolation\0324\n\016FieldViolati" +
      "on\022\r\n\005field\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\"7" +
      "\n\013RequestInfo\022\022\n\nrequest_id\030\001 \001(\t\022\024\n\014ser" +
      "ving_data\030\002 \001(\t\"`\n\014ResourceInfo\022\025\n\rresou" +
      "rce_type\030\001 \001(\t\022\025\n\rresource_name\030\002 \001(\t\022\r\n" +
      "\005owner\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\"V\n\004Hel" +
      "p\022$\n\005links\030\001 \003(\0132\025.google.rpc.Help.Link\032",
      "(\n\004Link\022\023\n\013description\030\001 \001(\t\022\013\n\003url\030\002 \001(" +
      "\t\"3\n\020LocalizedMessage\022\016\n\006locale\030\001 \001(\t\022\017\n" +
      "\007message\030\002 \001(\tBl\n\016com.google.rpcB\021ErrorD" +
      "etailsProtoP\001Z?google.golang.org/genprot" +
      "o/googleapis/rpc/errdetails;errdetails\242\002" +
      "\003RPCb\006proto3"
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
          org.apache.ratis.shaded.com.google.protobuf.DurationProto.getDescriptor(),
        }, assigner);
    internal_static_google_rpc_RetryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_rpc_RetryInfo_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_RetryInfo_descriptor,
        new java.lang.String[] { "RetryDelay", });
    internal_static_google_rpc_DebugInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_rpc_DebugInfo_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_DebugInfo_descriptor,
        new java.lang.String[] { "StackEntries", "Detail", });
    internal_static_google_rpc_QuotaFailure_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_rpc_QuotaFailure_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_QuotaFailure_descriptor,
        new java.lang.String[] { "Violations", });
    internal_static_google_rpc_QuotaFailure_Violation_descriptor =
      internal_static_google_rpc_QuotaFailure_descriptor.getNestedTypes().get(0);
    internal_static_google_rpc_QuotaFailure_Violation_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_QuotaFailure_Violation_descriptor,
        new java.lang.String[] { "Subject", "Description", });
    internal_static_google_rpc_PreconditionFailure_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_rpc_PreconditionFailure_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_PreconditionFailure_descriptor,
        new java.lang.String[] { "Violations", });
    internal_static_google_rpc_PreconditionFailure_Violation_descriptor =
      internal_static_google_rpc_PreconditionFailure_descriptor.getNestedTypes().get(0);
    internal_static_google_rpc_PreconditionFailure_Violation_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_PreconditionFailure_Violation_descriptor,
        new java.lang.String[] { "Type", "Subject", "Description", });
    internal_static_google_rpc_BadRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_rpc_BadRequest_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_BadRequest_descriptor,
        new java.lang.String[] { "FieldViolations", });
    internal_static_google_rpc_BadRequest_FieldViolation_descriptor =
      internal_static_google_rpc_BadRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_rpc_BadRequest_FieldViolation_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_BadRequest_FieldViolation_descriptor,
        new java.lang.String[] { "Field", "Description", });
    internal_static_google_rpc_RequestInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_rpc_RequestInfo_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_RequestInfo_descriptor,
        new java.lang.String[] { "RequestId", "ServingData", });
    internal_static_google_rpc_ResourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_rpc_ResourceInfo_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_ResourceInfo_descriptor,
        new java.lang.String[] { "ResourceType", "ResourceName", "Owner", "Description", });
    internal_static_google_rpc_Help_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_rpc_Help_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_Help_descriptor,
        new java.lang.String[] { "Links", });
    internal_static_google_rpc_Help_Link_descriptor =
      internal_static_google_rpc_Help_descriptor.getNestedTypes().get(0);
    internal_static_google_rpc_Help_Link_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_Help_Link_descriptor,
        new java.lang.String[] { "Description", "Url", });
    internal_static_google_rpc_LocalizedMessage_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_rpc_LocalizedMessage_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_rpc_LocalizedMessage_descriptor,
        new java.lang.String[] { "Locale", "Message", });
    org.apache.ratis.shaded.com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
