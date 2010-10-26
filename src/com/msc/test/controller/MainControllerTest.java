package com.msc.test.controller;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.springframework.test.web.ModelAndViewAssert.*;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import com.msc.controller.MainController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-servlet.xml"})
public class MainControllerTest
{

	@Autowired
	private ApplicationContext applicationContext;
	private HandlerAdapter handlerAdapter;
	private MockHttpServletRequest request;
	private MockHttpServletResponse response;
	private MainController controller;
	
	@Before
	public void setUp() throws Exception
	{
		this.handlerAdapter = this.applicationContext.getBean(HandlerAdapter.class);
		this.request = new MockHttpServletRequest();
		this.response = new MockHttpServletResponse();
		this.controller = new MainController();
	}

	@Test
	public void testGetHome() throws Exception
	{
		this.request.setRequestURI("/index.htm");
		this.request.setMethod("GET");
		final ModelAndView mav = this.handlerAdapter.handle(this.request, this.response, this.controller);
		assertViewName(mav, "main");
	}

}
