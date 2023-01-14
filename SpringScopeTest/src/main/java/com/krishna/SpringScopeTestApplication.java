package com.krishna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringScopeTestApplication {

	@Autowired
	private Student stud;

	@Autowired
	private Student stud2;
	public void display() {
		stud.setsId("101");
		stud.setsName("Sujith");
		System.out.println(stud.getsId());
		System.out.println(stud.getsName());
		System.out.println(stud2.getsId());
		System.out.println(stud2.getsName());
		System.out.println("End the application");
	}
	public static void main(String[] args) {
		ApplicationContext context = new SpringApplication(SpringScopeTestApplication.class).run(args);
		SpringScopeTestApplication obj =context.getBean(SpringScopeTestApplication.class);
		obj.display();
	}

	

	

	
}
