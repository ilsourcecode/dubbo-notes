package com.lyw.controller;

import com.lyw.model.User;
import com.lyw.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboZookeeperController {

  @Autowired
  // 引用 1.0 版本的实现类
  private SomeService someService;

  @Autowired
  // 引用 2.0 版本的实现类 ' 名字相同 '
  private SomeService newSomeService;

  @GetMapping(value = "/hello")
  public String doHello() {
    return someService.hello() + " <--> " + newSomeService.hello();
  }

  @GetMapping(value = "/user", produces = "text/html;charset=UTF-8")
  public String doUser(Integer id) {
    return someService.findUser(123).toString() + " <--> " + newSomeService.findUser(123).toString();
  }
}
