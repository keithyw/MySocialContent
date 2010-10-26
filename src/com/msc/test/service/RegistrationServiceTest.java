package com.msc.test.service;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.HandlerAdapter;

import com.msc.dao.UserDao;
import com.msc.domain.User;
import com.msc.service.RegistrationService;
import com.msc.service.impl.RegistrationServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:WebContent/WEB-INF/spring-servlet.xml"})
public class RegistrationServiceTest
{
	@Autowired
	private ApplicationContext applicationContext;
	private HandlerAdapter handlerAdapter;
	
	private RegistrationServiceImpl registrationService;
	private UserDao userDao;
	
	@Before
	public void setUp() throws Exception
	{
		this.userDao = mock(UserDao.class);
		this.handlerAdapter = this.applicationContext.getBean(HandlerAdapter.class);
		this.registrationService = new RegistrationServiceImpl();
		this.registrationService.setUserDao(this.userDao);
	}

	@Test
	public void testRegister() throws Exception
	{
		User user = new User();
		user.setUsername("keithyw");
		user.setEmail("conark@gmail.com");
		this.registrationService.register(user);
		assertEquals("equals", 1, user.getId());
	}

}
