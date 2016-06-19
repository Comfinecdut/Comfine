package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Ticket;

public class TicketMapper implements RowMapper<Ticket> {

	@Override
	public Ticket mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Ticket ticket=new Ticket();
		ticket.setCompany(rs.getString("company"));
		ticket.setDate(rs.getDate("date"));
		ticket.setEffdate(rs.getDate("effdate"));
		ticket.setPrice(rs.getFloat("price"));
		ticket.setServe_id(rs.getInt("serve_id"));
		ticket.setTel(rs.getString("tel"));
		ticket.setTicket_id(rs.getInt("ticket_id"));
		ticket.setType(rs.getString("type"));
		return ticket;
	}

}
