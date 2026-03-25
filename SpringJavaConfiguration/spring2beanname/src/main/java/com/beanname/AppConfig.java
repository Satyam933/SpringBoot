package com.beanname;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean(name="beanName") // We can use name attribute to specify bean name, We can use value attribute as - @Bean({"b1", "b2"}).
  public Insane insane() { // By default method name is the bean name.
    return new Insane();
  }
}
