package com.comfine.dao;

import java.util.List;
import javax.sql.DataSource;
import com.comfine.javabean.Sever;

public interface SeverDao {
	
	/*
	 * 
	 */
	public void setDataSource(DataSource ds);
	/*
	 * 获取该id的全部信息
	 */
	public Sever getSever(int id);
	/*
	 * 存储信息
	 */
	public List<Sever> listSevers();
	/*
	 * 删除该id的信息
	 */
	public void delete(int id);
	/*
	 * 更新该id的介绍
	 */
	public void updateIntroduce(int id,String str);
}
