// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.x.y.accumulation.proto.pan.proto

package com.x.y.accumulation.proto.pan;

/**
 * Protobuf type {@code com.x.y.accumulation.proto.pan.PanMessage}
 */
public  final class PanMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.x.y.accumulation.proto.pan.PanMessage)
    PanMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PanMessage.newBuilder() to construct.
  private PanMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PanMessage() {
    method_ = "";
    args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    persons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PanMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            method_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              args_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            args_.add(s);
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              persons_ = new java.util.ArrayList<com.x.y.accumulation.proto.pan.Person>();
              mutable_bitField0_ |= 0x00000004;
            }
            persons_.add(
                input.readMessage(com.x.y.accumulation.proto.pan.Person.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        args_ = args_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        persons_ = java.util.Collections.unmodifiableList(persons_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.x.y.accumulation.proto.pan.Pandora.internal_static_pandora_PanMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.x.y.accumulation.proto.pan.Pandora.internal_static_pandora_PanMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.x.y.accumulation.proto.pan.PanMessage.class, com.x.y.accumulation.proto.pan.PanMessage.Builder.class);
  }

  private int bitField0_;
  public static final int METHOD_FIELD_NUMBER = 1;
  private volatile java.lang.Object method_;
  /**
   * <code>string method = 1;</code>
   */
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   * <code>string method = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      method_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList args_;
  /**
   * <code>repeated string args = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getArgsList() {
    return args_;
  }
  /**
   * <code>repeated string args = 2;</code>
   */
  public int getArgsCount() {
    return args_.size();
  }
  /**
   * <code>repeated string args = 2;</code>
   */
  public java.lang.String getArgs(int index) {
    return args_.get(index);
  }
  /**
   * <code>repeated string args = 2;</code>
   */
  public com.google.protobuf.ByteString
      getArgsBytes(int index) {
    return args_.getByteString(index);
  }

  public static final int PERSONS_FIELD_NUMBER = 3;
  private java.util.List<com.x.y.accumulation.proto.pan.Person> persons_;
  /**
   * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
   */
  public java.util.List<com.x.y.accumulation.proto.pan.Person> getPersonsList() {
    return persons_;
  }
  /**
   * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
   */
  public java.util.List<? extends com.x.y.accumulation.proto.pan.PersonOrBuilder> 
      getPersonsOrBuilderList() {
    return persons_;
  }
  /**
   * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
   */
  public int getPersonsCount() {
    return persons_.size();
  }
  /**
   * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
   */
  public com.x.y.accumulation.proto.pan.Person getPersons(int index) {
    return persons_.get(index);
  }
  /**
   * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
   */
  public com.x.y.accumulation.proto.pan.PersonOrBuilder getPersonsOrBuilder(
      int index) {
    return persons_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMethodBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, method_);
    }
    for (int i = 0; i < args_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, args_.getRaw(i));
    }
    for (int i = 0; i < persons_.size(); i++) {
      output.writeMessage(3, persons_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMethodBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, method_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < args_.size(); i++) {
        dataSize += computeStringSizeNoTag(args_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getArgsList().size();
    }
    for (int i = 0; i < persons_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, persons_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.x.y.accumulation.proto.pan.PanMessage)) {
      return super.equals(obj);
    }
    com.x.y.accumulation.proto.pan.PanMessage other = (com.x.y.accumulation.proto.pan.PanMessage) obj;

    boolean result = true;
    result = result && getMethod()
        .equals(other.getMethod());
    result = result && getArgsList()
        .equals(other.getArgsList());
    result = result && getPersonsList()
        .equals(other.getPersonsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    if (getArgsCount() > 0) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + getArgsList().hashCode();
    }
    if (getPersonsCount() > 0) {
      hash = (37 * hash) + PERSONS_FIELD_NUMBER;
      hash = (53 * hash) + getPersonsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.x.y.accumulation.proto.pan.PanMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.x.y.accumulation.proto.pan.PanMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.x.y.accumulation.proto.pan.PanMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.x.y.accumulation.proto.pan.PanMessage)
      com.x.y.accumulation.proto.pan.PanMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.x.y.accumulation.proto.pan.Pandora.internal_static_pandora_PanMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.x.y.accumulation.proto.pan.Pandora.internal_static_pandora_PanMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.x.y.accumulation.proto.pan.PanMessage.class, com.x.y.accumulation.proto.pan.PanMessage.Builder.class);
    }

    // Construct using com.x.y.accumulation.proto.pan.PanMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPersonsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      method_ = "";

      args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (personsBuilder_ == null) {
        persons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        personsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.x.y.accumulation.proto.pan.Pandora.internal_static_pandora_PanMessage_descriptor;
    }

    public com.x.y.accumulation.proto.pan.PanMessage getDefaultInstanceForType() {
      return com.x.y.accumulation.proto.pan.PanMessage.getDefaultInstance();
    }

    public com.x.y.accumulation.proto.pan.PanMessage build() {
      com.x.y.accumulation.proto.pan.PanMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.x.y.accumulation.proto.pan.PanMessage buildPartial() {
      com.x.y.accumulation.proto.pan.PanMessage result = new com.x.y.accumulation.proto.pan.PanMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.method_ = method_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        args_ = args_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.args_ = args_;
      if (personsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          persons_ = java.util.Collections.unmodifiableList(persons_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.persons_ = persons_;
      } else {
        result.persons_ = personsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.x.y.accumulation.proto.pan.PanMessage) {
        return mergeFrom((com.x.y.accumulation.proto.pan.PanMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.x.y.accumulation.proto.pan.PanMessage other) {
      if (other == com.x.y.accumulation.proto.pan.PanMessage.getDefaultInstance()) return this;
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        onChanged();
      }
      if (!other.args_.isEmpty()) {
        if (args_.isEmpty()) {
          args_ = other.args_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureArgsIsMutable();
          args_.addAll(other.args_);
        }
        onChanged();
      }
      if (personsBuilder_ == null) {
        if (!other.persons_.isEmpty()) {
          if (persons_.isEmpty()) {
            persons_ = other.persons_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePersonsIsMutable();
            persons_.addAll(other.persons_);
          }
          onChanged();
        }
      } else {
        if (!other.persons_.isEmpty()) {
          if (personsBuilder_.isEmpty()) {
            personsBuilder_.dispose();
            personsBuilder_ = null;
            persons_ = other.persons_;
            bitField0_ = (bitField0_ & ~0x00000004);
            personsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPersonsFieldBuilder() : null;
          } else {
            personsBuilder_.addAllMessages(other.persons_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.x.y.accumulation.proto.pan.PanMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.x.y.accumulation.proto.pan.PanMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object method_ = "";
    /**
     * <code>string method = 1;</code>
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string method = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string method = 1;</code>
     */
    public Builder setMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string method = 1;</code>
     */
    public Builder clearMethod() {
      
      method_ = getDefaultInstance().getMethod();
      onChanged();
      return this;
    }
    /**
     * <code>string method = 1;</code>
     */
    public Builder setMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      method_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureArgsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        args_ = new com.google.protobuf.LazyStringArrayList(args_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getArgsList() {
      return args_.getUnmodifiableView();
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public java.lang.String getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public com.google.protobuf.ByteString
        getArgsBytes(int index) {
      return args_.getByteString(index);
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public Builder setArgs(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
      args_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public Builder addArgs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
      args_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public Builder addAllArgs(
        java.lang.Iterable<java.lang.String> values) {
      ensureArgsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, args_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public Builder clearArgs() {
      args_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public Builder addArgsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureArgsIsMutable();
      args_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<com.x.y.accumulation.proto.pan.Person> persons_ =
      java.util.Collections.emptyList();
    private void ensurePersonsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        persons_ = new java.util.ArrayList<com.x.y.accumulation.proto.pan.Person>(persons_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.x.y.accumulation.proto.pan.Person, com.x.y.accumulation.proto.pan.Person.Builder, com.x.y.accumulation.proto.pan.PersonOrBuilder> personsBuilder_;

    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public java.util.List<com.x.y.accumulation.proto.pan.Person> getPersonsList() {
      if (personsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(persons_);
      } else {
        return personsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public int getPersonsCount() {
      if (personsBuilder_ == null) {
        return persons_.size();
      } else {
        return personsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public com.x.y.accumulation.proto.pan.Person getPersons(int index) {
      if (personsBuilder_ == null) {
        return persons_.get(index);
      } else {
        return personsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder setPersons(
        int index, com.x.y.accumulation.proto.pan.Person value) {
      if (personsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonsIsMutable();
        persons_.set(index, value);
        onChanged();
      } else {
        personsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder setPersons(
        int index, com.x.y.accumulation.proto.pan.Person.Builder builderForValue) {
      if (personsBuilder_ == null) {
        ensurePersonsIsMutable();
        persons_.set(index, builderForValue.build());
        onChanged();
      } else {
        personsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder addPersons(com.x.y.accumulation.proto.pan.Person value) {
      if (personsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonsIsMutable();
        persons_.add(value);
        onChanged();
      } else {
        personsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder addPersons(
        int index, com.x.y.accumulation.proto.pan.Person value) {
      if (personsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonsIsMutable();
        persons_.add(index, value);
        onChanged();
      } else {
        personsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder addPersons(
        com.x.y.accumulation.proto.pan.Person.Builder builderForValue) {
      if (personsBuilder_ == null) {
        ensurePersonsIsMutable();
        persons_.add(builderForValue.build());
        onChanged();
      } else {
        personsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder addPersons(
        int index, com.x.y.accumulation.proto.pan.Person.Builder builderForValue) {
      if (personsBuilder_ == null) {
        ensurePersonsIsMutable();
        persons_.add(index, builderForValue.build());
        onChanged();
      } else {
        personsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder addAllPersons(
        java.lang.Iterable<? extends com.x.y.accumulation.proto.pan.Person> values) {
      if (personsBuilder_ == null) {
        ensurePersonsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, persons_);
        onChanged();
      } else {
        personsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder clearPersons() {
      if (personsBuilder_ == null) {
        persons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        personsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public Builder removePersons(int index) {
      if (personsBuilder_ == null) {
        ensurePersonsIsMutable();
        persons_.remove(index);
        onChanged();
      } else {
        personsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public com.x.y.accumulation.proto.pan.Person.Builder getPersonsBuilder(
        int index) {
      return getPersonsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public com.x.y.accumulation.proto.pan.PersonOrBuilder getPersonsOrBuilder(
        int index) {
      if (personsBuilder_ == null) {
        return persons_.get(index);  } else {
        return personsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public java.util.List<? extends PersonOrBuilder> 
         getPersonsOrBuilderList() {
      if (personsBuilder_ != null) {
        return personsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(persons_);
      }
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public com.x.y.accumulation.proto.pan.Person.Builder addPersonsBuilder() {
      return getPersonsFieldBuilder().addBuilder(
          com.x.y.accumulation.proto.pan.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public com.x.y.accumulation.proto.pan.Person.Builder addPersonsBuilder(
        int index) {
      return getPersonsFieldBuilder().addBuilder(
          index, com.x.y.accumulation.proto.pan.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .com.x.y.accumulation.proto.pan.Person persons = 3;</code>
     */
    public java.util.List<com.x.y.accumulation.proto.pan.Person.Builder> 
         getPersonsBuilderList() {
      return getPersonsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.x.y.accumulation.proto.pan.Person, com.x.y.accumulation.proto.pan.Person.Builder, com.x.y.accumulation.proto.pan.PersonOrBuilder> 
        getPersonsFieldBuilder() {
      if (personsBuilder_ == null) {
        personsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.x.y.accumulation.proto.pan.Person, com.x.y.accumulation.proto.pan.Person.Builder, com.x.y.accumulation.proto.pan.PersonOrBuilder>(
                persons_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        persons_ = null;
      }
      return personsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.x.y.accumulation.proto.pan.PanMessage)
  }

  // @@protoc_insertion_point(class_scope:com.x.y.accumulation.proto.pan.PanMessage)
  private static final com.x.y.accumulation.proto.pan.PanMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.x.y.accumulation.proto.pan.PanMessage();
  }

  public static com.x.y.accumulation.proto.pan.PanMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PanMessage>
      PARSER = new com.google.protobuf.AbstractParser<PanMessage>() {
    public PanMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PanMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PanMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PanMessage> getParserForType() {
    return PARSER;
  }

  public com.x.y.accumulation.proto.pan.PanMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

