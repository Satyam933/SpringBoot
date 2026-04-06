package com.satyam.springjdbcpostgres.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
  private int rollnum;
  private String name;
  private int marks;
  

    /**
     * @return int return the rollnum
     */
    public int getRollnum() {
        return rollnum;
    }

    /**
     * @param rollnum the rollnum to set
     */
    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
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
      return "Student {" + "rollnum=" + rollnum + ", name=" + name + '\'' + ", marks=" + marks;
    }
}
