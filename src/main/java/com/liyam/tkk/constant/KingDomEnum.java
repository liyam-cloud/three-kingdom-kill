package com.liyam.tkk.constant;

public enum KingDomEnum {
  WEI((short)1,"魏"),
  SHU((short)2,"蜀"),
  WU((short)3,"吴"),
  QUN((short)4,"群"),
  ;
  private Short value;
  private String name;

  KingDomEnum(Short value, String name) {
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
