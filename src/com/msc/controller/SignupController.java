package com.msc.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.msc.domain.User;
import com.msc.service.RegistrationService;
import com.msc.validator.UserValidation;

@Controller
@RequestMapping("/signup.htm")
public class SignupController
{
	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private UserValidation userValidation;
	
	@RequestMapping(method = RequestMethod.POST)
	public String signup(@Valid User user, BindingResult result)
	{
		this.userValidation.validate(user, result);
		if (result.hasErrors())
		{
			return "signup";
		}
		try
		{
			this.registrationService.register(user);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return "signupSuccess";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Map model)
	{
		User user = new User();
		model.put("user", user);
		return "signup";
	}
}