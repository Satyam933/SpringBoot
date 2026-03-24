package com.satyam.third3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder {
  @Autowired
  Mf mff;  
  public void compile() {
    System.out.print("Coder, ");
    mff.mf();
  }
}
