package com.lyw.service.stub;

import com.lyw.model.User;
import com.lyw.service.SomeService;

/**
 *  远程接口的本地实现
 */
public class SomeServiceStub implements SomeService {

  private final SomeService someService;

  // dubbo 自动创建 someService 远程接口的代理实现，并且传入 // 这里必须有这个构造方法
  public SomeServiceStub(SomeService someService) {
    this.someService = someService;
  }

  /*--------------判断某些业务----------------*/

  @Override
  public String hello() {
    return someService.hello();
  }

  @Override
  public User findUser(Integer id) {
    if (id != 0) {
      return someService.findUser(id);
    }
    return null;
  }
}
