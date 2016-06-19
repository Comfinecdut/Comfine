package com.comfine.dao;

import java.util.List;
import javax.sql.DataSource;
import com.comfine.javabean.User;

public interface UserDao {
	
	/**
	 * 该方法用来初始化数据库连接池
	 */
	public void setDataSource(DataSource ds);
	/**
	 * 该方法用来插入数据库一条记录
	 */
	public void create(User user);
	/**
	 * 该方法用来根据主键获取唯一的一个记录
	 */
	public User getUser(int id);
	/**
	 * 该方法用来获取所有的User对象
	 */
	public List<User> listUsers();
	/**
	 * 该方法用来获取用户自定义的sql语句
	 */
	public List<User> excuteSql(String sql);
	/**
	 * 该方法用来删除一条记录
	 */
	public void delete(int id);
	/**
	 * 该方法用来更新密码
	 */
	public void updatePwd(int id,String pwd);
	/**
	 * 该方法用来更新头像
	 */
	public void updateFace(int id,String face);
	
}
