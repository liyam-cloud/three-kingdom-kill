package com.liyam.tkk.constant;

public enum DecorEnum {
  SPADE((short)1,"黑桃"),
  HEART((short)2,"红桃"),
  DIAMOND((short)3,"方片"),
  CLUB((short)4,"梅花"),
  ;
  private Short value;
  private String name;

  DecorEnum(Short value, String name) {
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
