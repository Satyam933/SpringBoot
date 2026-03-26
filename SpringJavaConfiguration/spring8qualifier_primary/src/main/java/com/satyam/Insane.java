package com.satyam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Insane {

  private final Coder code;

  @Autowired
    //public Insane(@Qualifier("earth") Coder code) { //for Earth deafault object in spring is earth.
    public Insane(@Qualifier("MoonBean") Coder code) { //for Moon deafault object in spring is moon.
    this.code = code;
  }

  public void runInsane() {
    code.runCoder();
  }
}
