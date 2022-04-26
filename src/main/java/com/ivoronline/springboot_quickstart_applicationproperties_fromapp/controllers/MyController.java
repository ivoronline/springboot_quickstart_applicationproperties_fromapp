package com.ivoronline.springboot_quickstart_applicationproperties_fromapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Value("${custom.message}")
  private String message;

  //==================================================================
  // HELLO
  //==================================================================
  @ResponseBody
  @RequestMapping("Hello")
  String hello() {
    return message;
  }

}
