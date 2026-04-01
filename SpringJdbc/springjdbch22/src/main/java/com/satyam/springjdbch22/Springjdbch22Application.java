package com.satyam.springjdbch22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satyam.springjdbch22.model.Student;
import com.satyam.springjdbch22.service.StudentService;

@SpringBootApplication
public class Springjdbch22Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springjdbch22Application.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setRollNum(101);
		s1.setName("Satyam");
		s1.setMarks(82);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1); //This method is inside service layer.
	}
}
