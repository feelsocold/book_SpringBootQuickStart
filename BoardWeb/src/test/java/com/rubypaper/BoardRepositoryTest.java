package com.rubypaper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.domain.Member;
import com.rubypaper.board.domain.Role;
import com.rubypaper.board.persistence.BoardRepository;
import com.rubypaper.board.persistence.MemberRepository;
import com.rubypaper.board.domain.Board;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	
	@Test
	public void testInsert() {
		Member member1 = new Member();
		member1.setId("member1");
		member1.setPassword(encoder.encode("member1"));
		member1.setName("둘리");
		member1.setRole(Role.ROLE_MEMBER);
		member1.setEnabled("1");
		memberRepo.save(member1);
		
		Member member2 = new Member();
		member2.setId("admin");
		member2.setPassword(encoder.encode("admin"));
		member2.setName("도우너");
		member2.setRole(Role.ROLE_ADMIN);
		member2.setEnabled("1");
		memberRepo.save(member2);
		
		for (int i = 1; i < 11; i++) {
			Board board = new Board();
			board.setMember(member1);
			board.setTitle("둘리가 등록한 게시글 " + i);
			board.setContent("둘리가 쓴 내용" + i);
			board.setCreateDate(new Date());
			board.setCnt(0L);
			
			boardRepo.save(board);
		}
		
		for (int i = 1; i < 4; i++) {
			Board board = new Board();
			board.setMember(member2);
			board.setTitle("도우너가 등록한 게시글 " + i);
			board.setContent("도우너가 쓴 내용" + i);
			board.setCreateDate(new Date());
			board.setCnt(0L);
			
			boardRepo.save(board);
		} 
	}
	
	/*
	@Test
	public void testGetBoard() {
		
		Board board = boardRepo.findById(1L).get();
		
		System.out.println("\n [ " + board.getSeq() + "번 게시글 상세 정보 ] ");
		System.out.println(" 제목 \t" + board.getTitle());
		System.out.println(" 작성자 \t" + board.getMember().getName());
		System.out.println(" 내용 \t" + board.getContent());
		System.out.println(" 등록일 \t" + board.getCreateDate());
		System.out.println(" 조회수 \t" + board.getCnt() + "\n");
	}
	*/
	
	/*
	@Test
	public void testGetBoardList() {
		
		System.out.println("========================= testGetBoardList() test------");
		
		Member member = memberRepo.findById("admin").get();
		
		System.out.println("[ " + member.getName() + "가 등록한 게시글 ]");
		for (Board board : member.getBoardList()) {
			System.out.println("======> " + board.toString());
		}
	} */
}
