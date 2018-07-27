// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/distribution.proto

package org.apache.ratis.shaded.com.google.api;

public final class DistributionProto {
  private DistributionProto() {}
  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.ratis.shaded.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_Range_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_Range_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_Linear_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_Linear_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_Exponential_fieldAccessorTable;
  static final org.apache.ratis.shaded.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor;
  static final 
    org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_Explicit_fieldAccessorTable;

  public static org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.ratis.shaded.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035google/api/distribution.proto\022\ngoogle." +
      "api\032\034google/api/annotations.proto\032\031googl" +
      "e/protobuf/any.proto\032\037google/protobuf/ti" +
      "mestamp.proto\"\256\005\n\014Distribution\022\r\n\005count\030" +
      "\001 \001(\003\022\014\n\004mean\030\002 \001(\001\022 \n\030sum_of_squared_de" +
      "viation\030\003 \001(\001\022-\n\005range\030\004 \001(\0132\036.google.ap" +
      "i.Distribution.Range\022>\n\016bucket_options\030\006" +
      " \001(\0132&.google.api.Distribution.BucketOpt" +
      "ions\022\025\n\rbucket_counts\030\007 \003(\003\032!\n\005Range\022\013\n\003" +
      "min\030\001 \001(\001\022\013\n\003max\030\002 \001(\001\032\265\003\n\rBucketOptions",
      "\022G\n\016linear_buckets\030\001 \001(\0132-.google.api.Di" +
      "stribution.BucketOptions.LinearH\000\022Q\n\023exp" +
      "onential_buckets\030\002 \001(\01322.google.api.Dist" +
      "ribution.BucketOptions.ExponentialH\000\022K\n\020" +
      "explicit_buckets\030\003 \001(\0132/.google.api.Dist" +
      "ribution.BucketOptions.ExplicitH\000\032C\n\006Lin" +
      "ear\022\032\n\022num_finite_buckets\030\001 \001(\005\022\r\n\005width" +
      "\030\002 \001(\001\022\016\n\006offset\030\003 \001(\001\032O\n\013Exponential\022\032\n" +
      "\022num_finite_buckets\030\001 \001(\005\022\025\n\rgrowth_fact" +
      "or\030\002 \001(\001\022\r\n\005scale\030\003 \001(\001\032\032\n\010Explicit\022\016\n\006b",
      "ounds\030\001 \003(\001B\t\n\007optionsBj\n\016com.google.api" +
      "B\021DistributionProtoP\001ZCgoogle.golang.org" +
      "/genproto/googleapis/api/distribution;di" +
      "stributionb\006proto3"
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
          org.apache.ratis.shaded.com.google.protobuf.AnyProto.getDescriptor(),
          org.apache.ratis.shaded.com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_Distribution_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Distribution_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_descriptor,
        new java.lang.String[] { "Count", "Mean", "SumOfSquaredDeviation", "Range", "BucketOptions", "BucketCounts", });
    internal_static_google_api_Distribution_Range_descriptor =
      internal_static_google_api_Distribution_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Distribution_Range_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_Range_descriptor,
        new java.lang.String[] { "Min", "Max", });
    internal_static_google_api_Distribution_BucketOptions_descriptor =
      internal_static_google_api_Distribution_descriptor.getNestedTypes().get(1);
    internal_static_google_api_Distribution_BucketOptions_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_descriptor,
        new java.lang.String[] { "LinearBuckets", "ExponentialBuckets", "ExplicitBuckets", "Options", });
    internal_static_google_api_Distribution_BucketOptions_Linear_descriptor =
      internal_static_google_api_Distribution_BucketOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Distribution_BucketOptions_Linear_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_Linear_descriptor,
        new java.lang.String[] { "NumFiniteBuckets", "Width", "Offset", });
    internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor =
      internal_static_google_api_Distribution_BucketOptions_descriptor.getNestedTypes().get(1);
    internal_static_google_api_Distribution_BucketOptions_Exponential_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor,
        new java.lang.String[] { "NumFiniteBuckets", "GrowthFactor", "Scale", });
    internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor =
      internal_static_google_api_Distribution_BucketOptions_descriptor.getNestedTypes().get(2);
    internal_static_google_api_Distribution_BucketOptions_Explicit_fieldAccessorTable = new
      org.apache.ratis.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor,
        new java.lang.String[] { "Bounds", });
    org.apache.ratis.shaded.com.google.api.AnnotationsProto.getDescriptor();
    org.apache.ratis.shaded.com.google.protobuf.AnyProto.getDescriptor();
    org.apache.ratis.shaded.com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}