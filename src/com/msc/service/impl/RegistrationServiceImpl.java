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
	public void register(User user) throws Exception
	{
		if (this.userDao.doesUsernameExist(user.getUsername())) 
			throw new Exception(user.getUsername() + " already exist");
		if (this.userDao.doesEmailExist(user.getEmail()))
			throw new Exception(user.getEmail() + " already exist");
		this.userDao.save(user);
	}

}
