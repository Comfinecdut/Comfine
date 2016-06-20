package com.comfine.service;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.comfine.javabean.News;
import com.comfine.jdbctemplate.NewsJdbcTemplate;


@Service
public class NewsService {
public NewsJdbcTemplate nJdbc = NewsJdbcTemplate.getNewsJdbcInstance();
public boolean addNews(News news,String uploadUrl,String filename,MultipartFile imageFile){
	
	//文件上传
	File dir = new File(uploadUrl);
	if (!dir.exists()) {
		dir.mkdirs();
	}
	
	System.out.println("文件上传到: " + uploadUrl + filename);
	
	File targetFile = new File(uploadUrl + filename);
	if (!targetFile.exists()) {
		try {
			targetFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	try {
		imageFile.transferTo(targetFile);
	} catch (IllegalStateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	
//	//新闻数据入库
	
		news.setPath("../upload/"+filename);
		news.setUrl("../upload"+filename);	
		nJdbc.create(news);
		System.out.println(news.getContent());

//	News news1 = new News();
//	news1.setTitle("dd");
//	news1.setContent("ccccccc");
//	news1.setUp("up");
//	NewsJdbcTemplate nJdbc = NewsJdbcTemplate.getNewsJdbcInstance();
//	nJdbc.create(news1);
	return true;
}

public ModelAndView news_control() {
	List<News> news  = nJdbc.getAllNews();
//	Iterator<News> news_iterator = news.iterator();
//			while(news_iterator.hasNext()){
//				System.out.println(news_iterator.next().getTitle());
//			}
	return new ModelAndView("/news/newshoutai","message",news);
}
}
