package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Act;

public class ActMapper implements RowMapper<Act> {

	@Override
	public Act mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Act act=new Act();
		act.setAct_id(rs.findColumn("act_id"));
		act.setContent(rs.getString("content"));
		act.setPeoplenum(rs.getInt("peoplenum"));
		act.setTitle(rs.getString("title"));
		act.setUp_date(rs.getDate("up_date"));
		return act;
	}

}
