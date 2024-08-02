package com.simple.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.basic.command.BirthVO;
import com.simple.basic.command.MemberVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	//화면요청
	@RequestMapping("/quiz01")
	public String quiz01() {
		
		
		return "/quiz/quiz01";
	}
	//폼요청
	@RequestMapping("/join")
	public String join(@ModelAttribute("info") MemberVO vo) {
		
		return "/quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		
		return "/quiz/quiz02";
	}
	
	@RequestMapping(value = "/birthForm", method = RequestMethod.POST)
	public String birthResult(BirthVO vo, RedirectAttributes ra) {
		
		ra.addFlashAttribute("msg", vo.getYear() + "년 " + vo.getMonth() + "월 " + vo.getDay() + "일 생일축하합니다");//리다이렉트시에 1번 사용할 수 있음
		
		return "redirect:/quiz/result"; //다시 컨트롤러를 태움
	}
	
	@RequestMapping("/result")
	public String result() {
		
		return "/quiz/result";
	}
}
