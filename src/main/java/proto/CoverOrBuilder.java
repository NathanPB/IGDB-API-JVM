// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface CoverOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Cover)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>bool alpha_channel = 2;</code>
   * @return The alphaChannel.
   */
  boolean getAlphaChannel();

  /**
   * <code>bool animated = 3;</code>
   * @return The animated.
   */
  boolean getAnimated();

  /**
   * <code>.proto.Game game = 4;</code>
   * @return Whether the game field is set.
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 4;</code>
   * @return The game.
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 4;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>int32 height = 5;</code>
   * @return The height.
   */
  int getHeight();

  /**
   * <code>string image_id = 6;</code>
   * @return The imageId.
   */
  java.lang.String getImageId();
  /**
   * <code>string image_id = 6;</code>
   * @return The bytes for imageId.
   */
  com.google.protobuf.ByteString
      getImageIdBytes();

  /**
   * <code>string url = 7;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 7;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>int32 width = 8;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <code>string checksum = 9;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 9;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
