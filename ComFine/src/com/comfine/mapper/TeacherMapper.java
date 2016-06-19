package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.comfine.javabean.Teacher;

public class TeacherMapper implements RowMapper<Teacher> {

	@Override
	public Teacher mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Teacher teacher=new Teacher();
		teacher.setDate(rs.getDate("date"));
		teacher.setFacepath(rs.getString("facepath"));
		teacher.setIntroduce(rs.getString("introduce"));
		teacher.setPrice(rs.getFloat("price"));
		teacher.setServe_id(rs.getInt("serve_id"));
		teacher.setTeacher_id(rs.getInt("teacher_id"));
		teacher.setTeachername(rs.getString("teachername"));
		return teacher;
	}

}
