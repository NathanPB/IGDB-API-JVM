// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/igdb/igdbproto.proto

package proto;

public interface CompanyLogoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.CompanyLogo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>bool alpha_channel = 2;</code>
   */
  boolean getAlphaChannel();

  /**
   * <code>bool animated = 3;</code>
   */
  boolean getAnimated();

  /**
   * <code>int32 height = 4;</code>
   */
  int getHeight();

  /**
   * <code>string image_id = 5;</code>
   */
  java.lang.String getImageId();
  /**
   * <code>string image_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getImageIdBytes();

  /**
   * <code>string url = 6;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 6;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>int32 width = 7;</code>
   */
  int getWidth();

  /**
   * <code>string checksum = 8;</code>
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 8;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
