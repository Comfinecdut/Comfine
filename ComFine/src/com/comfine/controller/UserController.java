package com.comfine.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import com.comfine.javabean.Teacher;
=======
import com.comfine.javabean.RealUser;
>>>>>>> 6b38a4eb5a20f3c05f34d9cfb948122a3830dcf5
import com.comfine.javabean.User;
import com.comfine.jdbctemplate.TeacherJdbcTemplate;
import com.comfine.jdbctemplate.UserJdbcTemplate;
import com.comfine.service.UserService;

@Controller
public class UserController {

	@Resource
	UserService userService;
<<<<<<< HEAD

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView toLogin() {
		return new ModelAndView("userlogin");
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView toRegister() {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public ModelAndView addUser(User user) {
		if (user.getUserName().equals("")) {
			return new ModelAndView("register", "info", "没输用户名");
=======
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
    public ModelAndView toLogin() {
     return new ModelAndView("userlogin");
   }
	
	@RequestMapping(value="/register",method = RequestMethod.GET)
    public ModelAndView toRegister() {
     return new ModelAndView("register");
   }
	@RequestMapping(value="/person",method = RequestMethod.GET)
    public ModelAndView toUserVa() {
     return new ModelAndView("person");
   }
	@RequestMapping(value="/adduser",method = RequestMethod.POST)
    public ModelAndView addUser( User user) {
		if(user.getUserName().equals("")){
<<<<<<< HEAD
			return new ModelAndView("register","info","�û�������Ϊ��");
		}
		if(user.getUserPwd().equals("")){
			return new ModelAndView("register","info","���벻��Ϊ��");
		}
		if(user.getTel().equals("")){
			return new ModelAndView("register","info","�ֻ��Ų���Ϊ��");
=======
			return new ModelAndView("register","info","�û�������Ϊ��");
>>>>>>> 6b38a4eb5a20f3c05f34d9cfb948122a3830dcf5
		}
		if (user.getUserPwd().equals("")) {
			return new ModelAndView("register", "info", "没输密码");
		}
		if (user.getTel().equals("")) {
			return new ModelAndView("register", "info", "没输电话");
>>>>>>> 9a33bdbc32e9d9b0ebed1c6dec2af36fe0ec8848
		}
		return userService.addUser(user);
<<<<<<< HEAD
	}

	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
	public ModelAndView doLogin(User user) {
		if (user.getUserName().equals("")) {
			return new ModelAndView("userlogin", "info", "�û�������Ϊ��");
=======
   }
	
	@RequestMapping(value="/douserva",method = RequestMethod.POST)
    public ModelAndView realUser(RealUser ru) {
		
		if(ru.getIdcard().equals("")){
			return new ModelAndView("person","info","���֤����Ϊ��");
		}
		if(ru.getIdcardpath().equals("")){
			return new ModelAndView("person","info","���ϴ����֤");
		}
		return userService.addTrueUser(ru);
   }
	
	@RequestMapping(value="/dologin",method = RequestMethod.POST)
    public ModelAndView doLogin(User user) {
		if(user.getUserName().equals("")){
<<<<<<< HEAD
			return new ModelAndView("userlogin","info","�û�������Ϊ��");
		}
		if(user.getUserPwd().equals("")){
			return new ModelAndView("userlogin","info","���벻��Ϊ��");
=======
			return new ModelAndView("userlogin","info","�û�������Ϊ��");
>>>>>>> 6b38a4eb5a20f3c05f34d9cfb948122a3830dcf5
		}
		if (user.getUserPwd().equals("")) {
			return new ModelAndView("userlogin", "info", "���벻��Ϊ��");
>>>>>>> 9a33bdbc32e9d9b0ebed1c6dec2af36fe0ec8848
		}
		return userService.login(user);
<<<<<<< HEAD
	}

	@RequestMapping(value = "/teacher", method = RequestMethod.GET)
	public ModelAndView printTeache() {

		TeacherJdbcTemplate t = TeacherJdbcTemplate.getTeacherJdbc();
		Teacher a = t.getTeacherById(123);
<<<<<<< HEAD
//        	int a =0;
		return new ModelAndView("teacher","teacher",a);
		
=======
		// int a =0;
		return new ModelAndView("teacher", "teacher", a);

>>>>>>> 9a33bdbc32e9d9b0ebed1c6dec2af36fe0ec8848
	}

=======
   }

	
	
	
	
>>>>>>> 6b38a4eb5a20f3c05f34d9cfb948122a3830dcf5
}