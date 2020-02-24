package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter05JpaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Chapter05JpaApplication.class, args);
		SpringApplication application = new SpringApplication(Chapter05JpaApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
		
	}

}
