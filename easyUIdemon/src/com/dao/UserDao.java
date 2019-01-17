package com.dao;

import com.pojo.User;

public interface UserDao {
	public User selectUser(String email,String passWord);
}
