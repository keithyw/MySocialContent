package com.msc.domain;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false, proxyClass=User.class)
@Table(name="users")
public class User
{
	private Long id;
	private String firstName;
	private String lastName;	
	private String email;
	private String username;
	private String password;
	private String confirmPassword;
	
	public User(){}

	@GeneratedValue
	@Id
	@Column(name="id")
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	@Column(name="first_name")
	@NotNull
	@Size(min=2,max=50)
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	@Column(name="last_name")
	@NotNull
	@Size(min=2,max=50)
	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Column(name="email")
	@NotNull
	@Size(min=5,max=150)
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Column(name="username")
	@NotNull
	@Size(min=2,max=50)
	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	@Column(name="password")
	@NotNull
	@Size(min=8,max=100)
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Transient
	@NotNull
	@Size(min=8,max=100)
	public String getConfirmPassword()
	{
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}
	
	
}
