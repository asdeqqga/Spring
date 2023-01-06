package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.User7DAO;
import kr.co.ch05.vo.User7VO;

@Service
public class User7Service {
	
	@Autowired
	private User7DAO dao;
	
	public void insertUser7(User7VO vo) {
		dao.insertUser7(vo);
	}
	
	public User7VO selectUser7(String uid) {
		return dao.selectUser7(uid);
	}
	
	public List<User7VO> selectUser7s(){
		return dao.selectUser7s();
	}
	
	public void updateUser7 (User7VO vo) {
		dao.updateUser7(vo);
	}
	
	public void deleteUser7(String uid) {
		dao.deleteUser7(uid);
	}
}
