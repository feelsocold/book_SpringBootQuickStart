 package com.rubypaper;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rubypaper", "com.ruby"})
public class Chapter01Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter01Application.class, args);
		

//	JAVA 애플리케이션으로 실행하기
//		SpringApplication application = new SpringApplication(Chapter01Application.class);
		
//		application.setWebApplicationType(WebApplicationType.NONE);			// 자바 애플리케이션으로 프로젝트 실행
//		application.setWebApplicationType(WebApplicationType.SERVLET);		// 웹 애플리케이션으로 프로젝트 실행
//		application.run(args); 
	
// 배너OFF
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);
		
		
	}

}
