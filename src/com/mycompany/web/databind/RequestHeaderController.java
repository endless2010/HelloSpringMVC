package com.mycompany.web.databind;

import org.apache.catalina.tribes.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/databind") //多个类的RequestMapping的值都是/databind也可以
public class RequestHeaderController {
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/header1.mvc
	@RequestMapping(value="/header1")
	public void requestParam1(@RequestHeader("User-Agent") String userAgent,
							  @RequestHeader(value="Accept")String[] accepts){
		System.out.println("userAgent: "+userAgent);
		System.out.println("accepts: "+Arrays.toString(accepts));
	}
	
}
