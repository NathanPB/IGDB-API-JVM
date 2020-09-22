// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.CharacterResult}
 */
public  final class CharacterResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CharacterResult)
    CharacterResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CharacterResult.newBuilder() to construct.
  private CharacterResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CharacterResult() {
    characters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_CharacterResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_CharacterResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.CharacterResult.class, proto.CharacterResult.Builder.class);
  }

  public static final int CHARACTERS_FIELD_NUMBER = 1;
  private java.util.List<proto.Character> characters_;
  /**
   * <code>repeated .proto.Character characters = 1;</code>
   */
  public java.util.List<proto.Character> getCharactersList() {
    return characters_;
  }
  /**
   * <code>repeated .proto.Character characters = 1;</code>
   */
  public java.util.List<? extends proto.CharacterOrBuilder> 
      getCharactersOrBuilderList() {
    return characters_;
  }
  /**
   * <code>repeated .proto.Character characters = 1;</code>
   */
  public int getCharactersCount() {
    return characters_.size();
  }
  /**
   * <code>repeated .proto.Character characters = 1;</code>
   */
  public proto.Character getCharacters(int index) {
    return characters_.get(index);
  }
  /**
   * <code>repeated .proto.Character characters = 1;</code>
   */
  public proto.CharacterOrBuilder getCharactersOrBuilder(
      int index) {
    return characters_.get(index);
  }

  public static proto.CharacterResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CharacterResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CharacterResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CharacterResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CharacterResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CharacterResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CharacterResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CharacterResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CharacterResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.CharacterResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CharacterResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CharacterResult parseFrom(
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
  public static Builder newBuilder(proto.CharacterResult prototype) {
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
   * Protobuf type {@code proto.CharacterResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CharacterResult)
      proto.CharacterResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_CharacterResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_CharacterResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.CharacterResult.class, proto.CharacterResult.Builder.class);
    }

    // Construct using proto.CharacterResult.newBuilder()
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
        getCharactersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (charactersBuilder_ == null) {
        characters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        charactersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_CharacterResult_descriptor;
    }

    @java.lang.Override
    public proto.CharacterResult getDefaultInstanceForType() {
      return proto.CharacterResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.CharacterResult build() {
      proto.CharacterResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.CharacterResult buildPartial() {
      proto.CharacterResult result = new proto.CharacterResult(this);
      int from_bitField0_ = bitField0_;
      if (charactersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          characters_ = java.util.Collections.unmodifiableList(characters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.characters_ = characters_;
      } else {
        result.characters_ = charactersBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.Character> characters_ =
      java.util.Collections.emptyList();
    private void ensureCharactersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        characters_ = new java.util.ArrayList<proto.Character>(characters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Character, proto.Character.Builder, proto.CharacterOrBuilder> charactersBuilder_;

    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public java.util.List<proto.Character> getCharactersList() {
      if (charactersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(characters_);
      } else {
        return charactersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public int getCharactersCount() {
      if (charactersBuilder_ == null) {
        return characters_.size();
      } else {
        return charactersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public proto.Character getCharacters(int index) {
      if (charactersBuilder_ == null) {
        return characters_.get(index);
      } else {
        return charactersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder setCharacters(
        int index, proto.Character value) {
      if (charactersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCharactersIsMutable();
        characters_.set(index, value);
        onChanged();
      } else {
        charactersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder setCharacters(
        int index, proto.Character.Builder builderForValue) {
      if (charactersBuilder_ == null) {
        ensureCharactersIsMutable();
        characters_.set(index, builderForValue.build());
        onChanged();
      } else {
        charactersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder addCharacters(proto.Character value) {
      if (charactersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCharactersIsMutable();
        characters_.add(value);
        onChanged();
      } else {
        charactersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder addCharacters(
        int index, proto.Character value) {
      if (charactersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCharactersIsMutable();
        characters_.add(index, value);
        onChanged();
      } else {
        charactersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder addCharacters(
        proto.Character.Builder builderForValue) {
      if (charactersBuilder_ == null) {
        ensureCharactersIsMutable();
        characters_.add(builderForValue.build());
        onChanged();
      } else {
        charactersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder addCharacters(
        int index, proto.Character.Builder builderForValue) {
      if (charactersBuilder_ == null) {
        ensureCharactersIsMutable();
        characters_.add(index, builderForValue.build());
        onChanged();
      } else {
        charactersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder addAllCharacters(
        java.lang.Iterable<? extends proto.Character> values) {
      if (charactersBuilder_ == null) {
        ensureCharactersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, characters_);
        onChanged();
      } else {
        charactersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder clearCharacters() {
      if (charactersBuilder_ == null) {
        characters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        charactersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public Builder removeCharacters(int index) {
      if (charactersBuilder_ == null) {
        ensureCharactersIsMutable();
        characters_.remove(index);
        onChanged();
      } else {
        charactersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public proto.Character.Builder getCharactersBuilder(
        int index) {
      return getCharactersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public proto.CharacterOrBuilder getCharactersOrBuilder(
        int index) {
      if (charactersBuilder_ == null) {
        return characters_.get(index);  } else {
        return charactersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public java.util.List<? extends proto.CharacterOrBuilder> 
         getCharactersOrBuilderList() {
      if (charactersBuilder_ != null) {
        return charactersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(characters_);
      }
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public proto.Character.Builder addCharactersBuilder() {
      return getCharactersFieldBuilder().addBuilder(
          proto.Character.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public proto.Character.Builder addCharactersBuilder(
        int index) {
      return getCharactersFieldBuilder().addBuilder(
          index, proto.Character.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Character characters = 1;</code>
     */
    public java.util.List<proto.Character.Builder> 
         getCharactersBuilderList() {
      return getCharactersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Character, proto.Character.Builder, proto.CharacterOrBuilder> 
        getCharactersFieldBuilder() {
      if (charactersBuilder_ == null) {
        charactersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Character, proto.Character.Builder, proto.CharacterOrBuilder>(
                characters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        characters_ = null;
      }
      return charactersBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.CharacterResult)
  }

  // @@protoc_insertion_point(class_scope:proto.CharacterResult)
  private static final proto.CharacterResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.CharacterResult();
  }

  public static proto.CharacterResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CharacterResult>
      PARSER = new com.google.protobuf.AbstractParser<CharacterResult>() {
    @java.lang.Override
    public CharacterResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CharacterResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CharacterResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.CharacterResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

