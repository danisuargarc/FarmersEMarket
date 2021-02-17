package com.market.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {
		return new ModelAndView("login", "message", "Hello World from getLoginPage()");
	}

}