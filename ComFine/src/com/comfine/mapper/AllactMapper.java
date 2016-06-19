package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Allact;

public class AllactMapper implements RowMapper<Allact> {

	@Override
	public Allact mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Allact allact=new Allact();
		allact.setAct_id(rs.getInt("act_id"));
		allact.setActnum(rs.getInt("actnum"));
		allact.setHome_id(rs.getInt("home_id"));
		return allact;
	}

}
