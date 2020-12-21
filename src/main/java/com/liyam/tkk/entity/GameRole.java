package com.liyam.tkk.entity;
/**
 * @Description: 武将角色
 * @Author: liyam
 * @Date: 2020/12/21 17:35
 */
public class GameRole {
  private Long grId; // 武将id
  private String grName; // 武将名称
  private Short initialHp; // 初始体力值
  private Short allHp; // 体力值
  private Long kdId; // 王国id
  private KingDom kingDom; // 王国
  private String imgUrl; //图片地址
  private String remarks; // 武将描述
}
