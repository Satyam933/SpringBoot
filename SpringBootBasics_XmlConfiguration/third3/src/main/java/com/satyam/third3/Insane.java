package com.satyam.third3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Insane {
@Autowired
  Coder coder;
  public void code() {
    System.out.print("I'M INSANE ");
    coder.compile();
  }
}
