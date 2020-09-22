// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.ArtworkResult}
 */
public  final class ArtworkResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ArtworkResult)
    ArtworkResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArtworkResult.newBuilder() to construct.
  private ArtworkResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArtworkResult() {
    artworks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_ArtworkResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_ArtworkResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.ArtworkResult.class, proto.ArtworkResult.Builder.class);
  }

  public static final int ARTWORKS_FIELD_NUMBER = 1;
  private java.util.List<proto.Artwork> artworks_;
  /**
   * <code>repeated .proto.Artwork artworks = 1;</code>
   */
  public java.util.List<proto.Artwork> getArtworksList() {
    return artworks_;
  }
  /**
   * <code>repeated .proto.Artwork artworks = 1;</code>
   */
  public java.util.List<? extends proto.ArtworkOrBuilder> 
      getArtworksOrBuilderList() {
    return artworks_;
  }
  /**
   * <code>repeated .proto.Artwork artworks = 1;</code>
   */
  public int getArtworksCount() {
    return artworks_.size();
  }
  /**
   * <code>repeated .proto.Artwork artworks = 1;</code>
   */
  public proto.Artwork getArtworks(int index) {
    return artworks_.get(index);
  }
  /**
   * <code>repeated .proto.Artwork artworks = 1;</code>
   */
  public proto.ArtworkOrBuilder getArtworksOrBuilder(
      int index) {
    return artworks_.get(index);
  }

  public static proto.ArtworkResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ArtworkResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ArtworkResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ArtworkResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ArtworkResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ArtworkResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ArtworkResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ArtworkResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ArtworkResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.ArtworkResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ArtworkResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ArtworkResult parseFrom(
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
  public static Builder newBuilder(proto.ArtworkResult prototype) {
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
   * Protobuf type {@code proto.ArtworkResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ArtworkResult)
      proto.ArtworkResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_ArtworkResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_ArtworkResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ArtworkResult.class, proto.ArtworkResult.Builder.class);
    }

    // Construct using proto.ArtworkResult.newBuilder()
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
        getArtworksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (artworksBuilder_ == null) {
        artworks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        artworksBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_ArtworkResult_descriptor;
    }

    @java.lang.Override
    public proto.ArtworkResult getDefaultInstanceForType() {
      return proto.ArtworkResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.ArtworkResult build() {
      proto.ArtworkResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.ArtworkResult buildPartial() {
      proto.ArtworkResult result = new proto.ArtworkResult(this);
      int from_bitField0_ = bitField0_;
      if (artworksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          artworks_ = java.util.Collections.unmodifiableList(artworks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.artworks_ = artworks_;
      } else {
        result.artworks_ = artworksBuilder_.build();
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

    private java.util.List<proto.Artwork> artworks_ =
      java.util.Collections.emptyList();
    private void ensureArtworksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        artworks_ = new java.util.ArrayList<proto.Artwork>(artworks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Artwork, proto.Artwork.Builder, proto.ArtworkOrBuilder> artworksBuilder_;

    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public java.util.List<proto.Artwork> getArtworksList() {
      if (artworksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(artworks_);
      } else {
        return artworksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public int getArtworksCount() {
      if (artworksBuilder_ == null) {
        return artworks_.size();
      } else {
        return artworksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public proto.Artwork getArtworks(int index) {
      if (artworksBuilder_ == null) {
        return artworks_.get(index);
      } else {
        return artworksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder setArtworks(
        int index, proto.Artwork value) {
      if (artworksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtworksIsMutable();
        artworks_.set(index, value);
        onChanged();
      } else {
        artworksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder setArtworks(
        int index, proto.Artwork.Builder builderForValue) {
      if (artworksBuilder_ == null) {
        ensureArtworksIsMutable();
        artworks_.set(index, builderForValue.build());
        onChanged();
      } else {
        artworksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder addArtworks(proto.Artwork value) {
      if (artworksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtworksIsMutable();
        artworks_.add(value);
        onChanged();
      } else {
        artworksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder addArtworks(
        int index, proto.Artwork value) {
      if (artworksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtworksIsMutable();
        artworks_.add(index, value);
        onChanged();
      } else {
        artworksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder addArtworks(
        proto.Artwork.Builder builderForValue) {
      if (artworksBuilder_ == null) {
        ensureArtworksIsMutable();
        artworks_.add(builderForValue.build());
        onChanged();
      } else {
        artworksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder addArtworks(
        int index, proto.Artwork.Builder builderForValue) {
      if (artworksBuilder_ == null) {
        ensureArtworksIsMutable();
        artworks_.add(index, builderForValue.build());
        onChanged();
      } else {
        artworksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder addAllArtworks(
        java.lang.Iterable<? extends proto.Artwork> values) {
      if (artworksBuilder_ == null) {
        ensureArtworksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, artworks_);
        onChanged();
      } else {
        artworksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder clearArtworks() {
      if (artworksBuilder_ == null) {
        artworks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        artworksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public Builder removeArtworks(int index) {
      if (artworksBuilder_ == null) {
        ensureArtworksIsMutable();
        artworks_.remove(index);
        onChanged();
      } else {
        artworksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public proto.Artwork.Builder getArtworksBuilder(
        int index) {
      return getArtworksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public proto.ArtworkOrBuilder getArtworksOrBuilder(
        int index) {
      if (artworksBuilder_ == null) {
        return artworks_.get(index);  } else {
        return artworksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public java.util.List<? extends proto.ArtworkOrBuilder> 
         getArtworksOrBuilderList() {
      if (artworksBuilder_ != null) {
        return artworksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(artworks_);
      }
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public proto.Artwork.Builder addArtworksBuilder() {
      return getArtworksFieldBuilder().addBuilder(
          proto.Artwork.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public proto.Artwork.Builder addArtworksBuilder(
        int index) {
      return getArtworksFieldBuilder().addBuilder(
          index, proto.Artwork.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Artwork artworks = 1;</code>
     */
    public java.util.List<proto.Artwork.Builder> 
         getArtworksBuilderList() {
      return getArtworksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Artwork, proto.Artwork.Builder, proto.ArtworkOrBuilder> 
        getArtworksFieldBuilder() {
      if (artworksBuilder_ == null) {
        artworksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Artwork, proto.Artwork.Builder, proto.ArtworkOrBuilder>(
                artworks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        artworks_ = null;
      }
      return artworksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.ArtworkResult)
  }

  // @@protoc_insertion_point(class_scope:proto.ArtworkResult)
  private static final proto.ArtworkResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.ArtworkResult();
  }

  public static proto.ArtworkResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArtworkResult>
      PARSER = new com.google.protobuf.AbstractParser<ArtworkResult>() {
    @java.lang.Override
    public ArtworkResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArtworkResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArtworkResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.ArtworkResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

