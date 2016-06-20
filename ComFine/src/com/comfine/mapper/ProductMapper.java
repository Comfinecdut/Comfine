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
		product.setProduct_id(rs.getInt("product_id"));
		product.setProduct_name(rs.getString("product_name"));
		product.setType(rs.getString("type"));
		product.setSever_id(rs.getInt("sever_id"));
		product.setCompany_id(rs.getInt("company_id"));
		return product;
	}

}
