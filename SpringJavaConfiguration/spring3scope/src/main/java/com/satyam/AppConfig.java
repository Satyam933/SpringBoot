package com.satyam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
@Bean
@Scope("prototype")//We can create n number of objects by using scope as prototype.
public Insane insane() {
  return new Insane();
  }  
}
