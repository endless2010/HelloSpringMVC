package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.endless.web.databind.beans.Gender;
import com.endless.web.databind.beans.User;
import com.endless.web.databind.services.UserService;

@Controller
@RequestMapping(value="/databind")
public class UserController {
	
	@RequestMapping(value="/listUsers")
	public String listUsers(Model model){
		
		model.addAttribute("title","Hello World");
		model.addAttribute("users",UserService.listUsers());
		model.addAttribute("genders",Gender.values());
		return "/databind/listUsers";
	}
	
	@RequestMapping(value="/sessionAttribute")
	public String sessionAttribute(HttpServletRequest request){
		request.setAttribute("title", "Request and Session");
		HttpSession session=request.getSession();
		session.setAttribute("cities",UserService.listCitys());
		session.setAttribute("skills",UserService.listSkills());
		return "/databind/parameters";
	}
	
	//参数放到Model,Map,ModelMap中都可以
	@RequestMapping(value="/modelMapModelMap")
	public String modelMapModelMap(Model model,Map map1,Map<String,Object> map2,ModelMap modelMap){
		model.addAttribute("title","Model,Map,ModelMap");
		model.addAttribute("genders",Gender.values());
		map1.put("cities",UserService.listCitys());
		map2.put("skills",UserService.listSkills());
		modelMap.addAttribute("user",new User());	
		return "/databind/parameters";
	}
	
	//参数放到Model,Map,ModelMap中都可以
	@RequestMapping(value="/addUser")
	public String addUser(ModelMap modelMap){
		modelMap.put("genders",Gender.values());
		modelMap.put("cities",UserService.listCitys());
		modelMap.put("skills",UserService.listSkills());
		modelMap.addAttribute("user",new User());		
		return "/databind/addUser";
	}
	
	//参数放到ModelAndView中
	@RequestMapping(value="/modelAndView")
	public ModelAndView modelAndView(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/databind/parameters");
		mv.addObject("title","modelAndView");
		mv.addObject("cities",UserService.listCitys());
		mv.addObject("skills",UserService.listSkills());			
		return mv;
	}
	
	@RequestMapping(value="/disPlayUser")
	public void disPlayUser(Writer writer,User user) throws IOException{
		writer.write(user.toString());
	}
	@RequestMapping(value="/disPlayUser2")//不能用List<String> skills
	public void disPlayUser2(Writer writer,String username,Gender gender,String birthday,
			String[] skills,String city,String description) throws IOException{
			writer.write("username:"+username+"\n");
			writer.write("gender:"+gender+"\n");
			writer.write("birthday:"+birthday+"\n");
			writer.write("skills:"+Arrays.asList(skills)+"\n");
			writer.write("city:"+city+"\n");
			writer.write("description:"+description);
	}
	
	@RequestMapping(value="/disPlayUser1")
	public void disPlayUser1(Writer writer,HttpServletRequest request) throws IOException{
			writer.write("username:"+request.getParameter("username")+"\n");
			writer.write("gender:"+request.getParameter("gender")+"\n");
			writer.write("birthday:"+request.getParameter("birthday")+"\n");
			writer.write("skills:"+Arrays.asList(request.getParameterMap().get("skills"))+"\n");
			writer.write("city:"+request.getParameter("city")+"\n");
			writer.write("description:"+request.getParameter("description")+"\n");
	}

	
	/*
	 * <mvc:form  modelAttribute="user" action="saveUser.mvc">
	 */
	@RequestMapping(value="/saveUser")
	public String saveUser(User user){
		UserService.addUser(user);
		return "redirect:/databind/listUsers.mvc";
	}
	
}
