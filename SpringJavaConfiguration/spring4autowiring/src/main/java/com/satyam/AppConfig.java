package com.satyam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public Insane insane(@Autowired Coder code) { //In newer versions we can skip writing @Autowired.
    Insane obj = new Insane();
    obj.setCode(code);
    return obj;
  }

  @Bean
  public Coder code() {
    return new Coder();
  }

}
