// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.AchievementRankEnum}
 */
public enum AchievementRankEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACHIEVEMENT_RANK_NULL = 0;</code>
   */
  ACHIEVEMENT_RANK_NULL(0),
  /**
   * <code>BRONZE = 1;</code>
   */
  BRONZE(1),
  /**
   * <code>SILVER = 2;</code>
   */
  SILVER(2),
  /**
   * <code>GOLD = 3;</code>
   */
  GOLD(3),
  /**
   * <code>PLATINUM = 4;</code>
   */
  PLATINUM(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACHIEVEMENT_RANK_NULL = 0;</code>
   */
  public static final int ACHIEVEMENT_RANK_NULL_VALUE = 0;
  /**
   * <code>BRONZE = 1;</code>
   */
  public static final int BRONZE_VALUE = 1;
  /**
   * <code>SILVER = 2;</code>
   */
  public static final int SILVER_VALUE = 2;
  /**
   * <code>GOLD = 3;</code>
   */
  public static final int GOLD_VALUE = 3;
  /**
   * <code>PLATINUM = 4;</code>
   */
  public static final int PLATINUM_VALUE = 4;


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
  public static AchievementRankEnum valueOf(int value) {
    return forNumber(value);
  }

  public static AchievementRankEnum forNumber(int value) {
    switch (value) {
      case 0: return ACHIEVEMENT_RANK_NULL;
      case 1: return BRONZE;
      case 2: return SILVER;
      case 3: return GOLD;
      case 4: return PLATINUM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AchievementRankEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AchievementRankEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AchievementRankEnum>() {
          public AchievementRankEnum findValueByNumber(int number) {
            return AchievementRankEnum.forNumber(number);
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
    return proto.IGDBProtoFile.getDescriptor()
        .getEnumTypes().get(2);
  }

  private static final AchievementRankEnum[] VALUES = values();

  public static AchievementRankEnum valueOf(
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

  private AchievementRankEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.AchievementRankEnum)
}
