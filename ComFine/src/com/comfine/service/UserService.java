package com.comfine.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.comfine.javabean.User;
import com.comfine.jdbctemplate.UserJdbcTemplate;

@Service
public class UserService {

	public ModelAndView addUser(User user) {
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("Beans.xml");
		UserJdbcTemplate userJdbcTemplate = 
				(UserJdbcTemplate)context.getBean("userJdbcTemplate");
		List<User> users = userJdbcTemplate.listUsers();
		// 查看用户名和手机是否注册
		for(User user1:users){
			if(user1.getUserName().equals(user.getUserName())){
				return new ModelAndView("register","info","用户名已经注册了");
			}
			if(user1.getTel().equals(user.getTel())){
				return new ModelAndView("register","info","该手机已经注册了");
			}
		}
		// 添加用户
		userJdbcTemplate.create(user);
		return new ModelAndView("userlogin");
	}
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public ModelAndView login(User user) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("Beans.xml");
		UserJdbcTemplate userJdbcTemplate = 
				(UserJdbcTemplate)context.getBean("userJdbcTemplate");
		
		List<User> users = userJdbcTemplate.listUsers();
		int userid = -1;
		if(!users.isEmpty()){
			for(User user1:users){
				if(user1.getUserName().equals(user.getUserName())){
					userid = user1.getUserId();
					break;
				}
			}
		}
		System.out.println(userid);
		if(userid == -1){
			return new ModelAndView("userlogin","info","用户名不存在");
		}
		else{
			System.out.println(userid);
			User user1 = userJdbcTemplate.getUser(userid);
			if(!user1.getUserPwd().equals(user.getUserPwd())){
				return new ModelAndView("userlogin","info","密码错误");
			}
			else{
				return new ModelAndView("myhome");
			}
		}
	}

}
