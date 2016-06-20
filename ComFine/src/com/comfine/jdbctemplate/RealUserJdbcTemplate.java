package com.comfine.jdbctemplate;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.comfine.dao.RealUserDao;
import com.comfine.javabean.RealUser;
import com.comfine.mapper.RealUserMapper;

public class RealUserJdbcTemplate implements RealUserDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(RealUser ru) {
		String sql = "INSERT INTO  `tbl_trueuser`,"
				+ "(`id`,"
				+ "`card_id`,`idcard`,"
				+ "`idcardpath`,`birth`,"
				+ "`height`,`weight`,"
				+ "`addr`,`hobby`,"
				+ "`needs`,`remarks`)"
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplateObject.update(sql,
				ru.getId(),
				ru.getCard_id(),
				ru.getIdcard(),
				ru.getIdcardpath(),
				ru.getBirth(),
				ru.getHeight(),
				ru.getWeight(),
				ru.getAddr(),
				ru.getHobby(),
				ru.getNeeds(),
				ru.getRemarks()
				);
	}
	@Override
	public RealUser getRealUser(int id) {
		String sql = "select * from tbl_trueuser where id=?";
		RealUser realUser = jdbcTemplateObject.queryForObject(sql, new Object[]{id},new RealUserMapper());
		return realUser;
	}

	@Override
	public void update(int realid, RealUser ru) {
		String sql = "UPDATE `comfine`.`tbl_trueuser`"
					+"SET `birth` = ?,`height` = ?,"
					+"`weight` = ?,`addr` = ?,"
					+"`hobby` = ?,`needs` = ?,"
					+"`remarks` = ? WHERE `trueuserID` = ?;";
		jdbcTemplateObject.update(sql,
				ru.getBirth(),
				ru.getHeight(),
				ru.getWeight(),
				ru.getAddr(),
				ru.getHobby(),
				ru.getNeeds(),
				ru.getRemarks(),
				realid);
	}

	@Override
	public void updateIdcardPath(int realid, String path) {
		String sql = "UPDATE tbl_trueuser"
				+ "SET idcardpath=? where trueuserID=?";
		jdbcTemplateObject.update(sql,path,realid);
	}
	

}
