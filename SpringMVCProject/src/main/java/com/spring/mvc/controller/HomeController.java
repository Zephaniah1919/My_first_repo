package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/overview")
	public String method1() {
		System.out.println("Going to index.jsp page, Called from method1");
		return "overview";
	}
	
	@RequestMapping("/content")
	public String method2() {
		System.out.println("Going to index.jsp page, Called from method2");
		return "display";
	}
	
}