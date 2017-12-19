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
	public String getCountry(String uname,String password){
		Map<String, Object> map=new HashMap<>();
		map.put("uname", uname);
		map.put("password", password);
		List<User> lists = userservice.getCountry(map);
		if(lists.size()==0){
			return "forward:/WEB-INF/jsp/user/registerUser.jsp";
		}else{

			return "forward:/index.jsp";
			
		}
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerUser");
		return mv;
	}

}
