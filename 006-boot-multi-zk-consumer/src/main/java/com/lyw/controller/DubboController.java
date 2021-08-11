package com.lyw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyw.service.SomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboController {

  @Reference(version = "1.0", stub = "com.lyw.service.stub.SomeServiceStub", check = false, timeout = 1000)
  private SomeService someService;

  @GetMapping("/hello")
  @ResponseBody
  public String doHello() {
    System.out.println("Hello Dubbo!");
    return someService.hello();
  }
}
