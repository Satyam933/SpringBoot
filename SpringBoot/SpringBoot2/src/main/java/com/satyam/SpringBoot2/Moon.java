package com.satyam.SpringBoot2;

import org.springframework.stereotype.Component;

@Component
public class Moon implements Coder {
  @Override
  public void runCoder() {
    System.out.println("I'M Insane Coder from Moon !");
  }
}
