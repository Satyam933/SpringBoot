package com.satyam.springjdbcpostgres;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satyam.springjdbcpostgres.model.Student;
import com.satyam.springjdbcpostgres.service.StudentService;

@SpringBootApplication
public class SpringjdbcpostgresApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcpostgresApplication.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setRollnum(101);
		s1.setName("Satyam");
		s1.setMarks(76);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);
		List<Student> students = service.getStudents();
		for (Student st : students) {
			System.out.println(st);
		}
	}
}
