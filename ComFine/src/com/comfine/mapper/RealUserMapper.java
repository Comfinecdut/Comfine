package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.RealUser;

public class RealUserMapper implements RowMapper<RealUser>{

	@Override
	public RealUser mapRow(ResultSet rs, int rownum) throws SQLException {
		RealUser realUser = new RealUser();
		realUser.setTrueuserID(rs.getInt("trueuserID"));
		realUser.setId(rs.getInt("id"));
		realUser.setCard_id(rs.getInt("card_id"));
		realUser.setIdcard(rs.getString("idcard"));;
		realUser.setIdcardpath(rs.getString("idcardpath"));
		realUser.setBirth(rs.getDate("birth"));
		realUser.setHeight(rs.getInt("height"));
		realUser.setWeight(rs.getInt("weight"));
		realUser.setAddr(rs.getString("addr"));
		realUser.setHobby(rs.getString("hobby"));
		realUser.setNeeds(rs.getString("needs"));
		realUser.setRemarks(rs.getString("remarks"));
		return realUser;
	}

}
