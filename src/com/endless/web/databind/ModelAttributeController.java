package com.endless.web.databind;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/databind")
// 多个类的RequestMapping的值都是/databind也可以
public class ModelAttributeController {
	// @ModelAttribute绑定对象到模型中，供视图使用

	@RequestMapping(value = "/login1")
	public String loginPage1() {
		return "modelAttributeTest1";
	}

/*	
 * http://127.0.0.1:8080/HelloSpringMVC/databind/login1.mvc
 * <form id="form1" action="/HelloSpringMVC/databind/model1.mvc">
 * 视图中使用标准HTML提交，直接使用user的userid和username属性
*/	@RequestMapping(value = "/model1")
	public String processInput1(@ModelAttribute User user) {
		System.out.println("userid:" + user.getUserid());
		System.out.println("username:" + user.getUsername());
		return "modelAttributeTestResult";
	}
	
	@RequestMapping(value = "/login2")
	public ModelAndView loginPage2() {
		return new ModelAndView("modelAttributeTest2","user",new User());
	}
/*	
 * http://127.0.0.1:8080/HelloSpringMVC/databind/login2.mvc
 * <mvc:form  modelAttribute="user" action="model2.mvc">
 * 如果使用SpringMVC的标签，设置form的modelAttribute属性，就不需要@ModelAttribute了
 * 但首先需要放一个user属性到模型中，见上面的loginPage2.
*/	@RequestMapping(value = "/model2")
	public String processInput2(User user) {
		System.out.println("userid:" + user.getUserid());
		System.out.println("username:" + user.getUsername());
		return "modelAttributeTestResult";
	}

/*	
 *  http://127.0.0.1:8080/HelloSpringMVC/databind/model1.mvc 
 *  每个功能方法(@RequestMapping)执行之前都会执行这个方法，把返回值放入模型中，需要注意是否真有必要这样做
 *  @ModelAttribute("cityList")
*/	public List<String> cityList() {
		return Arrays.asList("Beijing", "Shanghai", "Guangzhou");
	}

}
