package com.lyw.service.impl;

import com.lyw.model.User;
import com.lyw.service.SomeService;

public class SomeServiceImpl implements SomeService {
  @Override
  public String hello() {
    return "Hello zookeeper and dubbo !";
  }

  @Override
  public User findUser(Integer id) {
    User user = new User(id, "ls 00");
    return user;
  }
}
