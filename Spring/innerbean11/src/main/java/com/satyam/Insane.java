package com.satyam;

public class Insane {
  private Coder coder;
  
  public Coder getCoder(){
    return coder;
  }
  public void setCoder(Coder coder) {
    this.coder = coder;
  }

  public void runInsane() {
    System.out.println("I'm Insane !");
    coder.runCoder();
  }
}
