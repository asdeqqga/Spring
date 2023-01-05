package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch05.service.User3Service;
import kr.co.ch05.vo.User3VO;

@Controller
public class User3Controller {
	
	@Autowired
	private User3Service service;
	
	@GetMapping("/user3/list")
	public String list(Model model) {
		List<User3VO> users = service.selectUser3s();
		model.addAttribute("users",users);
		return "/user3/list";
	}
}
