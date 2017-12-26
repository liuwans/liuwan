package com.jnmd.liuwan.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.liuwan.domain.Gift;
import com.jnmd.liuwan.service.GiftService;

@Controller
@Scope("prototype")
public class GiftController {

	@Resource
	private GiftService giftservice;
	
	
	//特产页面分页
	@RequestMapping("/getGifts")
	public ModelAndView getGifts(HttpServletRequest request){
		Map<String , Object> map=new HashMap<>();
		int pageNum=Integer.parseInt(request.getParameter("pageNum"));
		int start=(pageNum-1)*6;
		map.put("start", start);
		map.put("pagesize", 6);
		List<Gift> list=giftservice.findGift(map);
		int count=giftservice.getCount();
		int pageMax=(int)Math.ceil((count*1.0)/6);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("gift");
		mv.addObject("list",list);
		mv.addObject("pageNum",pageNum);
		mv.addObject("pageMax",pageMax);
		return mv;
	}
	
	//特产页面
	@RequestMapping("/getGift")
	public ModelAndView getGift(){
		List<Gift> list=giftservice.getGift();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("gift");
		mv.addObject("list",list);
		return mv;
	}
	
	//返回页面
	@RequestMapping("/getIndex")
	public ModelAndView getIndex(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forward:/index.jsp");
		return mv;
	}
	
	//注销
	@RequestMapping("/logoutGift")
	public String logoutUser(HttpServletRequest request){
		String uname="";
		request.setAttribute("uname", uname);
		return "forward:/getGift";
	}
	
	
}
