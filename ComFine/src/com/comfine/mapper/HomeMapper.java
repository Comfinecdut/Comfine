package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Home;

public class HomeMapper implements RowMapper<Home> {

	@Override
	public Home mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Home home=new Home();
		home.setHome_id(rs.getInt("home_id"));
		home.setIntroduce(rs.getString("introduce"));
		home.setZuobiao(rs.getString("zuobiao"));
		return home;
	}

}
