package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Veg;

public class VegMapper implements RowMapper<Veg> {

	@Override
	public Veg mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Veg veg=new Veg();
		veg.setChandi(rs.getString("chandi"));
		veg.setCompany(rs.getString("company"));
		veg.setDate(rs.getDate("date"));
		veg.setIntroduce(rs.getString("introduce"));
		veg.setJidi(rs.getString("jidi"));
		veg.setServe_id(rs.getInt("serve_id"));
		veg.setTel_cpn(rs.getString("tel_cpn"));
		veg.setTel_jidi(rs.getString("tel_jidi"));
		veg.setVeg_id(rs.getInt("veg_id"));
		veg.setVegname(rs.getString("vegname"));
		return veg;
	}

}
