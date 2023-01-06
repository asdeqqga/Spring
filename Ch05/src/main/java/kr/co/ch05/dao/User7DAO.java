package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User7VO;

@Repository
public class User7DAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser7 (User7VO vo) {
		mybatis.insert("user7.insertUser7", vo);
	}
	
	public User7VO selectUser7(String uid) {
		return mybatis.selectOne("user7.selectUser7",uid);
	}
	
	public List<User7VO> selectUser7s(){
		return mybatis.selectList("user7.selectUser7s");
	}
	
	public void updateUser7 (User7VO vo) {
		mybatis.update("user7.updateUser7", vo);
	}
	
	public void deleteUser7(String uid) {
		mybatis.delete("user7.deleteUser7", uid);
	}
}
