package com.msc.service;

import com.msc.domain.User;

public interface RegistrationService
{
	public boolean doesEmailExist(String email);
	public boolean doesUsernameExist(String username);
	public void register(User user);
}
