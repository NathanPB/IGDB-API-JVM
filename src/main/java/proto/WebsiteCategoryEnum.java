// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/igdb/igdbproto.proto

package proto;

/**
 * Protobuf enum {@code proto.WebsiteCategoryEnum}
 */
public enum WebsiteCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WEBSITE_CATEGORY_NULL = 0;</code>
   */
  WEBSITE_CATEGORY_NULL(0),
  /**
   * <code>WEBSITE_OFFICIAL = 1;</code>
   */
  WEBSITE_OFFICIAL(1),
  /**
   * <code>WEBSITE_WIKIA = 2;</code>
   */
  WEBSITE_WIKIA(2),
  /**
   * <code>WEBSITE_WIKIPEDIA = 3;</code>
   */
  WEBSITE_WIKIPEDIA(3),
  /**
   * <code>WEBSITE_FACEBOOK = 4;</code>
   */
  WEBSITE_FACEBOOK(4),
  /**
   * <code>WEBSITE_TWITTER = 5;</code>
   */
  WEBSITE_TWITTER(5),
  /**
   * <code>WEBSITE_TWITCH = 6;</code>
   */
  WEBSITE_TWITCH(6),
  /**
   * <code>WEBSITE_INSTAGRAM = 8;</code>
   */
  WEBSITE_INSTAGRAM(8),
  /**
   * <code>WEBSITE_YOUTUBE = 9;</code>
   */
  WEBSITE_YOUTUBE(9),
  /**
   * <code>WEBSITE_IPHONE = 10;</code>
   */
  WEBSITE_IPHONE(10),
  /**
   * <code>WEBSITE_IPAD = 11;</code>
   */
  WEBSITE_IPAD(11),
  /**
   * <code>WEBSITE_ANDROID = 12;</code>
   */
  WEBSITE_ANDROID(12),
  /**
   * <code>WEBSITE_STEAM = 13;</code>
   */
  WEBSITE_STEAM(13),
  /**
   * <code>WEBSITE_REDDIT = 14;</code>
   */
  WEBSITE_REDDIT(14),
  /**
   * <code>WEBSITE_ITCH = 15;</code>
   */
  WEBSITE_ITCH(15),
  /**
   * <code>WEBSITE_EPICGAMES = 16;</code>
   */
  WEBSITE_EPICGAMES(16),
  /**
   * <code>WEBSITE_GOG = 17;</code>
   */
  WEBSITE_GOG(17),
  /**
   * <code>WEBSITE_DISCORD = 18;</code>
   */
  WEBSITE_DISCORD(18),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WEBSITE_CATEGORY_NULL = 0;</code>
   */
  public static final int WEBSITE_CATEGORY_NULL_VALUE = 0;
  /**
   * <code>WEBSITE_OFFICIAL = 1;</code>
   */
  public static final int WEBSITE_OFFICIAL_VALUE = 1;
  /**
   * <code>WEBSITE_WIKIA = 2;</code>
   */
  public static final int WEBSITE_WIKIA_VALUE = 2;
  /**
   * <code>WEBSITE_WIKIPEDIA = 3;</code>
   */
  public static final int WEBSITE_WIKIPEDIA_VALUE = 3;
  /**
   * <code>WEBSITE_FACEBOOK = 4;</code>
   */
  public static final int WEBSITE_FACEBOOK_VALUE = 4;
  /**
   * <code>WEBSITE_TWITTER = 5;</code>
   */
  public static final int WEBSITE_TWITTER_VALUE = 5;
  /**
   * <code>WEBSITE_TWITCH = 6;</code>
   */
  public static final int WEBSITE_TWITCH_VALUE = 6;
  /**
   * <code>WEBSITE_INSTAGRAM = 8;</code>
   */
  public static final int WEBSITE_INSTAGRAM_VALUE = 8;
  /**
   * <code>WEBSITE_YOUTUBE = 9;</code>
   */
  public static final int WEBSITE_YOUTUBE_VALUE = 9;
  /**
   * <code>WEBSITE_IPHONE = 10;</code>
   */
  public static final int WEBSITE_IPHONE_VALUE = 10;
  /**
   * <code>WEBSITE_IPAD = 11;</code>
   */
  public static final int WEBSITE_IPAD_VALUE = 11;
  /**
   * <code>WEBSITE_ANDROID = 12;</code>
   */
  public static final int WEBSITE_ANDROID_VALUE = 12;
  /**
   * <code>WEBSITE_STEAM = 13;</code>
   */
  public static final int WEBSITE_STEAM_VALUE = 13;
  /**
   * <code>WEBSITE_REDDIT = 14;</code>
   */
  public static final int WEBSITE_REDDIT_VALUE = 14;
  /**
   * <code>WEBSITE_ITCH = 15;</code>
   */
  public static final int WEBSITE_ITCH_VALUE = 15;
  /**
   * <code>WEBSITE_EPICGAMES = 16;</code>
   */
  public static final int WEBSITE_EPICGAMES_VALUE = 16;
  /**
   * <code>WEBSITE_GOG = 17;</code>
   */
  public static final int WEBSITE_GOG_VALUE = 17;
  /**
   * <code>WEBSITE_DISCORD = 18;</code>
   */
  public static final int WEBSITE_DISCORD_VALUE = 18;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static WebsiteCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  public static WebsiteCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return WEBSITE_CATEGORY_NULL;
      case 1: return WEBSITE_OFFICIAL;
      case 2: return WEBSITE_WIKIA;
      case 3: return WEBSITE_WIKIPEDIA;
      case 4: return WEBSITE_FACEBOOK;
      case 5: return WEBSITE_TWITTER;
      case 6: return WEBSITE_TWITCH;
      case 8: return WEBSITE_INSTAGRAM;
      case 9: return WEBSITE_YOUTUBE;
      case 10: return WEBSITE_IPHONE;
      case 11: return WEBSITE_IPAD;
      case 12: return WEBSITE_ANDROID;
      case 13: return WEBSITE_STEAM;
      case 14: return WEBSITE_REDDIT;
      case 15: return WEBSITE_ITCH;
      case 16: return WEBSITE_EPICGAMES;
      case 17: return WEBSITE_GOG;
      case 18: return WEBSITE_DISCORD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WebsiteCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WebsiteCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WebsiteCategoryEnum>() {
          public WebsiteCategoryEnum findValueByNumber(int number) {
            return WebsiteCategoryEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.Igdbproto.getDescriptor().getEnumTypes().get(5);
  }

  private static final WebsiteCategoryEnum[] VALUES = values();

  public static WebsiteCategoryEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private WebsiteCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.WebsiteCategoryEnum)
}

