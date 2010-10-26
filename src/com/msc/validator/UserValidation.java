package com.msc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import com.msc.domain.User;

@Component("userValidation")
public class UserValidation
{
	public boolean supports(Class<?> clazz)
	{
		return User.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors)
	{
		User user = (User)target;
		if (!user.getPassword().equals(user.getConfirmPassword()))
		{
			errors.reject("password", "error.confirm.password.wrong");
		}
	}
}
