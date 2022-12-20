package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController2 {
	//로그출력 객체
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	//http://localhost:8080/web/doC
	@RequestMapping("/doC")
//	public int doC() {
//	public boolean doC() {
	public String doC() {
		logger.info("doC()실행 - int 리턴");
		
		return "itwill";
	}
	//http://localhost:8080/web/doC1
	//http://localhost:8080/web/doC1?msg=hello&tel=010-1234-1234
	@RequestMapping(value= "/doC1",method=RequestMethod.GET)
	public String doC1(@ModelAttribute("msg") String m,@ModelAttribute("tel") String t) {
		//@ModelAttribute("파라미터명") String 변수
		//=> request.setAttribute("파라미터명",값)의 역할
		logger.info("doC1() 메서드 호출 -> itwill.jsp 뷰 호출");
		
		return "itwill";
	}
}
