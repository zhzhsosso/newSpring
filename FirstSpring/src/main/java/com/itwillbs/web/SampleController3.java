package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwillbs.domain.MemberVO;

@Controller
public class SampleController3 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	//객체 => 뷰페이지로 전달
	// /doD 호출 => itwillMember.jsp 연결후 출력
	
	//http://localhost:8080/web/doD
	@RequestMapping("/doD")
	public String doD(Model model, MemberVO vo/*@ModelAttribute("userid") String userid*/) {
		logger.info("doD()호출 -> itwillMember.jsp 연결");
		//객체 정보를 전달
		//=> Model 객체(스프링에서 제공하는 컨트롤러의 정보를 뷰페이지로 전달하는 객체)
//		model.addAttribute(attributeName,attributeValue)
//		MemberVO vo = new MemberVO();
		vo.setUserid("admin");
		vo.setUserpw("1234");
		vo.setUsername("관리자");
		vo.setUseremail("admin@admin.com");
		
		//모델 객체에 정보를 저장(연결된 뷰페이지로 전달)
//		model.addAttribute("cvbn",vo);
		model.addAttribute(vo);
		//=>이름이 없는경우 전달되는 객체의 클래스명을 사용(첫글자 소문자)
		
		return "itwillMember";
	}
}
