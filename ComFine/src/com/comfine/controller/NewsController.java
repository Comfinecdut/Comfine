package com.comfine.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.comfine.javabean.News;
import com.comfine.service.NewsService;

@Controller
public class NewsController {
	@Resource
	NewsService nService;

	@RequestMapping(value = "/addnews", method = RequestMethod.POST)
	public String addNews(News news, ModelMap model) {
		if (nService.addNews(news)) {
			model.addAttribute("message", "ddd");
		} else {
			model.addAttribute("message", "ccc");
		}
		System.out.println("新闻内容:" + news.getContent() + " 新闻up:" + news.getUp());
		return "redirect:newsupdate";
	}

	@RequestMapping(value = "/newsupdate", method = RequestMethod.GET)
	public ModelAndView newsUpdate() {
		return new ModelAndView("newsupdate", "command", new News());
	}
}
