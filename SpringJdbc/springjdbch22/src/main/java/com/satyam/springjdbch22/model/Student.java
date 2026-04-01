package com.satyam.springjdbch22.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
  private int rollNum;
  private String name;
  private int marks;

    /**
     * @return int return the rollNum
     */
    public int getRollNum() {
        return rollNum;
    }

    /**
     * @param rollNum the rollNum to set
     */
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
      return "Student{"+
        "rollNum="+rollNum+", name="+name+'\''+", marks="+marks+"}";
      }
    }
