package com.rubypaper;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rubypaper.domain.Board;

public class JPAClient {
	
	public static void main(String[] args) {
		//EntityManager 생성
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Chapter04_JPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		/*
		try {
			tx.begin();
			
			Board board = new Board();
			
			board.setTitle("JPA 테스트 title");
			board.setWriter("JPA 테스트 writer");
			board.setContent("JPA 테스트 내용");
			board.setCreateDate(new Date());
			board.setCnt(0L);
			
			// 글 등록
			em.persist(board);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		} */
		
		try {
			//글 상세 조회
			Board searchBoard = em.find(Board.class, 1L);
			System.out.println("--->" + searchBoard.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		
		
	}

}
