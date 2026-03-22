package com.satyam;

public class Insane {
  private Coder code;

  public Coder getCode() {
    return code;
  }

  public void setCode(Coder code) {
    this.code = code;
  }

  public void runInsane(){
    code.run();
  }
}
