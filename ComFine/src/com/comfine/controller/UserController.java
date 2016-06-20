package com.comfine.controller;



import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.comfine.javabean.Teacher;
import com.comfine.javabean.User;
import com.comfine.jdbctemplate.TeacherJdbcTemplate;
import com.comfine.jdbctemplate.UserJdbcTemplate;
import com.comfine.service.UserService;


@Controller
public class UserController{
	
	@Resource 
	UserService userService;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView toLogin() {
     return new ModelAndView("userlogin");
   }
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
    public ModelAndView toRegister() {
     return new ModelAndView("register");
   }
	@RequestMapping(value="/adduser",method = RequestMethod.POST)
    public ModelAndView addUser( User user) {
		if(user.getUserName().equals("")){
			return new ModelAndView("register","info","�û�������Ϊ��");
		}
		if(user.getUserPwd().equals("")){
			return new ModelAndView("register","info","���벻��Ϊ��");
		}
		if(user.getTel().equals("")){
			return new ModelAndView("register","info","�ֻ��Ų���Ϊ��");
		}
		return userService.addUser(user);
   }
	@RequestMapping(value="/dologin",method = RequestMethod.POST)
    public ModelAndView doLogin(User user) {
		if(user.getUserName().equals("")){
			return new ModelAndView("userlogin","info","�û�������Ϊ��");
		}
		if(user.getUserPwd().equals("")){
			return new ModelAndView("userlogin","info","���벻��Ϊ��");
		}
		return userService.login(user);
   }
	@RequestMapping(value="/teacher",method = RequestMethod.GET)
	public ModelAndView printTeache(){
		
		TeacherJdbcTemplate t = TeacherJdbcTemplate.getTeacherJdbc();
		Teacher a = t.getTeacherById(123);
//        	int a =0;
		return new ModelAndView("teacher","teacher",a);
		
	}
	
}