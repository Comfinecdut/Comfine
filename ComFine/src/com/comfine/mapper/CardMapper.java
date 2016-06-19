package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Card;

public class CardMapper implements RowMapper<Card> {

	@Override
	public Card mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Card card=new Card();
		card.setCard_id(rs.getInt("card_id"));
		card.setUser_id(rs.getInt("user_id"));
		card.setIntegral(rs.getInt("integral"));
		
		return card;
	}

}
