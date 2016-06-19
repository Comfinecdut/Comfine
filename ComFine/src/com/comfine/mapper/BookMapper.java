package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int row) throws SQLException {
		
		Book book = new Book();
		book.setBook_id(rs.getInt("book_id"));
		book.setBookname(rs.getString("bookname"));
		book.setAuthor(rs.getString("author"));
		book.setPublish(rs.getString("publish"));
		book.setPubdate(rs.getDate("pubdate"));
		book.setPepname(rs.getString("pepname"));
		book.setDate(rs.getDate("date"));
		
		
		return book;
		
		
	}

}
