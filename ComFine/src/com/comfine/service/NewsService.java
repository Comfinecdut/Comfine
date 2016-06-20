package com.comfine.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.comfine.javabean.News;

@Service
public class NewsService {
	public boolean addNews(News news) {
		System.out.println(news.getContent());
		return true;
	}
}
