package com.liyam.tkk.constant;

public enum CardEnum {
  // 基本牌
  KILL((short)1,"杀"),
  DODGE((short)2,"闪"),
  PEACH((short)3,"桃"),
  ALCOHOL((short)4,"酒"),

  // 锦囊牌
  SILK_BAG_1((short)5,"顺手牵羊"),
  SILK_BAG_2((short)6,"过河拆桥"),
  SILK_BAG_3((short)7,"铁索连环"),
  SILK_BAG_4((short)8,"铁索连环"),

  //
  // 杀，火杀，雷杀，闪，酒，桃
  // 闪电，乐，无懈，借刀，五谷，五中，决斗，桃园，南蛮，万剑，顺，拆
  // +1:爪黄飞电，的卢，绝影 -1：赤兔，紫骍，大宛
  // 诸葛连弩，寒冰剑，青釭剑，雌雄双股剑，贯石斧，青龙偃月刀，丈八蛇矛，方天画戟，麒麟弓，
  // 八卦阵，仁王盾，藤甲，白银狮子，
  // 决斗。借刀，万剑，南蛮，无中生有，五谷，桃园，无懈，兵粮，火攻


  ;

  CardEnum(Short value, String name) {
    this.value = value;
    this.name = name;
  }

  private Short value;
  private String name;

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
