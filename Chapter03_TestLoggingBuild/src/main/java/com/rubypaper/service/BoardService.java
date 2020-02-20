package com.rubypaper.service;

import java.io.Serializable;
import java.util.List;

import com.ruby.domain.BoardVO;

public interface BoardService extends Serializable {
	
	String hello(String name);
	
	BoardVO getBoard();
	
	List<BoardVO> getBoardList();
	
}
