package com.satyam.springjdbcpostgres.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satyam.springjdbcpostgres.model.Student;
@Repository
public class StudentRepo {
  private JdbcTemplate jdbc;

  public JdbcTemplate gTemplate() {
    return jdbc;
  }
@Autowired
  public void sTemplate(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  public void save(Student s1) {
    String sql = "update student set rollnum=?, name=?, marks=? where rollnum=?";
    int rows = jdbc.update(sql, s1.getRollnum(), s1.getName(), s1.getMarks(), 101);
    System.out.println(rows + " Executed !");
  }
/*
public List<Student> findAll() {
  String sql = "SELECT * FROM student";
  RowMapper<Student> mapper = new RowMapper<Student>(){
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
      Student s = new Student();
      s.setRollnum(rs.getInt("rollnum"));
      s.setName(rs.getString("name"));
      s.setMarks(rs.getInt("marks"));
      return s;
    }
  };
  return jdbc.query(sql, mapper);
}we can use lambda expression instead of doing all this.
*/
public List<Student> findAll() {
  String sql = "select * from student order by rollnum asc";
  return jdbc.query(sql,(rs,rowNum)->{
    Student s = new Student();
    s.setRollnum(rs.getInt("rollnum"));
    s.setName(rs.getString("name"));
    s.setMarks(rs.getInt("marks"));
    return s;
  });
}
}
