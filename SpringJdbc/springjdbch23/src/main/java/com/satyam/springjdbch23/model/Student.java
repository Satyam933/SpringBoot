package com.satyam.springjdbch23.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
  private int rollnum;
  private String name;
  private int marks;

    public int getRollNum() {
        return rollnum;
    }

    public void setRollNum(int rollnum) {
        this.rollnum = rollnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
      return "Student{"+
              "rollnum="+rollnum+
              ",name="+name+'\''+
          ",marks=" + marks;
    }
}
