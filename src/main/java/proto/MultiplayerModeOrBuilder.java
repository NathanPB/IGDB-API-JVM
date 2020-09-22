// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/igdb/igdbproto.proto

package proto;

public interface MultiplayerModeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.MultiplayerMode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>bool campaigncoop = 2;</code>
   */
  boolean getCampaigncoop();

  /**
   * <code>bool dropin = 3;</code>
   */
  boolean getDropin();

  /**
   * <code>.proto.Game game = 4;</code>
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 4;</code>
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 4;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>bool lancoop = 5;</code>
   */
  boolean getLancoop();

  /**
   * <code>bool offlinecoop = 6;</code>
   */
  boolean getOfflinecoop();

  /**
   * <code>int32 offlinecoopmax = 7;</code>
   */
  int getOfflinecoopmax();

  /**
   * <code>int32 offlinemax = 8;</code>
   */
  int getOfflinemax();

  /**
   * <code>bool onlinecoop = 9;</code>
   */
  boolean getOnlinecoop();

  /**
   * <code>int32 onlinecoopmax = 10;</code>
   */
  int getOnlinecoopmax();

  /**
   * <code>int32 onlinemax = 11;</code>
   */
  int getOnlinemax();

  /**
   * <code>.proto.Platform platform = 12;</code>
   */
  boolean hasPlatform();
  /**
   * <code>.proto.Platform platform = 12;</code>
   */
  proto.Platform getPlatform();
  /**
   * <code>.proto.Platform platform = 12;</code>
   */
  proto.PlatformOrBuilder getPlatformOrBuilder();

  /**
   * <code>bool splitscreen = 13;</code>
   */
  boolean getSplitscreen();

  /**
   * <code>bool splitscreenonline = 14;</code>
   */
  boolean getSplitscreenonline();

  /**
   * <code>string checksum = 15;</code>
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 15;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
