package com.satyam;

import org.springframework.stereotype.Component;

@Component("MoonBean") //we can specify bean name as @Component("MoonBean") but we have to use same when searching for it. Qualifier has greater priority than Primary so this will executes.
public class Moon implements Coder {
  @Override
  public void runCoder() {
    System.out.println("I'M Insane Coder From Moon !");
  }
}
