package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO ���ݿ�һ�ж�Ӧ�Ķ���ӳ��
		User user = new User();
		user.setUserId(rs.getInt("id"));
		user.setUserName(rs.getString("username"));
		user.setUserPwd(rs.getString("password"));
		user.setTel(rs.getString("tel"));
		user.setPicpath(rs.getString("facepath"));
		user.setRole_id(rs.getInt("role_id"));
		return user;
	}

}
