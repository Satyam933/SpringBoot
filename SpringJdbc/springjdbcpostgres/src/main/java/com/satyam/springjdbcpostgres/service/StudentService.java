package com.satyam.springjdbcpostgres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satyam.springjdbcpostgres.model.Student;
import com.satyam.springjdbcpostgres.repository.StudentRepo;
@Service
public class StudentService {
  private StudentRepo repo;

    /**
     * @return StudentRepo return the repo
     */
    public StudentRepo getRepo() {
        return repo;
    }

    /**
     * @param repo the repo to set
     */
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }
    
    public void addStudent(Student s1) {
      repo.save(s1);
    }

    public List<Student> getStudents() {
      return repo.findAll();
    }
}
