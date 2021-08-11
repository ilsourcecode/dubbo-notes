package com.lyw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyw.service.SomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootAndDubboController {

  @Reference(version = "1.0") // 去注册中心查找该服务
  private SomeService someService;

  @GetMapping("/hello")
  @ResponseBody
  public String doHello() {
    return someService.hello();
  }
}
