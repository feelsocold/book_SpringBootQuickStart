package com.rubypaper.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class SecurityController {
	
	@GetMapping("/system/login")
	public void login() {}

	@GetMapping("/system/accessDenied")
	public String accessDenied() {
		log.info("=========================ACCESS DENIED!======================");
		
		return "/system/accessDenied";
		
	}
	
	@GetMapping("/system/logout")
	public void logout() {
		log.info("==========================로그아웃============================");
	}

	@GetMapping("/admin/adminPage")
	public void admin() {}
}
