// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Pandora.proto

package com.x.y.accumulation.proto.pan;

public final class Pandora {
  private Pandora() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pandora_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pandora_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pandora_PanMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pandora_PanMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rPandora.proto\022\007pandora\"#\n\006Person\022\n\n\002id" +
      "\030\001 \001(\t\022\r\n\005audio\030\002 \001(\014\"L\n\nPanMessage\022\016\n\006m" +
      "ethod\030\001 \001(\t\022\014\n\004args\030\002 \003(\t\022 \n\007persons\030\003 \003" +
      "(\0132\017.pandora.PersonB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_pandora_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pandora_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pandora_Person_descriptor,
        new java.lang.String[] { "Id", "Audio", });
    internal_static_pandora_PanMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_pandora_PanMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pandora_PanMessage_descriptor,
        new java.lang.String[] { "Method", "Args", "Persons", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
