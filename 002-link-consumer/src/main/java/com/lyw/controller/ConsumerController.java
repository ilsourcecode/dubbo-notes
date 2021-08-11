package com.lyw.controller;

import com.lyw.model.User;
import com.lyw.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {

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
  public String doUser(@RequestParam("id") Integer id) {
    // 因为这里的 User 对象是在另一个工程通过网络传播过来的所以需要序列化 不然会报错！！！！
    User user = someService.findUser(id);
    return user.toString();
  }
}
