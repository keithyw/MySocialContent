package com.msc.dao;

import java.util.List;
import com.msc.domain.User;

public interface UserDao
{
	public User findById(Long id);
	public boolean doesUsernameExist(String username);
	public boolean doesEmailExist(String email);
	public User findByUsername(String username);
	public List<User> findAll();
	public void save(User user);
}
