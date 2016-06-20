package com.comfine.dao;
import java.util.List;

import com.comfine.javabean.News;
public interface NewsDao {
	public List<News> getAllNews();
	public void create(News news);
	public News getNewsById(int news_id);
	

}
