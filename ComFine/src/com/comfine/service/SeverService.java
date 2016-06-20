package com.comfine.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.comfine.javabean.Sever;

public class SeverService {
	public boolean addIntroduce(Sever sever) {
		System.out.println(sever.getIntroduce());
		return true;
	}
}
