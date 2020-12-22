package com.liyam.tkk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexLoginController {

  @RequestMapping("/login")
  public String login(){
    return "hello login";
  }
}
