package com.jose1593.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
// Ctrl + shift + o --> 임포트 정리해줘요.

@Controller
public class BoardController {
	
	// 서비스와 연결하기
	@Autowired // BoardService.java의 내용이 들어간다.
	private BoardService boardService; 
	
	

	// 사용자가 /board라고 호출하면 동작할 메소드를 만들겠습니다.
	@GetMapping("/board")
	// getmapping => board에서 get방식으로 들어온 애를 처리할 꺼에요
    // postmapping => board에서 post방식으로 들어온 애를 처리할 꺼에요
	
	public ModelAndView board() {
		ModelAndView mv = new ModelAndView("board");// jsp파일명
		
		// 서비스에게 일 시킵니다.
		List<BoardDTO> list = boardService.boardList();
		mv.addObject("list", list);
		return mv;
	}
	
	@GetMapping("/board2")
	public String board2(Model model) {
		model.addAttribute("name", "홍길동");
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		for (int i = 0; i < 11; i++) {
//			헤드만 나오고 결과값은 나오지 않는다
			BoardDTO dto = new BoardDTO(i, "제목입니다", "홍길동", "2023-07-13", i);
			list.add(dto);
		}
		
		model.addAttribute("list", list);
		
		return "board2";
		
	}

}
