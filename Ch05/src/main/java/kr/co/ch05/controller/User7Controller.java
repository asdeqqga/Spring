package kr.co.ch05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User7Service;
import kr.co.ch05.vo.User7VO;

@Controller
public class User7Controller {
	
	@Autowired
	private User7Service service;
	
	@GetMapping("/user7/list")
	public String list(Model model) {
		List<User7VO> users = service.selectUser7s();
		model.addAttribute("users", users);
		return "/user7/list";
	}
	
	@GetMapping("/user7/register")
	public String register() {
		return "/user7/register";
	}
	
	@PostMapping("/user7/register")
	public String register(User7VO vo) {
		service.insertUser7(vo);
		return "redirect:/user7/list";
	}
	
	@GetMapping("/user7/modify")
	public String modify(String uid, Model model) {
		User7VO user = service.selectUser7(uid);
		model.addAttribute("user", user);
		return "/user7/modify";
	}
	
	@PostMapping("/user7/modify")
	public String modify(User7VO vo) {
		service.updateUser7(vo);
		return "redirect:/user7/list";
	}
	
	@GetMapping("/user7/delete")
	public String delte(String uid) {
		service.deleteUser7(uid);
		return "redirect:/user7/list";
	}
}
