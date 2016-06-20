package com.comfine.controller;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.comfine.javabean.Sever;
import com.comfine.service.SeverService;
public class SeverController {
	SeverService sService;
	
	@RequestMapping(value = "/addsever", method = RequestMethod.POST)
	public String addNews(Sever sever, ModelMap model) {
		if (sService.addIntroduce(sever)) {
			model.addAttribute("message", "233");
		} else {
			model.addAttribute("message", "445");
		}
		System.out.println("内容:" + sever.getIntroduce() + " id:" + sever.getServe_id());
		return "redirect:newsupdate";
	}
	
//	@RequestMapping(value = "/severupdate", method = RequestMethod.GET)
//	public ModelAndView IntroduceUpdate() {
//		return new ModelAndView("newsupdate", "command", new Sever());
//	}
}
