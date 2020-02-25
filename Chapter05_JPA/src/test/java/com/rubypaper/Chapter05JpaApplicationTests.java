package com.rubypaper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class Chapter05JpaApplicationTests {

	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	void contextLoads() {
	}

}
