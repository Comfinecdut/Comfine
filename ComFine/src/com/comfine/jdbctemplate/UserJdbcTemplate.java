package com.comfine.jdbctemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.comfine.dao.UserDao;
import com.comfine.javabean.User;
import com.comfine.mapper.UserMapper;

public class UserJdbcTemplate implements UserDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplataObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplataObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(User user) {
		String sql = "insert into tbl_user(username,password,tel,facepath) values(?,?,?,?)";
		jdbcTemplataObject.update(sql,
				user.getUserName(),
				user.getUserPwd(),
				user.getTel(),
				user.getPicpath());
		return;
	}

	@Override
	public User getUser(int userid) {
		String sql = "select * from tbl_user where id=?";
		User user = jdbcTemplataObject.queryForObject(sql, new Object[]{userid},new UserMapper());
		return user;
	}

	@Override
	public List<User> listUsers() {
		String sql = "select * from tbl_user";
		List<User> users = jdbcTemplataObject.query(sql, new UserMapper());
		return users;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from tbl_user where id=?";
		jdbcTemplataObject.update(sql,id);
		System.out.println("删除了id为"+id+"的记录");
	}

	@Override
	public void updatePwd(int id, String pwd) {
		String sql = "update tbl_user set password=? where id=?";
		jdbcTemplataObject.update(sql,pwd,id);
	}
	
	@Override
	public void updateFace(int id, String face) {
		String sql = "update tbl_user set facepath=? where id=?";
		jdbcTemplataObject.update(sql,face,id);
	}

}
