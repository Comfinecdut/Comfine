package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Wash;

public class WashMapper implements RowMapper<Wash> {

	@Override
	public Wash mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Wash wash=new Wash();
		wash.setAddr(rs.getString("addr"));
		wash.setDate(rs.getDate("date"));
		wash.setFacepath(rs.getString("facepath"));
		wash.setPrice(rs.getFloat("price"));
		wash.setServe_id(rs.getInt("serve_id"));
		wash.setTel(rs.getString("tel"));
		wash.setType(rs.getString("type"));
		wash.setWash_id(rs.getInt("wash_id"));
		return wash;
	}

}
