package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Cpnneed;

public class CpnneedMapper implements RowMapper<Cpnneed> {

	@Override
	public Cpnneed mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Cpnneed cpnneed=new Cpnneed();
		cpnneed.setCompany_id(rs.getInt("company_id"));
		cpnneed.setId(rs.getInt("id"));
		cpnneed.setProduct_id(rs.getInt("product_id"));
		return cpnneed;
	}

}
