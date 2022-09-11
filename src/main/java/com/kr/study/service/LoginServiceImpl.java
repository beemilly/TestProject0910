package com.kr.study.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;

	@Override
	public ModelAndView loginCheck(String loginId, String loginPassword)  {

		ModelAndView mv = new ModelAndView();

		try {
			int result = dao.loginCheck(loginId, loginPassword);
			if(1 == result) {
				mv.setViewName("result");
				mv.addObject("msg", loginId + "님 환영합니다.");
			} else {
				mv.setViewName("home");
				mv.addObject("msg", "아이디 또는 비밀번호가 일치하지 않습니다.");
			}
			return mv;
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			mv.setViewName("error");
			mv.addObject("msg", "시스템에러가 발생했습니다. 관리자에게 문의해주십시오.");
			return mv;
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			mv.setViewName("error");
			mv.addObject("msg", "데이터베이스접속에러가 발생했습니다. 잠시 후 다시 시도해주시길 바라겠습니다.");
			return mv;
		}

	}

}
