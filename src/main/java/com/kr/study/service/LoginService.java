package com.kr.study.service;

import org.springframework.web.servlet.ModelAndView;

public interface LoginService {

	ModelAndView loginCheck(String loginId, String loginPassword) ;

}
