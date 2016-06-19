package com.comfine.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import org.springframework.web.servlet.ModelAndView;

import com.comfine.javabean.RealUser;
import com.comfine.javabean.User;
import com.comfine.jdbctemplate.RealUserJdbcTemplate;
import com.comfine.jdbctemplate.UserJdbcTemplate;

@Service
public class UserService {

	private static ApplicationContext context =
	  new  ClassPathXmlApplicationContext("Beans.xml");
	
	
	public ModelAndView addUser(User user) {
		
		UserJdbcTemplate userJdbcTemplate
			=(UserJdbcTemplate)context.getBean("userJdbcTemplate");
		
		List<User> users = userJdbcTemplate.listUsers();
		// �鿴�û������ֻ��Ƿ�ע��
		for(User user1:users){
			if(user1.getUserName().equals(user.getUserName())){
				return new ModelAndView("register","info","�û����Ѿ�ע����");
			}
			if(user1.getTel().equals(user.getTel())){
				return new ModelAndView("register","info","���ֻ��Ѿ�ע����");
			}
		}
		// ����û�
		userJdbcTemplate.create(user);
		return new ModelAndView("person");
	}
	/**
	 * �û���¼
	 * @param user
	 * @return
	 */
	public ModelAndView login(User user) {
		UserJdbcTemplate userJdbcTemplate
		=(UserJdbcTemplate)context.getBean("userJdbcTemplate");
	
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
			return new ModelAndView("userlogin","info","�û���������");
		}
		else{
			System.out.println(userid);
			User user1 = userJdbcTemplate.getUser(userid);
			if(!user1.getUserPwd().equals(user.getUserPwd())){
				return new ModelAndView("userlogin","info","�������");
			}
			else{
				 
				return new ModelAndView("myhome","user",user);
			}
		}
	}
	/**
	 * 
	 * @param ru	
	 * @return
	 */
	public ModelAndView addTrueUser(RealUser ru) {
		// ���ʵ����֤
		RealUserJdbcTemplate realUserJdbcTemplate = 
				(RealUserJdbcTemplate) context.getBean("realUserJdbcTemplate");
		// �ϴ��ļ�
		// �޸�Ϊ������·��
		// �������ݿ�
		realUserJdbcTemplate.create(ru);
		return new ModelAndView("/");
	}

}
