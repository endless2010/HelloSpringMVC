package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class PathVariableController {
	//@PathVariable将请求URL中模板变量映射到功能处理方法的参数上	
	
	//http://127.0.0.1:8080/hellomvc/databind/path1/userid:10010/username/world.mvc
	@RequestMapping(value="/path1/userid:{userid}/username/{username}")
	public void pathVariable1(
			@PathVariable(value="userid")int userid,//参数如果不是Int会抛出异常
			@PathVariable(value="username")String username,
			Writer writer) throws IOException{
		writer.write("userid: "+userid+"\n");
		writer.write("username: "+username);
	}
	
    
}
