package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch05.service.User5Service;
import kr.co.ch05.vo.User5VO;

@Controller
public class User5Controller {
	
	@Autowired
	private User5Service service;
	
	@GetMapping("/user5/list")
	public String list(Model model) {
		List<User5VO> users = service.selectUser5s();
		model.addAttribute("users", users);
		return "/user5/list";
	}
}
