package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Sever;

public class SeverMapper implements RowMapper<Sever> {

	@Override
	public Sever mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Sever sever=new Sever();
		sever.setIntroduce(rs.getString("introduce"));
		sever.setServe_id(rs.getInt("serve_id"));
		sever.setServername(rs.getString("servername"));
		sever.setServertype(rs.getString("servertype"));
		return sever;
	}

}
