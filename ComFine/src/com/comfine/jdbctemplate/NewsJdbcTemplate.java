package com.comfine.jdbctemplate;

import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.comfine.dao.NewsDao;
import com.comfine.javabean.News;
import com.comfine.mapper.NewsMapper;
import com.mysql.fabric.xmlrpc.base.Data;
public class NewsJdbcTemplate implements NewsDao{
private static DataSource dataSource;
private static JdbcTemplate jdbcTemplataObject;
public static NewsJdbcTemplate newsJdbc = null;
private NewsJdbcTemplate(){}


static {
	newsJdbc = new NewsJdbcTemplate();
	ApplicationContext context = new
			ClassPathXmlApplicationContext("Beans.xml");
		newsJdbc = (NewsJdbcTemplate) context.getBean("newsJdbcTemplate");
		jdbcTemplataObject = new JdbcTemplate(dataSource);	
}
public static NewsJdbcTemplate getNewsJdbcInstance(){
	return newsJdbc;
	
}
@Override
public List<News> getAllNews() {
	String SQL = "SELECT * FROM tbl_news";
	List<News> news = jdbcTemplataObject.query(SQL, new NewsMapper());
	return news;
}
@Override
public void create(News news) {
	
	Date date=new Date(System.currentTimeMillis());

	String SQL = "INSERT INTO tbl_news (title,content,up,date,url,path) VALUES(?,?,?,?,?,?)";
	jdbcTemplataObject.update(SQL,news.getTitle(),
									news.getTitle(),
									news.getUp(),
									date,
									news.getUrl(),
									news.getPath()
									);
	System.out.println("success");
	
	
}
public DataSource getDataSource() {
	return dataSource;
}
public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}
@Override
public News getNewsById(int news_id) {
	// TODO Auto-generated method stub
	return null;
}

}
