package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.It;

public class ItMapper implements RowMapper<It> {

	@Override
	public It mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		It it=new It();
		it.setCompany(rs.getString("company"));
		it.setFacepath(rs.getString("facepath"));
		it.setIt_id(rs.getInt("it_id"));
		it.setServe_id(rs.getInt("serve_id"));
		it.setTel(rs.getString("tel"));
		return it;
	}

}
