package com.comfine.dao;

import javax.sql.DataSource;

import com.comfine.javabean.RealUser;

public interface RealUserDao {
	
	/**
	 * �÷���������ʼ�����ݿ����ӳ�
	 */
	public void setDataSource(DataSource ds);
	/**
	 * �÷�����������һ���¼�¼
	 */
	public void create(RealUser ru);
	/**
	 * �÷���������ȡһ��������Ϣ
	 */
	public RealUser getRealUser(int id);
	/*
	 * �÷����������»�����Ϣ
	 */
	public void update(int realid,RealUser ru);
	/*
	 * �÷��������������֤��Ϣ
	 */
	public void updateIdcardPath(int realid,String path);
}
