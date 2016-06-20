package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.comfine.javabean.Teacher;

public class TeacherMapper implements RowMapper<Teacher> {

	@Override
	public Teacher mapRow(ResultSet rs, int row) throws SQLException {
		//teacher�����ӳ��
		Teacher teacher = new Teacher();
    	teacher.setTeacher_id(rs.getInt("teacher_id"));
		teacher.setTeachername(rs.getString("teachername"));
		teacher.setFacepath(rs.getString("facepath"));
		teacher.setIntroduce(rs.getString("introduce"));
//		teacher.setDatetime(rs.getDate("datetime"));
	//	teacher.setServe_id(rs.getInt("serve_id"));
		teacher.setPrice(rs.getFloat("price"));
		return teacher;
		
	}

}
