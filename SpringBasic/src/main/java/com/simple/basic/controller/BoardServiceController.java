package com.simple.basic.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.basic.board.BoardService;
import com.simple.basic.command.BoardVO;
import com.simple.basic.command.ScoreVO;

@Controller
@RequestMapping("/board")
public class BoardServiceController {
	
	@Autowired
	@Qualifier("a")
	BoardService boardService;
	
	//목록화면
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);

		return "board/boardList";
	}
	
	//등록화면
	@RequestMapping("/boardRegister")
	public String boardRegist(){
		
		
		return "board/boardRegister";
	}
	//등록폼
	@RequestMapping(value = "/boardForm" , method = RequestMethod.POST) 
	public String boardForm(BoardVO vo) {
		boardService.regist(vo);
		return "board/boardResult";
	}
	
	//삭제
	@RequestMapping("/deleteBoard")
	public String deleteBoard(@RequestParam("bno") int bno) {
		
		boardService.delete(bno);
		
		return "redirect:/board/boardList";
	}

}
