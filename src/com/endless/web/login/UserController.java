package com.endless.web.login;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/form")
	public ModelAndView form(){
		ModelAndView mv=new ModelAndView("form","user",new UserInfo());
		mv.addObject("genders",Genders.values());
		mv.addObject("colors",Colors.values());
		return mv;
	}
	
	@RequestMapping(value="/formResult")
	public ModelAndView displayResult(@Valid UserInfo user,BindingResult result){
		ModelAndView mv=new ModelAndView("formResult","user",user);
		if(result.hasErrors()){
			mv.addObject("genders",Genders.values());
			mv.addObject("colors",Colors.values());
			mv.setViewName("form");
		}
		return mv;
	}
}
