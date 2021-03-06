// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package org.apache.hadoop.hbase.shaded.com.google.protobuf;

public interface EnumValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.EnumValue)
    org.apache.hadoop.hbase.shaded.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Enum value name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Enum value name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Enum value number.
   * </pre>
   *
   * <code>int32 number = 2;</code>
   */
  int getNumber();

  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  java.util.List<org.apache.hadoop.hbase.shaded.com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  java.util.List<? extends org.apache.hadoop.hbase.shaded.com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  org.apache.hadoop.hbase.shaded.com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index);
}
