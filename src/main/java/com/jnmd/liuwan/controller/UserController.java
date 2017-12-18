package com.jnmd.liuwan.controller;

import java.util.List;

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
	public ModelAndView getCountry(){
		List<User> lists = userservice.getCountry();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getCountry");
		mv.addObject("lists", lists);
		System.out.println(lists);
		return mv;
	}

}
