package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class RequestHeaderController {
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/header.mvc
	@RequestMapping(value="/header")
	public void requestParam(@RequestHeader("User-Agent") String userAgent,
							  @RequestHeader(value="Accept")String accepts,
							  @RequestHeader(value="Accept-Encoding")String encoding,
							  @RequestHeader(value="Accept-Language")String language,
							  @RequestHeader(value="Cookie")String[] cookie,							  
							  Writer writer){
		try {
			writer.write("userAgent:"+userAgent+"\n");
			writer.write("accepts:"+accepts+"\n");
			writer.write("encoding:"+encoding+"\n");
			writer.write("language:"+language+"\n");
			writer.write("cookie:"+Arrays.asList(cookie));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}


}
