package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Life;

public class LifeMapper implements RowMapper<Life> {

	@Override
	public Life mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Life life=new Life();
		life.setCompany(rs.getString("company"));
		life.setFacepath(rs.getString("facepath"));
		life.setLife_id(rs.getInt("life_id"));
		life.setServe_id(rs.getInt("serve_id"));
		life.setTel(rs.getString("tel"));
		life.setType(rs.getString("type"));
		life.setUp_date(rs.getDate("up_date"));
		return life;
	}

}
