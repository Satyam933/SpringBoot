package com.satyam.springjdbch23;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satyam.springjdbch23.model.Student;
import com.satyam.springjdbch23.service.StudentService;

@SpringBootApplication
public class Springjdbch23Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springjdbch23Application.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setRollNum(101);
		s1.setName("Satyam");
		s1.setMarks(78);
    
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);
	}

}
