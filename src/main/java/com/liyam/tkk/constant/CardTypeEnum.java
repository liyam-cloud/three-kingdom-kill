package com.liyam.tkk.constant;
/**
 * @Description: 卡牌分类
 * @Author: liyam
 * @Date: 2020/12/22/022 8:38
 */
public enum CardTypeEnum {
  BASIC((short)1,"基本牌"),
  SILK_BAG((short)2,"锦囊牌"),
  EQUIPMENT((short)3,"装备牌"),
  ;

  private Short value;
  private String name;

  CardTypeEnum(Short value, String name) {
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
