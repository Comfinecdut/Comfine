package com.comfine.jdbctemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.comfine.dao.SeverDao;
import com.comfine.javabean.Sever;
import com.comfine.mapper.SeverMapper;

public class SeverJdbcTemplate implements SeverDao {
	private static DataSource dataSource;
	private static JdbcTemplate jdbcTemplataObject;
	private static SeverJdbcTemplate severJdbcTemplate = null;
	
	static {
		severJdbcTemplate = new SeverJdbcTemplate();
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		severJdbcTemplate = (SeverJdbcTemplate) context.getBean("severJdbcTemplate");
		jdbcTemplataObject = new JdbcTemplate(dataSource);
	}
	
	private SeverJdbcTemplate(){};
	public static SeverJdbcTemplate getTeacherJdbc(){
		
		return severJdbcTemplate;
	}
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplataObject = new JdbcTemplate(dataSource);
	}

	@Override
	public Sever getSever(int sever_id) {
		// TODO Auto-generated method stub
		String sql = "select * from tbl_sever where id=?";
		Sever sever = jdbcTemplataObject.queryForObject(sql, new Object[]{sever_id},new SeverMapper());
		return sever;
	}

	@Override
	public List<Sever> listSevers() {
		String sql = "select * from tbl_sever";
		List<Sever> severs = jdbcTemplataObject.query(sql, new SeverMapper());
		return severs;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from tbl_sever where id=?";
		jdbcTemplataObject.update(sql,id);
	}

	@Override
	public void updateIntroduce(int id, String str) {
		String sql = "update tbl_sever set introduce=? where id=?";
		jdbcTemplataObject.update(sql,str,id);
	}

}
