package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.endless.web.databind.beans.User;


@Controller
@RequestMapping(value="/databind")
@SessionAttributes("user")//会将user放到session中
public class SessionAttributeController {
	
	//http://127.0.0.1:8080/hellomvc/databind/sessionValue.mvc
	@RequestMapping(value="/sessionValue")
	public String session(HttpSession session,Writer writer) throws IOException{
		return "/databind/parameters";
	}
	
	@ModelAttribute("user") //会将user放到model中
	public User modelAttribute(){
		User user=new User();
		user.setUsername("sam");
		user.setSkills(Arrays.asList("spring","mybatis"));
		return user;
	}
}
