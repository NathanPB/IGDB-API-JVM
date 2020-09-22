// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.GameVersionFeatureValue}
 */
public  final class GameVersionFeatureValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GameVersionFeatureValue)
    GameVersionFeatureValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameVersionFeatureValue.newBuilder() to construct.
  private GameVersionFeatureValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameVersionFeatureValue() {
    includedFeature_ = 0;
    note_ = "";
    checksum_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_GameVersionFeatureValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_GameVersionFeatureValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GameVersionFeatureValue.class, proto.GameVersionFeatureValue.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int GAME_FIELD_NUMBER = 2;
  private proto.Game game_;
  /**
   * <code>.proto.Game game = 2;</code>
   */
  public boolean hasGame() {
    return game_ != null;
  }
  /**
   * <code>.proto.Game game = 2;</code>
   */
  public proto.Game getGame() {
    return game_ == null ? proto.Game.getDefaultInstance() : game_;
  }
  /**
   * <code>.proto.Game game = 2;</code>
   */
  public proto.GameOrBuilder getGameOrBuilder() {
    return getGame();
  }

  public static final int GAME_FEATURE_FIELD_NUMBER = 3;
  private proto.GameVersionFeature gameFeature_;
  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   */
  public boolean hasGameFeature() {
    return gameFeature_ != null;
  }
  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   */
  public proto.GameVersionFeature getGameFeature() {
    return gameFeature_ == null ? proto.GameVersionFeature.getDefaultInstance() : gameFeature_;
  }
  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   */
  public proto.GameVersionFeatureOrBuilder getGameFeatureOrBuilder() {
    return getGameFeature();
  }

  public static final int INCLUDED_FEATURE_FIELD_NUMBER = 4;
  private int includedFeature_;
  /**
   * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
   */
  public int getIncludedFeatureValue() {
    return includedFeature_;
  }
  /**
   * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
   */
  public proto.GameVersionFeatureValueIncludedFeatureEnum getIncludedFeature() {
    @SuppressWarnings("deprecation")
    proto.GameVersionFeatureValueIncludedFeatureEnum result = proto.GameVersionFeatureValueIncludedFeatureEnum.valueOf(includedFeature_);
    return result == null ? proto.GameVersionFeatureValueIncludedFeatureEnum.UNRECOGNIZED : result;
  }

  public static final int NOTE_FIELD_NUMBER = 5;
  private volatile java.lang.Object note_;
  /**
   * <code>string note = 5;</code>
   */
  public java.lang.String getNote() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      note_ = s;
      return s;
    }
  }
  /**
   * <code>string note = 5;</code>
   */
  public com.google.protobuf.ByteString
      getNoteBytes() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      note_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHECKSUM_FIELD_NUMBER = 6;
  private volatile java.lang.Object checksum_;
  /**
   * <code>string checksum = 6;</code>
   */
  public java.lang.String getChecksum() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checksum_ = s;
      return s;
    }
  }
  /**
   * <code>string checksum = 6;</code>
   */
  public com.google.protobuf.ByteString
      getChecksumBytes() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checksum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static proto.GameVersionFeatureValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionFeatureValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionFeatureValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionFeatureValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionFeatureValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionFeatureValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionFeatureValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameVersionFeatureValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameVersionFeatureValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GameVersionFeatureValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameVersionFeatureValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameVersionFeatureValue parseFrom(
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
  public static Builder newBuilder(proto.GameVersionFeatureValue prototype) {
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
   * Protobuf type {@code proto.GameVersionFeatureValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GameVersionFeatureValue)
      proto.GameVersionFeatureValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_GameVersionFeatureValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_GameVersionFeatureValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GameVersionFeatureValue.class, proto.GameVersionFeatureValue.Builder.class);
    }

    // Construct using proto.GameVersionFeatureValue.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      if (gameBuilder_ == null) {
        game_ = null;
      } else {
        game_ = null;
        gameBuilder_ = null;
      }
      if (gameFeatureBuilder_ == null) {
        gameFeature_ = null;
      } else {
        gameFeature_ = null;
        gameFeatureBuilder_ = null;
      }
      includedFeature_ = 0;

      note_ = "";

      checksum_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_GameVersionFeatureValue_descriptor;
    }

    @java.lang.Override
    public proto.GameVersionFeatureValue getDefaultInstanceForType() {
      return proto.GameVersionFeatureValue.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GameVersionFeatureValue build() {
      proto.GameVersionFeatureValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GameVersionFeatureValue buildPartial() {
      proto.GameVersionFeatureValue result = new proto.GameVersionFeatureValue(this);
      result.id_ = id_;
      if (gameBuilder_ == null) {
        result.game_ = game_;
      } else {
        result.game_ = gameBuilder_.build();
      }
      if (gameFeatureBuilder_ == null) {
        result.gameFeature_ = gameFeature_;
      } else {
        result.gameFeature_ = gameFeatureBuilder_.build();
      }
      result.includedFeature_ = includedFeature_;
      result.note_ = note_;
      result.checksum_ = checksum_;
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

    private long id_ ;
    /**
     * <code>uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private proto.Game game_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> gameBuilder_;
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public boolean hasGame() {
      return gameBuilder_ != null || game_ != null;
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public proto.Game getGame() {
      if (gameBuilder_ == null) {
        return game_ == null ? proto.Game.getDefaultInstance() : game_;
      } else {
        return gameBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public Builder setGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        game_ = value;
        onChanged();
      } else {
        gameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public Builder setGame(
        proto.Game.Builder builderForValue) {
      if (gameBuilder_ == null) {
        game_ = builderForValue.build();
        onChanged();
      } else {
        gameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public Builder mergeGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (game_ != null) {
          game_ =
            proto.Game.newBuilder(game_).mergeFrom(value).buildPartial();
        } else {
          game_ = value;
        }
        onChanged();
      } else {
        gameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public Builder clearGame() {
      if (gameBuilder_ == null) {
        game_ = null;
        onChanged();
      } else {
        game_ = null;
        gameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public proto.Game.Builder getGameBuilder() {
      
      onChanged();
      return getGameFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    public proto.GameOrBuilder getGameOrBuilder() {
      if (gameBuilder_ != null) {
        return gameBuilder_.getMessageOrBuilder();
      } else {
        return game_ == null ?
            proto.Game.getDefaultInstance() : game_;
      }
    }
    /**
     * <code>.proto.Game game = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> 
        getGameFieldBuilder() {
      if (gameBuilder_ == null) {
        gameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Game, proto.Game.Builder, proto.GameOrBuilder>(
                getGame(),
                getParentForChildren(),
                isClean());
        game_ = null;
      }
      return gameBuilder_;
    }

    private proto.GameVersionFeature gameFeature_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.GameVersionFeature, proto.GameVersionFeature.Builder, proto.GameVersionFeatureOrBuilder> gameFeatureBuilder_;
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public boolean hasGameFeature() {
      return gameFeatureBuilder_ != null || gameFeature_ != null;
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public proto.GameVersionFeature getGameFeature() {
      if (gameFeatureBuilder_ == null) {
        return gameFeature_ == null ? proto.GameVersionFeature.getDefaultInstance() : gameFeature_;
      } else {
        return gameFeatureBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public Builder setGameFeature(proto.GameVersionFeature value) {
      if (gameFeatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameFeature_ = value;
        onChanged();
      } else {
        gameFeatureBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public Builder setGameFeature(
        proto.GameVersionFeature.Builder builderForValue) {
      if (gameFeatureBuilder_ == null) {
        gameFeature_ = builderForValue.build();
        onChanged();
      } else {
        gameFeatureBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public Builder mergeGameFeature(proto.GameVersionFeature value) {
      if (gameFeatureBuilder_ == null) {
        if (gameFeature_ != null) {
          gameFeature_ =
            proto.GameVersionFeature.newBuilder(gameFeature_).mergeFrom(value).buildPartial();
        } else {
          gameFeature_ = value;
        }
        onChanged();
      } else {
        gameFeatureBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public Builder clearGameFeature() {
      if (gameFeatureBuilder_ == null) {
        gameFeature_ = null;
        onChanged();
      } else {
        gameFeature_ = null;
        gameFeatureBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public proto.GameVersionFeature.Builder getGameFeatureBuilder() {
      
      onChanged();
      return getGameFeatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    public proto.GameVersionFeatureOrBuilder getGameFeatureOrBuilder() {
      if (gameFeatureBuilder_ != null) {
        return gameFeatureBuilder_.getMessageOrBuilder();
      } else {
        return gameFeature_ == null ?
            proto.GameVersionFeature.getDefaultInstance() : gameFeature_;
      }
    }
    /**
     * <code>.proto.GameVersionFeature game_feature = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.GameVersionFeature, proto.GameVersionFeature.Builder, proto.GameVersionFeatureOrBuilder> 
        getGameFeatureFieldBuilder() {
      if (gameFeatureBuilder_ == null) {
        gameFeatureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.GameVersionFeature, proto.GameVersionFeature.Builder, proto.GameVersionFeatureOrBuilder>(
                getGameFeature(),
                getParentForChildren(),
                isClean());
        gameFeature_ = null;
      }
      return gameFeatureBuilder_;
    }

    private int includedFeature_ = 0;
    /**
     * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
     */
    public int getIncludedFeatureValue() {
      return includedFeature_;
    }
    /**
     * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
     */
    public Builder setIncludedFeatureValue(int value) {
      includedFeature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
     */
    public proto.GameVersionFeatureValueIncludedFeatureEnum getIncludedFeature() {
      @SuppressWarnings("deprecation")
      proto.GameVersionFeatureValueIncludedFeatureEnum result = proto.GameVersionFeatureValueIncludedFeatureEnum.valueOf(includedFeature_);
      return result == null ? proto.GameVersionFeatureValueIncludedFeatureEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
     */
    public Builder setIncludedFeature(proto.GameVersionFeatureValueIncludedFeatureEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      includedFeature_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
     */
    public Builder clearIncludedFeature() {
      
      includedFeature_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object note_ = "";
    /**
     * <code>string note = 5;</code>
     */
    public java.lang.String getNote() {
      java.lang.Object ref = note_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        note_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string note = 5;</code>
     */
    public com.google.protobuf.ByteString
        getNoteBytes() {
      java.lang.Object ref = note_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        note_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string note = 5;</code>
     */
    public Builder setNote(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      note_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string note = 5;</code>
     */
    public Builder clearNote() {
      
      note_ = getDefaultInstance().getNote();
      onChanged();
      return this;
    }
    /**
     * <code>string note = 5;</code>
     */
    public Builder setNoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      note_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object checksum_ = "";
    /**
     * <code>string checksum = 6;</code>
     */
    public java.lang.String getChecksum() {
      java.lang.Object ref = checksum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checksum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string checksum = 6;</code>
     */
    public com.google.protobuf.ByteString
        getChecksumBytes() {
      java.lang.Object ref = checksum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checksum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string checksum = 6;</code>
     */
    public Builder setChecksum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checksum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 6;</code>
     */
    public Builder clearChecksum() {
      
      checksum_ = getDefaultInstance().getChecksum();
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 6;</code>
     */
    public Builder setChecksumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checksum_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:proto.GameVersionFeatureValue)
  }

  // @@protoc_insertion_point(class_scope:proto.GameVersionFeatureValue)
  private static final proto.GameVersionFeatureValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GameVersionFeatureValue();
  }

  public static proto.GameVersionFeatureValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameVersionFeatureValue>
      PARSER = new com.google.protobuf.AbstractParser<GameVersionFeatureValue>() {
    @java.lang.Override
    public GameVersionFeatureValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameVersionFeatureValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameVersionFeatureValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GameVersionFeatureValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

