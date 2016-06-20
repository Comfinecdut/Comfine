package com.comfine.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.comfine.javabean.News;
import com.comfine.jdbctemplate.NewsJdbcTemplate;
import com.comfine.service.NewsService;

@Controller
public class NewsController {

@Resource
NewsService nService;

	//添加新闻操作
	@RequestMapping(value="/addnews",method = RequestMethod.POST)
	public String oneUpload(News news,@RequestParam("imageFile") MultipartFile imageFile, HttpServletRequest request){
	
		String uploadUrl = request.getSession().getServletContext().getRealPath("/") + "upload/";
		String filename = imageFile.getOriginalFilename();
		nService.addNews(news,uploadUrl,filename,imageFile);
		System.out.println(news.getContent());
		String url = "http://localhost:8080/ComFine/upload/"+filename;
			return "redirect:"+url;
    }  
//添加新闻的界面展示
@RequestMapping(value="/newsupdate.do",method =RequestMethod.GET )
public String newsUpdate(){
	
	return "/news/newsupdate";
	
}	
//新闻后台管理控制（每个页面展示x条）
@RequestMapping(value="/newsupcontrol",method =RequestMethod.GET )
public ModelAndView newsControl(){	
	return nService.news_control();
}

//@RequestMapping(value="/newsupcontrolajax",method =RequestMethod.GET )

//@ResponseBody public Map<String, Object> getUserList() {  
//
//NewsJdbcTemplate nJdbc = NewsJdbcTemplate.getNewsJdbcInstance();
//
// List<News> news  = nJdbc.getAllNews();
// Map<String, Object> modelMap = new HashMap<String, Object>(1);
// modelMap.put("data",news);
// System.out.println();
// return modelMap;
//}

}
	

