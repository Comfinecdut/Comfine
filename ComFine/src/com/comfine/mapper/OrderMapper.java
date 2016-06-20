package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Order;

public class OrderMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Order order=new Order();
		order.setServe_id(rs.getInt("serve_id"));
		order.setUser_id(rs.getInt("user_id"));
		order.setContent_id(rs.getInt("content_id"));
		order.setIntroduce(rs.getString("introduce"));
		order.setOrder_id(rs.getInt("order_id"));
		order.setOrdername(rs.getString("ordername"));
		order.setPrice(rs.getFloat("price"));
		order.setProgress(rs.getString("progress"));
		order.setContent_id(rs.getInt("content_id"));
		return order;
	}

}
