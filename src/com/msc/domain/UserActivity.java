package com.msc.domain;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false, proxyClass=UserActivity.class)
@Table(name="user_activities")
public class UserActivity
{
	private long id;
	private long userId;
	private long activityId;
	
	public UserActivity(){}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public long getUserId()
	{
		return userId;
	}

	public void setUserId(long userId)
	{
		this.userId = userId;
	}

	public long getActivityId()
	{
		return activityId;
	}

	public void setActivityId(long activityId)
	{
		this.activityId = activityId;
	}
	
	
}
