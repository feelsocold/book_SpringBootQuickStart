package com.rubypaper;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.rubypaper.service.BoardService;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // webEnviorment 설정을 통해 서블릿컨테이너 구동하며 테스트
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)		// 비즈니스 컴포넌트 모킹해서 테스트
//@WebMvcTest				// Controller, RestConroller가 설정된 클래스들을 찾아 메모리에 생성한다.
@AutoConfigureMockMvc		// Controller, Service, Repository 모두 찾아 메모리에 생성한다.
public class BoardControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BoardService boardService;
	
	
	
//	@Autowired
//	private TestRestTemplate restTemplate;	// 모킹을 하지 않으면 실제 컨트롤러를 실행해줄 객체 TestRestTemplate를 주입

	/*
	@Test
	public void testHello() throws Exception {
		when(boardService.hello("둘리")).thenReturn("Hello : 둘리");
		
		mockMvc.perform(get("/hello").param("name", "둘리"))
		.andExpect(status().isOk())
		.andExpect(content().string("Hello : 둘리"))
		.andDo(print());	
	} */
	
//	@Test
//	public void testHello2() throws Exception{
//		// getForObject(서버에 요청할 URL, 응답 결과의 타입클래스)
//		String result = restTemplate.getForObject("/hello?name=보한", String.class);
//	
//		// 응답결과 메시지 확인
//		assertEquals("Hello : 둘리", result);
//	}
	/*
	@Test
	public void testGetBoard() throws Exception{
		BoardVO board = restTemplate.getForObject("/getBoard", BoardVO.class);
		assertEquals("테스터", board.getWriter());
	} */
	
}
