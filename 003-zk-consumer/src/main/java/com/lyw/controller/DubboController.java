package com.lyw.controller;

import com.lyw.model.User;
import com.lyw.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboController {

  @Autowired
  private SomeService someService;

  @GetMapping("/hello")
  public String doHello(Model model) {
    String hello = someService.hello();
    model.addAttribute("hello", hello);

    return "hello";
  }

  @GetMapping(value = "/user",produces = "text/html;charset=UTF-8")
  @ResponseBody
  public String doUser() {

    User user = someService.findUser(123);
    return user.toString();
  }
}
