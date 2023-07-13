package com.jose1593.web;
// 데이터베이스(마이바티스)와 연결

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	//sqlSession과 연결합니다.
	@Autowired
	private SqlSession sqlSession;

	public List<BoardDTO> boardList() {
		
		return sqlSession.selectList("boardtest.boardList");
	}
	

}
