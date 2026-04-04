package com.satyam.springjdbch22.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satyam.springjdbch22.model.Student;

@Repository
public class StudentRepo {
  
  private JdbcTemplate jdbc;
  
  public List<Student> findAll() {
    List<Student> students = new ArrayList<>();// As we don't use database, so let's try to print dummy data.
    return students;
  }

  public JdbcTemplate getJdbc() {
    return jdbc;
  }
    
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
      this.jdbc = jdbc;
    }
    
    public void save(Student s1) {
    //System.out.println("Saved");
    String sql = "insert into student (rollNum, name, marks) values(?, ?, ?)";
    int rows = jdbc.update(sql, s1.getRollNum(), s1.getName(), s1.getMarks());
    System.out.println(rows + "Executed !");// 0-->Data not added, 1--> Data added.
  }    
}
