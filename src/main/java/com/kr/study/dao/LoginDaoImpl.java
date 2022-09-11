package com.kr.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	DataSource ds;

	@Override
	public int loginCheck(String loginId, String loginPassword) throws ClassNotFoundException, SQLException {

		Connection conn = ds.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		String sql = "select count(*) from accounts_info where account = ? and password = ?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, loginId);
		ps.setString(2, loginPassword);
		rs = ps.executeQuery();

		rs.next();

		int loginCheckResult = rs.getInt("count(*)");

		return loginCheckResult;

	}

}
