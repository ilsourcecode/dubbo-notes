package com.lyw.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyw.model.User;
import com.lyw.service.SomeService;
import org.springframework.stereotype.Component;

@Service(version = "1.0")
@Component("someService")
public class SomeServiceImpl implements SomeService {

  @Override
  public String hello() {
    return "你好啊！！ springboot and dubbo!";
  }

  @Override
  public User findUser(Integer id) {
    return new User(id, "王五");
  }
}
