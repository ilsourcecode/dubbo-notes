package com.lyw.service.impl;

import com.lyw.model.User;
import com.lyw.service.SomeService;

public class SomeServiceImpl implements SomeService {
  @Override
  public String hello() {
    return "hello zookeeper and dubbo project!";
  }

  @Override
  public User findUser(Integer id) {
    User user = new User(10086, "张三");
    return user;
  }
}
