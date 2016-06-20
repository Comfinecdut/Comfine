package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Severcontent;

public class SeverContentMapper implements RowMapper<Severcontent> {

	@Override
	public Severcontent mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Severcontent severcontent=new Severcontent();
		severcontent.setId(rs.getInt("id"));
		severcontent.setServe_id(rs.getInt("sever_id"));
		severcontent.setSevercontent_name(rs.getString("severcontent_name"));
		severcontent.setIntroduce(rs.getString("introduce"));
		severcontent.setPrice(rs.getFloat("price"));
		severcontent.setUp_date(rs.getDate("up_date"));
		severcontent.setSorts(rs.getString("sorts"));
		severcontent.setPic_path(rs.getString("pic_path"));
		severcontent.setTel(rs.getString("tel"));
		severcontent.setAddr(rs.getString("addr"));
		return severcontent;
	}

}
