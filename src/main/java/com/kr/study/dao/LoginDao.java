package com.kr.study.dao;

import java.sql.SQLException;

public interface LoginDao {

	int loginCheck(String loginId, String loginPassword) throws ClassNotFoundException, SQLException;

}
