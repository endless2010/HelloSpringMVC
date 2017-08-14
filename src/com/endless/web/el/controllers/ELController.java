package com.endless.web.el.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/el")
public class ELController {
	@RequestMapping(value="/test1")
	public String test1(HttpServletRequest request,HttpSession session,
			ModelMap model,HttpServletResponse response){
		model.put("name", "test1");
		request.setAttribute("rk1", "rv1");
		session.setAttribute("sk1", "sv1");
		ServletContext servletContext=request.getSession().getServletContext();  
		servletContext.setAttribute("ak1", "av1");
		
		Cookie cookie = new Cookie("ck1", "cv1");
		cookie.setMaxAge(100000);
		response.addCookie(cookie);
		return "el/test1";
	}
}
