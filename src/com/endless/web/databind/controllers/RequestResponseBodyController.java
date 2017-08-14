package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.endless.web.databind.beans.User;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class RequestResponseBodyController {	
	
	//http://127.0.0.1:8080/hellomvc/databind/responseBody.mvc	
	@RequestMapping(value = "responseBody")
	@ResponseBody
	public String login() throws IOException{
//		System.out.println("user:"+user);
		return "HelloWorld";
	}
   
}
