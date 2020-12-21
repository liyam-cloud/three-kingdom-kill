package com.liyam.tkk.entity;

import sun.dc.pr.PRError;

/**
 * @Description: 卡牌
 * @Author: liyam
 * @Date: 2020/12/21 17:33
 */
public class Card {
  private Long cId; // 卡牌id
  private String cName; // 卡牌名称
  private Long ctId; // 卡牌类型id
  private CardType cType; // 卡牌类型
  private String imgUrl; // 图片地址
  private String remarks; // 卡牌描述
  private String dId; // 花色id
  private Decor decor; // 花色
  private Short point_size; // 点数

  // 判定牌/锦囊牌
  private Short useRange; // 使用范围

  // 判定牌
  private Short judgingType; // 判定类型（花色/卡牌点数）
  private String judging; // 判定

  // 锦囊牌
  private Short select_num; // 选择数量（0自己，1~8数量，9全部）

  // 武器牌
  private Short attackRange; // 攻击范围


}
