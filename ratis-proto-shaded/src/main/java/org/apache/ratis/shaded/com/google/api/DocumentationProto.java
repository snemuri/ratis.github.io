// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/documentation.proto

package org.apache.ratis.shaded.com.google.api;

public final class DocumentationProto {
  private DocumentationProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Documentation_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Documentation_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_DocumentationRule_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_DocumentationRule_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Page_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Page_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036google/api/documentation.proto\022\ngoogle" +
      ".api\"\241\001\n\rDocumentation\022\017\n\007summary\030\001 \001(\t\022" +
      "\037\n\005pages\030\005 \003(\0132\020.google.api.Page\022,\n\005rule" +
      "s\030\003 \003(\0132\035.google.api.DocumentationRule\022\036" +
      "\n\026documentation_root_url\030\004 \001(\t\022\020\n\010overvi" +
      "ew\030\002 \001(\t\"[\n\021DocumentationRule\022\020\n\010selecto" +
      "r\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022\037\n\027deprecat" +
      "ion_description\030\003 \001(\t\"I\n\004Page\022\014\n\004name\030\001 " +
      "\001(\t\022\017\n\007content\030\002 \001(\t\022\"\n\010subpages\030\003 \003(\0132\020" +
      ".google.api.PageBt\n\016com.google.apiB\022Docu",
      "mentationProtoP\001ZEgoogle.golang.org/genp" +
      "roto/googleapis/api/serviceconfig;servic" +
      "econfig\242\002\004GAPIb\006proto3"
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
    internal_static_google_api_Documentation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Documentation_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Documentation_descriptor,
        new java.lang.String[] { "Summary", "Pages", "Rules", "DocumentationRootUrl", "Overview", });
    internal_static_google_api_DocumentationRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_DocumentationRule_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_DocumentationRule_descriptor,
        new java.lang.String[] { "Selector", "Description", "DeprecationDescription", });
    internal_static_google_api_Page_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_Page_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Page_descriptor,
        new java.lang.String[] { "Name", "Content", "Subpages", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
