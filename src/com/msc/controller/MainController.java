package com.msc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index.htm")
public class MainController
{
	@RequestMapping(method = RequestMethod.GET)
	public String getHome()
	{
		return "main";
	}
}
