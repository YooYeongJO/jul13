package com.jose1593.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 서비스 기능을 한다. => 비지니스 로직 담당
public class BoardService {
	//DAO랑 연결합니다.
	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> boardList() {
		return boardDAO.boardList();
	}

}
