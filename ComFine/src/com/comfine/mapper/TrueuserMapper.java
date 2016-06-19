package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Trueuser;

public class TrueuserMapper implements RowMapper<Trueuser> {

	@Override
	public Trueuser mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Trueuser trueuser=new Trueuser();
		trueuser.setAddr(rs.getString("addr"));
		trueuser.setBirth(rs.getDate("birth"));
		trueuser.setCard_id(rs.getInt("card_id"));
		trueuser.setHeight(rs.getInt("height"));
		trueuser.setHobby(rs.getString("hobby"));
		trueuser.setId(rs.getInt("id"));
		trueuser.setIdcard(rs.getString("idcard"));
		trueuser.setIdcardpath(rs.getString("idcardpath"));
		trueuser.setNeeds(rs.getString("needs"));
		trueuser.setRemarks(rs.getString("remarks"));
		trueuser.setTrueuserID(rs.getInt("trueuserID"));
		trueuser.setWeight(rs.getInt("weight"));
		return trueuser;
	}

}
