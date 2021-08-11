package com.lyw.service.impl;

import com.lyw.model.User;
import com.lyw.service.SomeService;

public class NewSomeServiceImpl implements SomeService {
  @Override
  public String hello() {
    return "Hello dubbo version -> 2.0";
  }

  @Override
  public User findUser(Integer id) {
    return new User(id, "李四");
  }
}
