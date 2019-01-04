// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.PulseGroupResult}
 */
public  final class PulseGroupResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PulseGroupResult)
    PulseGroupResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PulseGroupResult.newBuilder() to construct.
  private PulseGroupResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PulseGroupResult() {
    pulsegroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_PulseGroupResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_PulseGroupResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PulseGroupResult.class, proto.PulseGroupResult.Builder.class);
  }

  public static final int PULSEGROUPS_FIELD_NUMBER = 1;
  private java.util.List<proto.PulseGroup> pulsegroups_;
  /**
   * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
   */
  public java.util.List<proto.PulseGroup> getPulsegroupsList() {
    return pulsegroups_;
  }
  /**
   * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
   */
  public java.util.List<? extends proto.PulseGroupOrBuilder> 
      getPulsegroupsOrBuilderList() {
    return pulsegroups_;
  }
  /**
   * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
   */
  public int getPulsegroupsCount() {
    return pulsegroups_.size();
  }
  /**
   * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
   */
  public proto.PulseGroup getPulsegroups(int index) {
    return pulsegroups_.get(index);
  }
  /**
   * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
   */
  public proto.PulseGroupOrBuilder getPulsegroupsOrBuilder(
      int index) {
    return pulsegroups_.get(index);
  }

  public static proto.PulseGroupResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PulseGroupResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PulseGroupResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PulseGroupResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PulseGroupResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PulseGroupResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PulseGroupResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PulseGroupResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PulseGroupResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.PulseGroupResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PulseGroupResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PulseGroupResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.PulseGroupResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code proto.PulseGroupResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PulseGroupResult)
      proto.PulseGroupResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_PulseGroupResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_PulseGroupResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PulseGroupResult.class, proto.PulseGroupResult.Builder.class);
    }

    // Construct using proto.PulseGroupResult.newBuilder()
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
        getPulsegroupsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pulsegroupsBuilder_ == null) {
        pulsegroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pulsegroupsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_PulseGroupResult_descriptor;
    }

    @java.lang.Override
    public proto.PulseGroupResult getDefaultInstanceForType() {
      return proto.PulseGroupResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.PulseGroupResult build() {
      proto.PulseGroupResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.PulseGroupResult buildPartial() {
      proto.PulseGroupResult result = new proto.PulseGroupResult(this);
      int from_bitField0_ = bitField0_;
      if (pulsegroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          pulsegroups_ = java.util.Collections.unmodifiableList(pulsegroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pulsegroups_ = pulsegroups_;
      } else {
        result.pulsegroups_ = pulsegroupsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.PulseGroup> pulsegroups_ =
      java.util.Collections.emptyList();
    private void ensurePulsegroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        pulsegroups_ = new java.util.ArrayList<proto.PulseGroup>(pulsegroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PulseGroup, proto.PulseGroup.Builder, proto.PulseGroupOrBuilder> pulsegroupsBuilder_;

    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public java.util.List<proto.PulseGroup> getPulsegroupsList() {
      if (pulsegroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pulsegroups_);
      } else {
        return pulsegroupsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public int getPulsegroupsCount() {
      if (pulsegroupsBuilder_ == null) {
        return pulsegroups_.size();
      } else {
        return pulsegroupsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public proto.PulseGroup getPulsegroups(int index) {
      if (pulsegroupsBuilder_ == null) {
        return pulsegroups_.get(index);
      } else {
        return pulsegroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder setPulsegroups(
        int index, proto.PulseGroup value) {
      if (pulsegroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePulsegroupsIsMutable();
        pulsegroups_.set(index, value);
        onChanged();
      } else {
        pulsegroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder setPulsegroups(
        int index, proto.PulseGroup.Builder builderForValue) {
      if (pulsegroupsBuilder_ == null) {
        ensurePulsegroupsIsMutable();
        pulsegroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        pulsegroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder addPulsegroups(proto.PulseGroup value) {
      if (pulsegroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePulsegroupsIsMutable();
        pulsegroups_.add(value);
        onChanged();
      } else {
        pulsegroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder addPulsegroups(
        int index, proto.PulseGroup value) {
      if (pulsegroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePulsegroupsIsMutable();
        pulsegroups_.add(index, value);
        onChanged();
      } else {
        pulsegroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder addPulsegroups(
        proto.PulseGroup.Builder builderForValue) {
      if (pulsegroupsBuilder_ == null) {
        ensurePulsegroupsIsMutable();
        pulsegroups_.add(builderForValue.build());
        onChanged();
      } else {
        pulsegroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder addPulsegroups(
        int index, proto.PulseGroup.Builder builderForValue) {
      if (pulsegroupsBuilder_ == null) {
        ensurePulsegroupsIsMutable();
        pulsegroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        pulsegroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder addAllPulsegroups(
        java.lang.Iterable<? extends proto.PulseGroup> values) {
      if (pulsegroupsBuilder_ == null) {
        ensurePulsegroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pulsegroups_);
        onChanged();
      } else {
        pulsegroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder clearPulsegroups() {
      if (pulsegroupsBuilder_ == null) {
        pulsegroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pulsegroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public Builder removePulsegroups(int index) {
      if (pulsegroupsBuilder_ == null) {
        ensurePulsegroupsIsMutable();
        pulsegroups_.remove(index);
        onChanged();
      } else {
        pulsegroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public proto.PulseGroup.Builder getPulsegroupsBuilder(
        int index) {
      return getPulsegroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public proto.PulseGroupOrBuilder getPulsegroupsOrBuilder(
        int index) {
      if (pulsegroupsBuilder_ == null) {
        return pulsegroups_.get(index);  } else {
        return pulsegroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public java.util.List<? extends proto.PulseGroupOrBuilder> 
         getPulsegroupsOrBuilderList() {
      if (pulsegroupsBuilder_ != null) {
        return pulsegroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pulsegroups_);
      }
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public proto.PulseGroup.Builder addPulsegroupsBuilder() {
      return getPulsegroupsFieldBuilder().addBuilder(
          proto.PulseGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public proto.PulseGroup.Builder addPulsegroupsBuilder(
        int index) {
      return getPulsegroupsFieldBuilder().addBuilder(
          index, proto.PulseGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PulseGroup pulsegroups = 1;</code>
     */
    public java.util.List<proto.PulseGroup.Builder> 
         getPulsegroupsBuilderList() {
      return getPulsegroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PulseGroup, proto.PulseGroup.Builder, proto.PulseGroupOrBuilder> 
        getPulsegroupsFieldBuilder() {
      if (pulsegroupsBuilder_ == null) {
        pulsegroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.PulseGroup, proto.PulseGroup.Builder, proto.PulseGroupOrBuilder>(
                pulsegroups_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        pulsegroups_ = null;
      }
      return pulsegroupsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.PulseGroupResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PulseGroupResult)
  private static final proto.PulseGroupResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PulseGroupResult();
  }

  public static proto.PulseGroupResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PulseGroupResult>
      PARSER = new com.google.protobuf.AbstractParser<PulseGroupResult>() {
    @java.lang.Override
    public PulseGroupResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PulseGroupResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PulseGroupResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.PulseGroupResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
