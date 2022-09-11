package com.kr.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;


	@RequestMapping("login_check")
	public ModelAndView loginCheck(String loginId, String loginPassword) {

		ModelAndView mv = service.loginCheck(loginId, loginPassword);

		return mv;
	}

}
