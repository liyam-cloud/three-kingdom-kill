package com.liyam.tkk.constant;
/**
 * @Description: 基本牌
 * @Author: liyam
 * @Date: 2020/12/22/022 8:37
 */
public enum BasicCardEnum {
  KILL((short)1,"杀"),
  DODGE((short)2,"闪"),
  PEACH((short)3,"桃"),
  ALCOHOL((short)4,"酒"),
  THUNDER_KILL((short)5, "雷杀"),
  FIRE_KILL((short)6, "火杀"),
  ;

  private Short value;
  private String name;

  BasicCardEnum(Short value, String name) {
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
