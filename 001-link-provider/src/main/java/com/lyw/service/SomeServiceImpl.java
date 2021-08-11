package com.lyw.service;

public class SomeServiceImpl implements SomeService {

  @Override
  public String hello(String meg) {

    // 调用持久层拿到数据
    return "hello " + meg;
  }
}
