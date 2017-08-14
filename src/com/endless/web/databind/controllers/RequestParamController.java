package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class RequestParamController {
	
	//http://127.0.0.1:8080/hellomvc/databind/requestParam1.mvc?username=hello
	@RequestMapping(value="/requestParam1")
	public void requestParam1(@RequestParam String username,Writer writer) throws IOException{
		writer.write("hello "+username);
	}
	
	//http://127.0.0.1:8080/hellomvc/databind/requestParam2.mvc?name=sam&skills=java&skills=scala&cities=beijing&cities=shanghai
	@RequestMapping(value="/requestParam2")
	public void requestParam2(
			@RequestParam(value="name",defaultValue="Jane") String username,
			@RequestParam(required=false)List<String> skills,//也可使用String[]
			@RequestParam(required=false)String cities,//required默认是true,如果没有会报404
			Writer writer) throws IOException{
		writer.write("hello: "+username+"\n");
		writer.write("your skills:"+skills+"\n");
		writer.write("you live in:"+cities);
	}
	
}
