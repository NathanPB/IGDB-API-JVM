// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.MultiplayerMode}
 */
public  final class MultiplayerMode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.MultiplayerMode)
    MultiplayerModeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiplayerMode.newBuilder() to construct.
  private MultiplayerMode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiplayerMode() {
    checksum_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_MultiplayerMode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_MultiplayerMode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.MultiplayerMode.class, proto.MultiplayerMode.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int CAMPAIGNCOOP_FIELD_NUMBER = 2;
  private boolean campaigncoop_;
  /**
   * <code>bool campaigncoop = 2;</code>
   */
  public boolean getCampaigncoop() {
    return campaigncoop_;
  }

  public static final int DROPIN_FIELD_NUMBER = 3;
  private boolean dropin_;
  /**
   * <code>bool dropin = 3;</code>
   */
  public boolean getDropin() {
    return dropin_;
  }

  public static final int GAME_FIELD_NUMBER = 4;
  private proto.Game game_;
  /**
   * <code>.proto.Game game = 4;</code>
   */
  public boolean hasGame() {
    return game_ != null;
  }
  /**
   * <code>.proto.Game game = 4;</code>
   */
  public proto.Game getGame() {
    return game_ == null ? proto.Game.getDefaultInstance() : game_;
  }
  /**
   * <code>.proto.Game game = 4;</code>
   */
  public proto.GameOrBuilder getGameOrBuilder() {
    return getGame();
  }

  public static final int LANCOOP_FIELD_NUMBER = 5;
  private boolean lancoop_;
  /**
   * <code>bool lancoop = 5;</code>
   */
  public boolean getLancoop() {
    return lancoop_;
  }

  public static final int OFFLINECOOP_FIELD_NUMBER = 6;
  private boolean offlinecoop_;
  /**
   * <code>bool offlinecoop = 6;</code>
   */
  public boolean getOfflinecoop() {
    return offlinecoop_;
  }

  public static final int OFFLINECOOPMAX_FIELD_NUMBER = 7;
  private int offlinecoopmax_;
  /**
   * <code>int32 offlinecoopmax = 7;</code>
   */
  public int getOfflinecoopmax() {
    return offlinecoopmax_;
  }

  public static final int OFFLINEMAX_FIELD_NUMBER = 8;
  private int offlinemax_;
  /**
   * <code>int32 offlinemax = 8;</code>
   */
  public int getOfflinemax() {
    return offlinemax_;
  }

  public static final int ONLINECOOP_FIELD_NUMBER = 9;
  private boolean onlinecoop_;
  /**
   * <code>bool onlinecoop = 9;</code>
   */
  public boolean getOnlinecoop() {
    return onlinecoop_;
  }

  public static final int ONLINECOOPMAX_FIELD_NUMBER = 10;
  private int onlinecoopmax_;
  /**
   * <code>int32 onlinecoopmax = 10;</code>
   */
  public int getOnlinecoopmax() {
    return onlinecoopmax_;
  }

  public static final int ONLINEMAX_FIELD_NUMBER = 11;
  private int onlinemax_;
  /**
   * <code>int32 onlinemax = 11;</code>
   */
  public int getOnlinemax() {
    return onlinemax_;
  }

  public static final int PLATFORM_FIELD_NUMBER = 12;
  private proto.Platform platform_;
  /**
   * <code>.proto.Platform platform = 12;</code>
   */
  public boolean hasPlatform() {
    return platform_ != null;
  }
  /**
   * <code>.proto.Platform platform = 12;</code>
   */
  public proto.Platform getPlatform() {
    return platform_ == null ? proto.Platform.getDefaultInstance() : platform_;
  }
  /**
   * <code>.proto.Platform platform = 12;</code>
   */
  public proto.PlatformOrBuilder getPlatformOrBuilder() {
    return getPlatform();
  }

  public static final int SPLITSCREEN_FIELD_NUMBER = 13;
  private boolean splitscreen_;
  /**
   * <code>bool splitscreen = 13;</code>
   */
  public boolean getSplitscreen() {
    return splitscreen_;
  }

  public static final int SPLITSCREENONLINE_FIELD_NUMBER = 14;
  private boolean splitscreenonline_;
  /**
   * <code>bool splitscreenonline = 14;</code>
   */
  public boolean getSplitscreenonline() {
    return splitscreenonline_;
  }

  public static final int CHECKSUM_FIELD_NUMBER = 15;
  private volatile java.lang.Object checksum_;
  /**
   * <code>string checksum = 15;</code>
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
   * <code>string checksum = 15;</code>
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

  public static proto.MultiplayerMode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiplayerMode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiplayerMode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiplayerMode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiplayerMode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiplayerMode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiplayerMode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiplayerMode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiplayerMode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.MultiplayerMode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiplayerMode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiplayerMode parseFrom(
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
  public static Builder newBuilder(proto.MultiplayerMode prototype) {
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
   * Protobuf type {@code proto.MultiplayerMode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.MultiplayerMode)
      proto.MultiplayerModeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_MultiplayerMode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_MultiplayerMode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.MultiplayerMode.class, proto.MultiplayerMode.Builder.class);
    }

    // Construct using proto.MultiplayerMode.newBuilder()
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

      campaigncoop_ = false;

      dropin_ = false;

      if (gameBuilder_ == null) {
        game_ = null;
      } else {
        game_ = null;
        gameBuilder_ = null;
      }
      lancoop_ = false;

      offlinecoop_ = false;

      offlinecoopmax_ = 0;

      offlinemax_ = 0;

      onlinecoop_ = false;

      onlinecoopmax_ = 0;

      onlinemax_ = 0;

      if (platformBuilder_ == null) {
        platform_ = null;
      } else {
        platform_ = null;
        platformBuilder_ = null;
      }
      splitscreen_ = false;

      splitscreenonline_ = false;

      checksum_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_MultiplayerMode_descriptor;
    }

    @java.lang.Override
    public proto.MultiplayerMode getDefaultInstanceForType() {
      return proto.MultiplayerMode.getDefaultInstance();
    }

    @java.lang.Override
    public proto.MultiplayerMode build() {
      proto.MultiplayerMode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.MultiplayerMode buildPartial() {
      proto.MultiplayerMode result = new proto.MultiplayerMode(this);
      result.id_ = id_;
      result.campaigncoop_ = campaigncoop_;
      result.dropin_ = dropin_;
      if (gameBuilder_ == null) {
        result.game_ = game_;
      } else {
        result.game_ = gameBuilder_.build();
      }
      result.lancoop_ = lancoop_;
      result.offlinecoop_ = offlinecoop_;
      result.offlinecoopmax_ = offlinecoopmax_;
      result.offlinemax_ = offlinemax_;
      result.onlinecoop_ = onlinecoop_;
      result.onlinecoopmax_ = onlinecoopmax_;
      result.onlinemax_ = onlinemax_;
      if (platformBuilder_ == null) {
        result.platform_ = platform_;
      } else {
        result.platform_ = platformBuilder_.build();
      }
      result.splitscreen_ = splitscreen_;
      result.splitscreenonline_ = splitscreenonline_;
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

    private boolean campaigncoop_ ;
    /**
     * <code>bool campaigncoop = 2;</code>
     */
    public boolean getCampaigncoop() {
      return campaigncoop_;
    }
    /**
     * <code>bool campaigncoop = 2;</code>
     */
    public Builder setCampaigncoop(boolean value) {
      
      campaigncoop_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool campaigncoop = 2;</code>
     */
    public Builder clearCampaigncoop() {
      
      campaigncoop_ = false;
      onChanged();
      return this;
    }

    private boolean dropin_ ;
    /**
     * <code>bool dropin = 3;</code>
     */
    public boolean getDropin() {
      return dropin_;
    }
    /**
     * <code>bool dropin = 3;</code>
     */
    public Builder setDropin(boolean value) {
      
      dropin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dropin = 3;</code>
     */
    public Builder clearDropin() {
      
      dropin_ = false;
      onChanged();
      return this;
    }

    private proto.Game game_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> gameBuilder_;
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public boolean hasGame() {
      return gameBuilder_ != null || game_ != null;
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public proto.Game getGame() {
      if (gameBuilder_ == null) {
        return game_ == null ? proto.Game.getDefaultInstance() : game_;
      } else {
        return gameBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Game game = 4;</code>
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
     * <code>.proto.Game game = 4;</code>
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
     * <code>.proto.Game game = 4;</code>
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
     * <code>.proto.Game game = 4;</code>
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
     * <code>.proto.Game game = 4;</code>
     */
    public proto.Game.Builder getGameBuilder() {
      
      onChanged();
      return getGameFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Game game = 4;</code>
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
     * <code>.proto.Game game = 4;</code>
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

    private boolean lancoop_ ;
    /**
     * <code>bool lancoop = 5;</code>
     */
    public boolean getLancoop() {
      return lancoop_;
    }
    /**
     * <code>bool lancoop = 5;</code>
     */
    public Builder setLancoop(boolean value) {
      
      lancoop_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool lancoop = 5;</code>
     */
    public Builder clearLancoop() {
      
      lancoop_ = false;
      onChanged();
      return this;
    }

    private boolean offlinecoop_ ;
    /**
     * <code>bool offlinecoop = 6;</code>
     */
    public boolean getOfflinecoop() {
      return offlinecoop_;
    }
    /**
     * <code>bool offlinecoop = 6;</code>
     */
    public Builder setOfflinecoop(boolean value) {
      
      offlinecoop_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool offlinecoop = 6;</code>
     */
    public Builder clearOfflinecoop() {
      
      offlinecoop_ = false;
      onChanged();
      return this;
    }

    private int offlinecoopmax_ ;
    /**
     * <code>int32 offlinecoopmax = 7;</code>
     */
    public int getOfflinecoopmax() {
      return offlinecoopmax_;
    }
    /**
     * <code>int32 offlinecoopmax = 7;</code>
     */
    public Builder setOfflinecoopmax(int value) {
      
      offlinecoopmax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 offlinecoopmax = 7;</code>
     */
    public Builder clearOfflinecoopmax() {
      
      offlinecoopmax_ = 0;
      onChanged();
      return this;
    }

    private int offlinemax_ ;
    /**
     * <code>int32 offlinemax = 8;</code>
     */
    public int getOfflinemax() {
      return offlinemax_;
    }
    /**
     * <code>int32 offlinemax = 8;</code>
     */
    public Builder setOfflinemax(int value) {
      
      offlinemax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 offlinemax = 8;</code>
     */
    public Builder clearOfflinemax() {
      
      offlinemax_ = 0;
      onChanged();
      return this;
    }

    private boolean onlinecoop_ ;
    /**
     * <code>bool onlinecoop = 9;</code>
     */
    public boolean getOnlinecoop() {
      return onlinecoop_;
    }
    /**
     * <code>bool onlinecoop = 9;</code>
     */
    public Builder setOnlinecoop(boolean value) {
      
      onlinecoop_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool onlinecoop = 9;</code>
     */
    public Builder clearOnlinecoop() {
      
      onlinecoop_ = false;
      onChanged();
      return this;
    }

    private int onlinecoopmax_ ;
    /**
     * <code>int32 onlinecoopmax = 10;</code>
     */
    public int getOnlinecoopmax() {
      return onlinecoopmax_;
    }
    /**
     * <code>int32 onlinecoopmax = 10;</code>
     */
    public Builder setOnlinecoopmax(int value) {
      
      onlinecoopmax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 onlinecoopmax = 10;</code>
     */
    public Builder clearOnlinecoopmax() {
      
      onlinecoopmax_ = 0;
      onChanged();
      return this;
    }

    private int onlinemax_ ;
    /**
     * <code>int32 onlinemax = 11;</code>
     */
    public int getOnlinemax() {
      return onlinemax_;
    }
    /**
     * <code>int32 onlinemax = 11;</code>
     */
    public Builder setOnlinemax(int value) {
      
      onlinemax_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 onlinemax = 11;</code>
     */
    public Builder clearOnlinemax() {
      
      onlinemax_ = 0;
      onChanged();
      return this;
    }

    private proto.Platform platform_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Platform, proto.Platform.Builder, proto.PlatformOrBuilder> platformBuilder_;
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public boolean hasPlatform() {
      return platformBuilder_ != null || platform_ != null;
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public proto.Platform getPlatform() {
      if (platformBuilder_ == null) {
        return platform_ == null ? proto.Platform.getDefaultInstance() : platform_;
      } else {
        return platformBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public Builder setPlatform(proto.Platform value) {
      if (platformBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        platform_ = value;
        onChanged();
      } else {
        platformBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public Builder setPlatform(
        proto.Platform.Builder builderForValue) {
      if (platformBuilder_ == null) {
        platform_ = builderForValue.build();
        onChanged();
      } else {
        platformBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public Builder mergePlatform(proto.Platform value) {
      if (platformBuilder_ == null) {
        if (platform_ != null) {
          platform_ =
            proto.Platform.newBuilder(platform_).mergeFrom(value).buildPartial();
        } else {
          platform_ = value;
        }
        onChanged();
      } else {
        platformBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public Builder clearPlatform() {
      if (platformBuilder_ == null) {
        platform_ = null;
        onChanged();
      } else {
        platform_ = null;
        platformBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public proto.Platform.Builder getPlatformBuilder() {
      
      onChanged();
      return getPlatformFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    public proto.PlatformOrBuilder getPlatformOrBuilder() {
      if (platformBuilder_ != null) {
        return platformBuilder_.getMessageOrBuilder();
      } else {
        return platform_ == null ?
            proto.Platform.getDefaultInstance() : platform_;
      }
    }
    /**
     * <code>.proto.Platform platform = 12;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Platform, proto.Platform.Builder, proto.PlatformOrBuilder> 
        getPlatformFieldBuilder() {
      if (platformBuilder_ == null) {
        platformBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Platform, proto.Platform.Builder, proto.PlatformOrBuilder>(
                getPlatform(),
                getParentForChildren(),
                isClean());
        platform_ = null;
      }
      return platformBuilder_;
    }

    private boolean splitscreen_ ;
    /**
     * <code>bool splitscreen = 13;</code>
     */
    public boolean getSplitscreen() {
      return splitscreen_;
    }
    /**
     * <code>bool splitscreen = 13;</code>
     */
    public Builder setSplitscreen(boolean value) {
      
      splitscreen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool splitscreen = 13;</code>
     */
    public Builder clearSplitscreen() {
      
      splitscreen_ = false;
      onChanged();
      return this;
    }

    private boolean splitscreenonline_ ;
    /**
     * <code>bool splitscreenonline = 14;</code>
     */
    public boolean getSplitscreenonline() {
      return splitscreenonline_;
    }
    /**
     * <code>bool splitscreenonline = 14;</code>
     */
    public Builder setSplitscreenonline(boolean value) {
      
      splitscreenonline_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool splitscreenonline = 14;</code>
     */
    public Builder clearSplitscreenonline() {
      
      splitscreenonline_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object checksum_ = "";
    /**
     * <code>string checksum = 15;</code>
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
     * <code>string checksum = 15;</code>
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
     * <code>string checksum = 15;</code>
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
     * <code>string checksum = 15;</code>
     */
    public Builder clearChecksum() {
      
      checksum_ = getDefaultInstance().getChecksum();
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 15;</code>
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


    // @@protoc_insertion_point(builder_scope:proto.MultiplayerMode)
  }

  // @@protoc_insertion_point(class_scope:proto.MultiplayerMode)
  private static final proto.MultiplayerMode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.MultiplayerMode();
  }

  public static proto.MultiplayerMode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiplayerMode>
      PARSER = new com.google.protobuf.AbstractParser<MultiplayerMode>() {
    @java.lang.Override
    public MultiplayerMode parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultiplayerMode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiplayerMode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.MultiplayerMode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

