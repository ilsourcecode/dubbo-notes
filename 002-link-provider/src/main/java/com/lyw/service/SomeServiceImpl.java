package com.lyw.service;

import com.lyw.model.User;

public class SomeServiceImpl implements SomeService{
  @Override
  public String hello() {
    return "Hello Dubbo!";
  }

  @Override
  public User findUser(Integer id) {
    User user = new User(id, "张三");
    return user;
  }
}
