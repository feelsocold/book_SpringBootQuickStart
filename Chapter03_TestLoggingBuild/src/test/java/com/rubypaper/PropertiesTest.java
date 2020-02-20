package com.rubypaper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.controller.BoardController;

//JUnit에서 제공하는 Runner가 아닌 SpringRunner를 사용하겠다.
@RunWith(SpringRunner.class)	
//테스트 케이스가 실행될 때 필요한 모든 설정과 빈을 초기화하겠다.

//classes = BoardController.class,
@SpringBootTest(      
			properties = {"author.name=king krule",
						  "author.age=39",
						  "author.nation=uk"})					
public class PropertiesTest {

	@Autowired
	Environment env;
	
	@Test
	public void testMethod() {
		System.out.println("NAME : " + env.getProperty("author.name"));
		System.out.println("AGE : " + env.getProperty("author.age"));
		System.out.println("NATION : " + env.getProperty("author.nation"));
	}
}
