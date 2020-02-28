package com.rubypaper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.domain.Board;
import com.rubypaper.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoadrRepositoryTest {
	
	@Autowired
	private BoardRepository boardRepo;
	
	// 등록하기
	/*
	@Test
	public void testInsertBoard() {
		Board board = new Board();
		board.setTitle("첫 번째 게시글");
		//board.setWriter("테스터");
		board.setContent("게시글 내용");
		board.setCreateDate(new Date());
		board.setCnt(0L);
		
		boardRepo.save(board);
	} */
	
	
	//	조회하기
	/*
	@Test
	public void testGetBoard() {
		Board board = boardRepo.findById(1L).get();
		System.out.println(board.toString());
	}
	*/
	
	// 수정하기
	/*
	@Test
	public void testUpdateBoard() { 
		System.out.println("=== 1번 게시글 조회 ===");
		Board board = boardRepo.findById(1L).get();
		
		System.out.println("=== 1번 게시글 제목 수정 ===");
		board.setTitle("제목을 수정");
		boardRepo.save(board);
	} */
	
	// 삭제하기
	/*
	@Test
	public void testDeleteBoard() {
		boardRepo.deleteById(1L);
	} */
	
	// 정렬하기
	/*
	 * @Test
	 /*
	public void testFindByTitleContainingOrderBySeqDesc() {
		List<Board> boardList = boardRepo.findByTitleContainingOrderBySeqDesc("17");
		
		System.out.println("검 색 결 과 =====");
		
		for (Board board : boardList) {
			System.out.println("===> " + board.toString());
		}
		
	} */
	
	/*
	@Test
	public void testFindByTitleContaining() {
		Pageable paging = PageRequest.of(0, 5);		// (페이지번호(0부터시작), 데이터갯수)
		//List<Board> boardList = boardRepo.findByTitleContaining("제목", paging);
		/*
		System.out.println("검색 결과");
		for (Board board : boardList) {
			System.out.println("===>" + board.toString());
		} 
		
		Page<Board> pageInfo = boardRepo.findByTitleContaining("제목", paging);
		
		System.out.println("PAGE SIZE : " + pageInfo.getSize());
		System.out.println("TOTAL PAGES : " + pageInfo.getTotalPages());
		System.out.println("TOTAL COUNT : " + pageInfo.getTotalElements());
		System.out.println("NEXT : " + pageInfo.nextPageable());
		
		List<Board> boardList = pageInfo.getContent();
		
		System.out.println("검색 결과");
		
		for (Board board : boardList) {
			System.out.println("====>" + board.toString());
		}
	} */
	
	
	
}
