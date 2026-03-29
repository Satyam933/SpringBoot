package com.satyam.SpringBoot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.satyam.SpringBoot3.Model.Insane;
import com.satyam.SpringBoot3.Service.InsaneService;

@SpringBootApplication
//@ComponentScan("com.satyam")
public class SpringBoot3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot3Application.class, args);
		InsaneService service = context.getBean(InsaneService.class);
		Insane insane = context.getBean(Insane.class);
		service.addInsane(insane);
	}

}
