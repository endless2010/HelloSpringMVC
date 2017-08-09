package com.endless.web.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/hello")
	public ModelAndView sayHello(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","hello world");
		mv.setViewName("helloworld/helloworld");
		return mv;
	}
}
