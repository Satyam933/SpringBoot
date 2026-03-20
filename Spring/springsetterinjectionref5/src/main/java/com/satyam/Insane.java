package com.satyam;

public class Insane {
    private RefClass ref;
    public RefClass getRef() {
        return ref;
    }
    public void setRef(RefClass ref) {
        this.ref = ref;
    }
    public void runInsane() {
      ref.run();
  }
}
