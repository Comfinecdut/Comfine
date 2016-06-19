package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Product;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setDate(rs.getDate("date"));
		product.setIntroduce(rs.getString("introduce"));
		product.setNeed(rs.getInt("need"));
		product.setProduct_id(rs.getInt("product_id"));
		product.setProductname(rs.getString("productname"));
		product.setType(rs.getString("type"));
		return product;
	}

}
