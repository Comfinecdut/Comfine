package com.comfine.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

<<<<<<< HEAD

=======
>>>>>>> ef613a9e5942e2f48859bc8c2ac275ed51d13c42
import com.comfine.javabean.Teacher;

public class TeacherMapper implements RowMapper<Teacher> {

	@Override
	public Teacher mapRow(ResultSet rs, int row) throws SQLException {
<<<<<<< HEAD
		//teacher¶ÔÏóµÄÓ³Éä
		Teacher teacher = new Teacher();
		teacher.setTeacher_id(rs.getInt("teacher_id"));
		teacher.setTeachername(rs.getString("teachername"));
		teacher.setFacepath(rs.getString("facepath"));
		teacher.setIntroduce(rs.getString("introduce"));
//		teacher.setDatetime(rs.getDate("datetime"));
		teacher.setServe_id(rs.getInt("serve_id"));
		teacher.setPrice(rs.getFloat("price"));
		return teacher;
		
=======
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
>>>>>>> ef613a9e5942e2f48859bc8c2ac275ed51d13c42
	}

}
