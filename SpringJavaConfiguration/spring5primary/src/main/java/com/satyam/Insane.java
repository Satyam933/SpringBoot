package com.satyam;

public class Insane {
  private Coder code;

  public Coder getCoder() {
    return code;
  }

  public void setCoder(Coder code) {
    this.code = code;
  }
  public void runInsane() {
    code.runCoder();
  }
}