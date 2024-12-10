package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/index") //url 연결 경로
	public String memberIndex() {
		System.out.println("index 실행");
		return "member/index"; //views폴더에 경로
	}
	@RequestMapping(value="/logout") 
	public String logout( Model model ) {
		model.addAttribute( "test" , "값 입니다~" );
		return "member/logout"; 
	}
	@RequestMapping("/login") 
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		
		model.addObject("abc","abc값 전달");
		model.setViewName("member/login");
		
		return model; 
	}
	
}











