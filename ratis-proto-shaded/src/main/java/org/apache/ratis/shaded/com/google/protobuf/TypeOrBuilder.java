// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package org.apache.ratis.shaded.com.google.protobuf;

public interface TypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Type)
    org.apache.ratis.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fully qualified message name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The fully qualified message name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  java.util.List<org.apache.ratis.shaded.com.google.protobuf.Field> 
      getFieldsList();
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.Field getFields(int index);
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  java.util.List<? extends org.apache.ratis.shaded.com.google.protobuf.FieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.FieldOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  java.util.List<java.lang.String>
      getOneofsList();
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  int getOneofsCount();
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  java.lang.String getOneofs(int index);
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.ByteString
      getOneofsBytes(int index);

  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  java.util.List<org.apache.ratis.shaded.com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  java.util.List<? extends org.apache.ratis.shaded.com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   */
  boolean hasSourceContext();
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.SourceContext getSourceContext();
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.SourceContextOrBuilder getSourceContextOrBuilder();

  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 6;</code>
   */
  int getSyntaxValue();
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 6;</code>
   */
  org.apache.ratis.shaded.com.google.protobuf.Syntax getSyntax();
}
