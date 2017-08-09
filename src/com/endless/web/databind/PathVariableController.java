package com.endless.web.databind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class PathVariableController {
	//@PathVariable将请求URL中模板变量映射到功能处理方法的参数上	
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/path1/userid/hello/username/world.mvc
	@RequestMapping(value="/path1/userid/{userid}/username/{username}")
	public void pathVariable1(@PathVariable(value="userid")String userid,
							  @PathVariable(value="username")String username){
		System.out.println("userid: "+userid);
		System.out.println("username: "+username);
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/path2/userid:10010.mvc
    @RequestMapping(value="/path2/userid:{userid}")  
    public void pathVariable2(@PathVariable("userid") int userid){//参数如果不是Int会抛出异常
          System.out.println("userid : " + userid);  
    }
    
}
