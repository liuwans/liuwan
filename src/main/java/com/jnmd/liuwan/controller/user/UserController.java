package com.jnmd.liuwan.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.service.UserService;

@Controller
@Scope("prototype")
public class UserController {

	@Resource
	private UserService userservice;
	
	@RequestMapping("/getCountry")
	public ModelAndView getCountry(String uname,String password){
		Map<String, Object> map=new HashMap<>();
		map.put("uname", uname);
		map.put("password", password);
		List<User> lists = userservice.getCountry(map);
		ModelAndView mv = new ModelAndView();
		if(lists.size()==0){
			mv.setViewName("registerUser");
			return mv;
		}else{
			mv.setViewName("index");
			mv.addObject("uname", uname);
			return mv;
		}
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerUser");
		return mv;
	}

}
