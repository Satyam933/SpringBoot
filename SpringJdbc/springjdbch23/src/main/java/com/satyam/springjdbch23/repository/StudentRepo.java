package com.satyam.springjdbch23.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satyam.springjdbch23.model.Student;
@Repository
public class StudentRepo {
  private JdbcTemplate jdbc;

  public JdbcTemplate getJdbc() {
    return jdbc;
  }
  @Autowired
  public void setJdbc(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }
  public void save(Student s1) {
    //  System.out.println("Saved !"); let's communicate with database.
    String sql = "insert into student (rollnum, name, marks) values(?, ?, ?)";//create student in schema in resource folder.
    int rows = jdbc.update(sql, s1.getRollNum(), s1.getName(), s1.getMarks());
    System.out.println(rows + " Executed !");
  }
}
