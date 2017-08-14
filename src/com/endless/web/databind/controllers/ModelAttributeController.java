package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.endless.web.databind.beans.User;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class ModelAttributeController {	
	
	//http://127.0.0.1:8080/hellomvc/databind/modelAttribute1.mvc
	
	@RequestMapping(value="/modelAttribute1")
	public void request1(Writer writer,HttpServletRequest request) throws IOException{
		writer.write("RequestURL: "+request.getRequestURL());
	}	
	@RequestMapping(value="/modelAttribute2")
	public void request2(Writer writer,HttpServletRequest request) throws IOException{
		writer.write("contentPath: "+request.getContextPath());
	}
	
	@ModelAttribute
	public void printTitle(Writer writer)throws IOException{
		writer.write("Hello World"+"\n");
	}
	
	//http://127.0.0.1:8080/hellomvc/databind/modelAttributeParam.mvc?username=kate&skills=java&skills=scala
	@RequestMapping(value="/modelAttributeParam")
	public String request3(Writer writer,@ModelAttribute("user2") User user){
		return "/databind/parameters";
	}		
	@ModelAttribute("user1") //会将user放到model中
	public User modelAttribute(){
		User user=new User();
		user.setUsername("sam");
		user.setSkills(Arrays.asList("spring","mybatis"));
		return user;
	}
    
}
