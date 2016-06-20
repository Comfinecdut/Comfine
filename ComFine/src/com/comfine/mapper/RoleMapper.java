package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Role;
public class RoleMapper implements RowMapper<Role> {

	@Override
	public Role mapRow(ResultSet rs, int row) throws SQLException {
		Role role = new Role();
		role.setRole_id(rs.getInt("role_id"));
		role.setRolename(rs.getString("rolename"));
		return role;
	}

}
