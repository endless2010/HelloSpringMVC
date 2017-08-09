package com.endless.web.databind;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/databind")
// 多个类的RequestMapping的值都是/databind也可以
public class ModelController {

	/*
	 * http://127.0.0.1:8080/HelloSpringMVC/databind/modelMap.mvc
	 * ModelMap作为入参，参数放到ModelMap中就可放入request中
	 */
	@RequestMapping(value="/modelMap")
	public String helloModelMap(ModelMap modelMap){
		modelMap.addAttribute("message", "Hello ModelMap");
		return "modelTest";
	}

	/*
	 * http://127.0.0.1:8080/HelloSpringMVC/databind/map1.mvc
	 * Map作为入参，参数放到Map中就可放入request中
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/map1")
	public String helloMap1(Map map){
		map.put("message", "Hello Map 1");
		return "modelTest";
	}
	
	/*
	 * http://127.0.0.1:8080/HelloSpringMVC/databind/map2.mvc
	 * Map<String,Object>也可以
	 */
	@RequestMapping(value="/map2")
	public String helloMap2(Map<String,Object> map){
		map.put("message", "Hello Map 2");
		return "modelTest";
	}
	
	/*
	 * http://127.0.0.1:8080/HelloSpringMVC/databind/modelMap.mvc
	 * public String helloModelAndView(ModelAndView mv)这样不行
	 */
	@RequestMapping(value="/modelAndView")
	public ModelAndView helloModelAndView(){
		ModelAndView mv = new ModelAndView();
			mv.addObject("message", "Hello ModelAndView");
			mv.setViewName("modelTest");
		return mv;
	}
}
