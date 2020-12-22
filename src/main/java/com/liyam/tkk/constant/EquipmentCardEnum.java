package com.liyam.tkk.constant;

public enum EquipmentCardEnum {
  //武器
  ZHU_GE_LIAN_NU((short)1,"诸葛连弩"),
  HAN_BING_JIAN((short)2,"寒冰剑"),
  QING_GANG_JIAN((short)3,"青釭剑"),
  CI_XIONG_SHUANG_GU_JIAN((short)4,"雌雄双股剑"),
  GUAN_SHI_FU((short)5,"贯石斧"),
  QING_LONG_YAN_YUE_DAO((short)6,"青龙偃月刀"),
  ZHANG_BA_SHE_MAO((short)6,"丈八蛇矛"),
  FANG_TIAN_HUA_JI((short)6,"方天画戟"),
  QI_LIN_GONG((short)6,"麒麟弓"),
  //防具
  BA_GUA_ZHEN((short)7, "八卦阵"),
  REN_WANG_DUN((short)8, "仁王盾"),
  TENG_JIA((short)9, "藤甲"),
  BAI_YIN_SHI_ZI((short)10, "白银狮子"),
  //坐骑
  ADD_HORSE((short)11,"+1马"),
  REDUCE_HORSE((short)12,"-1马"),
  ;
  private Short value;
  private String name;

  EquipmentCardEnum(Short value, String name) {
    this.value = value;
    this.name = name;
  }

  public Short getValue() {
    return value;
  }

  public void setValue(Short value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
