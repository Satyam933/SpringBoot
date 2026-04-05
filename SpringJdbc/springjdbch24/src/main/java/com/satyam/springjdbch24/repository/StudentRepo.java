package com.satyam.springjdbch24.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satyam.springjdbch24.model.Student;
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
      String sql = "insert into student (rollnum, name, marks) values (?, ?, ?)";
      int rows = jdbc.update(sql, s1.getRollnum(), s1.getName(), s1.getMarks());
      System.out.println(rows + " Executed !");
    }
  
    //let's fetch data from database
    public List<Student> findAll() {
      String sql = "Select * from student";
      /*
      RowMapper<Student> mapper = new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
        Student s = new Student();
        s.setRollnum(rs.getInt("rollnum"));
        s.setName(rs.getString("name"));
        s.setMarks(rs.getInt("marks")); 
        return s; 
        }
      }; Instead of doing all this, we can use lambda expression as below :-
      */
      return jdbc.query(sql, (rs, rowNum)->{
        Student s = new Student();
        s.setRollnum(rs.getInt("rollnum"));
        s.setName(rs.getString("name"));
        s.setMarks(rs.getInt("marks")); 
        return s;
      });
    }
}
