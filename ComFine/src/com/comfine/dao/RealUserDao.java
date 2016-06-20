package com.comfine.dao;

import javax.sql.DataSource;

import com.comfine.javabean.RealUser;

public interface RealUserDao {
	
	/**
	 * 该方法用来初始化数据库连接池
	 */
	public void setDataSource(DataSource ds);
	/**
	 * 该方法用来创建一条新记录
	 */
	public void create(RealUser ru);
	/**
	 * 该方法用来获取一条个人信息
	 */
	public RealUser getRealUser(int id);
	/*
	 * 该方法用来更新基本信息
	 */
	public void update(int realid,RealUser ru);
	/*
	 * 该方法用来更新身份证信息
	 */
	public void updateIdcardPath(int realid,String path);
}
