package com.jose1593.web;

// ctrl + shift + o --> import문 정리
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	//사용자가 /board라고 호출하면 동작할 메소드를 만들겠습니다.
	
	@GetMapping("/board") // getmapping => board에서 get방식으로 들어온 애를 처리할 꺼에요
							  // postmapping => board에서 post방식으로 들어온 애를 처리할 꺼에요
	public String board() {
		return "board"; // jsp 파일명
		
		
	}
}
