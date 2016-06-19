package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Borrow;

public class BorrowMapper implements RowMapper<Borrow> {

	@Override
	public Borrow mapRow(ResultSet rs, int row) throws SQLException {
		Borrow borrow=new Borrow();
		borrow.setBorrow_id(rs.getInt("borrow_id"));
		borrow.setServe_id(rs.getInt("server_id"));
		borrow.setBook_id(rs.getInt("book_id"));
		borrow.setCard_id(rs.getInt("card_id"));
		borrow.setDate(rs.getDate("date"));
		borrow.setRemain(rs.getInt("remain"));
		borrow.setCount(rs.getInt("count"));
		return borrow;
	}

}
