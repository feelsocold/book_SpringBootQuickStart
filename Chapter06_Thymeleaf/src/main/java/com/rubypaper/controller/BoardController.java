package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubypaper.domain.Board;
import com.rubypaper.persistence.BoardRepository;
import com.rubypaper.service.BoardService;

import lombok.extern.log4j.Log4j2;
import oracle.jdbc.proxy.annotation.Post;

@Log4j2
@Controller
public class BoardController {
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/hello")
	public void hello(Model model) {
		model.addAttribute("greeting", "HELLO 타임리프~");
		
		log.info("===================== hello()");
	}
	
	
	@RequestMapping("/getBoardList")
	public String getBoardList(Model model, Board board) {

		log.info("getBoardList()=========================");
			
		List<Board> boardList = new ArrayList<>();
		
		boardList = service.getBoardList(board);
		
		model.addAttribute("boardList", boardList);
		
		return "getBoardList";
	} 
	
	@RequestMapping("/getBoard")
	public void getBoard(Model model, Board board) {
		log.info("getBoard() ===============");
		
		model.addAttribute("board", service.getBoard(board));
	}
	
	@GetMapping("/insertBoard")
	public void insertBoardView(Board board) {
		 log.info("insertBoard() ==============");
	}
	
	@PostMapping("/insertBoard")
	public String insertBoard(Board board) {
		service.insertBoard(board);
		return "redirect:getBoardList";
	}
	
	@PostMapping("/updateBoard")
	public String updateBoard(Board board) {
		service.updateBoard(board);
		return "forward:getBoardList";
	}
	
	@GetMapping("/deleteBoard")
	public String deleteBoard(Board board) {
		service.deleteBoard(board);
		return "forward:getBoardList";
	}
	
	@GetMapping("/login")
	public void loginView() {
		
	}
	
	
}
