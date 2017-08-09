package com.endless.web.converters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/converter")
	public ModelAndView convert(){
		return new ModelAndView("converterTest","employee",new Employee());
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/converterResult.mvc?id=10010&name=aaa&recruitTime=2020-12-20&boss=2222,bbbb
	@RequestMapping(value="/converterResult")
	public ModelAndView convertResult(Employee employee){
		return new ModelAndView("converterResult","employee",employee);
	}
	
}
