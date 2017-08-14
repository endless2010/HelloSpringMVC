package com.endless.web.databind.controllers;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/databind")
public class ParamTypeController {
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/session.mvc
	@RequestMapping(value="/session")
	public void session(HttpSession session,Writer writer) throws IOException{
		writer.write("sessionid: "+session.getId());
		writer.write("lastAccessed: "+new Date(session.getLastAccessedTime()));
		writer.write("createTime: "+new Date(session.getCreationTime()));
		ServletContext context=session.getServletContext();
		writer.write("server: "+context.getServerInfo());
		writer.write("contextPath: "+context.getContextPath());
		writer.write("servlet version:"+context.getMajorVersion()+"."+context.getMinorVersion());
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/request.mvc	
	//public void request(HttpServletRequest request){ 
	//只要有HttpServletRequest类型的参数就行，不一定是第一个参数，其他方法类似
	@RequestMapping(value="/request")
	public void request(Writer writer, HttpServletRequest request)throws IOException{
		writer.write("RequestURL: "+request.getRequestURL());
		writer.write("contentPath: "+request.getContextPath());
		writer.write("Locale: "+request.getLocale());
		writer.write("Method: "+request.getMethod());
		writer.write("Protocol: "+request.getProtocol());
		writer.write("QueryString: "+request.getQueryString());		
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/readAndWrite.mvc
	//str只是为了说明reader,writer在方法中顺序不重要
	@RequestMapping(value="/readAndWrite")
	public void ReadAndWrite(Reader reader,String str,Writer writer) throws IOException{
		writer.write("Hello World"); //浏览器会打印 Hello World
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/write.mvc
	@RequestMapping(value="/write")
	public void ReadAndWrite(Writer writer) throws IOException{
		writer.write("Hello World"); //浏览器会打印 Hello World
	}
	
	//http://127.0.0.1:8080/HelloSpringMVC/databind/writeAndHttpServletRequest.mvc
	//只要参数中这种类型的对象即可，SpringMVC机会传入，可以组合 ，顺序不重要
	@RequestMapping(value="/writeAndHttpServletRequest")
	public void ReadAndWriteAndHttpServletRequest(Writer writer,HttpServletRequest request) throws IOException{
		writer.write("Hello World"); //浏览器会打印 Hello World
		writer.write("RequestURL: "+request.getRequestURL());
		writer.write("contentPath: "+request.getContextPath());
	}
	
	@RequestMapping(value="/paramtype")
	public void paramtype(HttpServletRequest request,HttpSession session,Writer writer) throws IOException{
		writer.write("sessionid: "+session.getId()+"\n");
		writer.write("contextPath: "+session.getServletContext().getContextPath()+"\n");
		writer.write("RequestURL: "+request.getRequestURL()+"\n");
	}
}
