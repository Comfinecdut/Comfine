package com.comfine.jdbctemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.comfine.dao.TeacherDao;
import com.comfine.javabean.Teacher;
import com.comfine.mapper.TeacherMapper;

public class TeacherJdbcTemplate implements TeacherDao{
	private static DataSource dataSource;
	private static JdbcTemplate jdbcTemplataObject;
	private static TeacherJdbcTemplate teacherJdbcTemplate = null;
	
	
	static {
		teacherJdbcTemplate = new TeacherJdbcTemplate();
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		teacherJdbcTemplate = (TeacherJdbcTemplate) context.getBean("teacherJdbcTemplate");
		jdbcTemplataObject = new JdbcTemplate(dataSource);
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
	}
	
	private TeacherJdbcTemplate(){}

	public static TeacherJdbcTemplate getTeacherJdbc(){
		
		return teacherJdbcTemplate;
	}
	@Override
	public Teacher getTeacherById(int id) {
		String sql = "SELECT * FROM tbl_teacher where teacher_id = 123";
		Teacher teacher = new Teacher();
		teacher = jdbcTemplataObject.queryForObject(sql, new TeacherMapper());
		return teacher;
	}

	@Override
	public void create(Teacher teacher) {
		String sql = "INSERT INTO tbl_teacher VALUES(?,?,?,?,?,?,?,?)";
		jdbcTemplataObject.update(sql,
				teacher.getTeacher_id(),
				teacher.getServe_id(),
				teacher.getTeachername(),
				teacher.getIntroduce(),
				teacher.getPrice(),
				teacher.getDatetime(),
				teacher.getFacepath()
				);
		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM tbl_user WHERE teacher_id = ?";		
		jdbcTemplataObject.update(sql,id);
	}
	
	@Override
	public List<Teacher> getAllTeachers() {
		String sql = "SELECT * FROM tbl_user";
		List<Teacher> teachers = jdbcTemplataObject.query(sql, new TeacherMapper());
		return teachers;
	}

}
