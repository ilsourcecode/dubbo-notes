package com.lyw.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

  @Bean
  /***
   *  创建 ApplicationConfig 对象
   */
  public ApplicationConfig applicationConfig() {
    ApplicationConfig config = new ApplicationConfig();
    config.setName("boot-multi-zk-consumer");

    return config;
  }

  @Bean
  /***
   *  构建注册配置 注册服务
   */
  public RegistryConfig registryConfig() {
    RegistryConfig config = new RegistryConfig();
    config.setAddress("zookeeper://localhost:2181");

    return config;
  }


  @Bean
  /***
   *  指定发布的断后号
   */
  public ProtocolConfig protocolConfig() {
    ProtocolConfig config = new ProtocolConfig();
    config.setName("dubbo");
    config.setPort(20880);

    return config;
  }
}
