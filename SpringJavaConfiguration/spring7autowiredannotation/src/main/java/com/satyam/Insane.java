package com.satyam;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Insane {
  
  //@Autowired injected by using field injection
  private Coder code;

  //@Autowired injected by using constructor injection, writing @Autowired can be skipped if only one constructor from spring 4.3 (Recommended)
  public Insane(Coder code) {
    this.code = code;
  }

  public Coder getCoder() {
    return code;
  }
  //@Autowired injected by using setter injection
  public void setCoder(Coder code) {
    this.code = code;
  }

  public void runInsane() {
    code.runCoder();
  }
}
