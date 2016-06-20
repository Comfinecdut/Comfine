package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.News;

public class NewsMapper implements RowMapper<News> {

	@Override
	public News mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		News news=new News();
		news.setNews_id(rs.getInt("news_id"));
		news.setContent(rs.getString("content"));
		news.setTitle(rs.getString("title"));
		news.setPath(rs.getString("path"));
		news.setUp(rs.getString("up"));
		news.setUrl(rs.getString("url"));
		news.setDate(rs.getDate("date"));
		return news;
	}

}
