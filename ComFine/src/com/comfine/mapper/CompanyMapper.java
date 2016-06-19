package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Company;

public class CompanyMapper implements RowMapper<Company> {

	@Override
	public Company mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Company company=new Company();
		company.setCompany_id(rs.getInt("company_id"));
		company.setCompanyname(rs.getString("companyname"));
		company.setDate(rs.getDate("date"));
		company.setInformation(rs.getString("information"));
		company.setServe_id(rs.getInt("serve_id"));
		company.setTel(rs.getString("tel"));
		return company;
	}

}
