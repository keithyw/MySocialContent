package com.msc.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import com.msc.domain.User;
import com.msc.service.RegistrationService;

@Component("userValidation")
public class UserValidation
{
	@Autowired
	private RegistrationService registrationService;
	
	public boolean supports(Class<?> clazz)
	{
		return User.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors)
	{
		User user = (User)target;
		if (!user.getPassword().equals(user.getConfirmPassword()))
		{
			errors.rejectValue("password", "error.confirm.password.wrong");
		}
		if (this.registrationService.doesEmailExist(user.getEmail()))
		{
			errors.rejectValue("email", "error.email.exist");
		}
		if (this.registrationService.doesUsernameExist(user.getUsername()))
		{
			errors.rejectValue("username", "error.username.exist");
		}
	}
}
