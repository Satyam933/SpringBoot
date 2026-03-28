package com.satyam.SpringBoot2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Earth implements Coder {
  @Override
  public void runCoder() {
    System.out.println("I'M Insane Coder from Earth !");
  }
}
