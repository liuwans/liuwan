package com.jnmd.liuwan.controller.user;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.service.UserService;

@Controller
@Scope("prototype")
public class UserController {

	@Resource
	private UserService userservice;
	//登录
	@RequestMapping("/getCountry")
	public String getCountry(String uname,String password,HttpServletRequest request){
		Map<String, Object> map=new HashMap<>();
		map.put("uname", uname);
		map.put("password", password);
		List<User> lists = userservice.getCountry(map);
		if(lists.size()==0){
			return "forward:/WEB-INF/jsp/user/registerUser.jsp";
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			return "forward:/index.jsp";
			
		}
	}
	//登录页面
	@RequestMapping("/getUser")
	public ModelAndView getUser(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerUser");
		return mv;
	}
	
	
	//注销
	@RequestMapping("/logoutUser")
	public String logoutUser(HttpServletRequest request){
		String uname="";
		request.setAttribute("uname", uname);
		return "forward:/index.jsp";
	}
	
	//注册页面
	@RequestMapping("/getLongin")
	public ModelAndView getLongin(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("saveLongin");
		return mv;
	}
	
	//注册提交
	@RequestMapping("/saveLongin")
	public ModelAndView saveLongin(@ModelAttribute User user,String Twopassword,String birthdays) throws ParseException{
		Map<String, Object> map=validate(user,Twopassword,birthdays);
		ModelAndView mv = new ModelAndView();
		if(!(birthdays == null || "".equals(birthdays))){
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
			Date birthdayes = format.parse(birthdays);
			java.sql.Date birthday = new java.sql.Date(birthdayes.getTime());
			user.setBirthday(birthday);
		}
		if(map.size() > 0){
			mv.setViewName("saveLongin");
			mv.addObject("mapError",map);
			mv.addObject("user",user);
			mv.addObject("birthdays",birthdays);
		}else{
			userservice.saveUser(user);
			mv.setViewName("saveLonginSucc");
		}
		return mv;
	}
	
	
	public Map<String, Object> validate(User user,String Twopassword,String birthdays){
		Map<String, Object> map=new HashMap<>();
		if(null == user.getUname() || user.getUname().trim().equals("")){
			map.put("unameError", "用户不能为空");
		}else if(user.getUname().trim().length() < 6 && user.getUname().trim().length() > 11){
			map.put("unameError", "用户名最大为11个字符，最小为6个字符");
		}
		if(null == user.getPassword() || user.getPassword().trim().equals("")){
			map.put("passwordError", "密码不能为空");
		}else if(user.getPassword().trim().length() < 6 && user.getPassword().trim().length()>10){
			map.put("passwordError", "密码最大为10个字符，最小为6个字符");
		}
		if(null == Twopassword || Twopassword.trim().equals("")){
			map.put("TwopasswordError", "请输入确认密码");
		}else if(!(Twopassword.equals(user.getPassword()))){
			map.put("TwopasswordError", "确认密码和密码不一致");
		}
		if(null == user.getMphone() || user.getMphone().trim().equals("")){
			map.put("mphoneError", "手机号不能为空");
		}
		if(user.getCountrycode() == 0){
			map.put("countrycodeError", "请选择地区");
		}
		if(birthdays == null || "".equals(birthdays)){
			map.put("birthdayError", "请选择生日");
		}
		if(null == user.getRealname() || user.getRealname().trim().equals("")){
			map.put("realnameError", "姓名不能为空");
		}else if(user.getRealname().trim().length() < 2 && user.getRealname().trim().length() < 10){
			map.put("realnameError", "姓名最大为10个字符，最小为2个字符");
		}
		if(user.getSex() != 1 && user.getSex() != 2 && user.getSex() != 3){
			map.put("sexError", "请选择性别");
		}
		if(null == user.getPaperscode() || user.getPaperscode().trim().equals("")){
			map.put("paperscodeError", "请输入证件号");
		}
		if(user.getTid() == 0){
			map.put("tidError", "请选择用户类型");
		}
		if(user.getPapersid() == 0){
			map.put("papersidError", "请选择证件类型");
		}
		return map;
	}

}
