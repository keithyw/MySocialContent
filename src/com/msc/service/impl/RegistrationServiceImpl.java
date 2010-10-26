package com.msc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msc.dao.UserDao;
import com.msc.domain.User;
import com.msc.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService
{
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	@Transactional
	public void register(User user)
	{
		this.userDao.save(user);
	}

	@Override
	public boolean doesEmailExist(String email)
	{
		return this.userDao.doesEmailExist(email);
	}

	@Override
	public boolean doesUsernameExist(String username)
	{
		return this.userDao.doesUsernameExist(username);
	}

}
