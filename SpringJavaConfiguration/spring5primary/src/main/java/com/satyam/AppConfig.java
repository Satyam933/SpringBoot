package com.satyam;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
  @Bean
  public Insane insane(@Qualifier("earth") Coder code) { //Qualifier has higher priority than @Primary as it specify exact bean while @primary specifies Default bean.  
    Insane obj = new Insane();
    obj.setCoder(code);
    return obj;
  }

  @Bean
  public Earth earth() {
    return new Earth();
  }

  @Bean
  @Primary
  public Moon moon() {
    return new Moon();
  }
}
