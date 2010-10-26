package com.msc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login.htm")
public class LoginController
{
	@RequestMapping(method = RequestMethod.POST)
	public String login()
	{
		return "loginSuccess";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String index()
	{
		return "login";
	}
}