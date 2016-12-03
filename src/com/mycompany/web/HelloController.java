package com.mycompany.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping(value="/hello")
	public ModelAndView sayHello(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","hello world");
		mv.setViewName("helloworld");
		return mv;
	}
}
