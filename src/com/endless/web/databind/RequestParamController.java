package com.endless.web.databind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class RequestParamController {
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/requestParam1.mvc?username=hello
	@RequestMapping(value="/requestParam1")
	public void requestParam1(@RequestParam String username){ //取出参数名为username的参数值
		System.out.println("username: "+username);
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/requestParam2.mvc?name=hello
	@RequestMapping(value="/requestParam2")
	public void requestParam2(@RequestParam(value="name",defaultValue="Java") String username){ //取出参数名为name的参数值
		System.out.println("username: "+username);
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/requestParam3.mvc?id=hello
	@RequestMapping(value="/requestParam3")
	public void requestParam3(@RequestParam(required=false)String id){ //required默认是true,如果没有会报404
		System.out.println("id: "+id);
	}
}
