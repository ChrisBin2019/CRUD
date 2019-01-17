package com.service;

import com.pojo.User;

public interface UserService {
	public User findUser(String email,String passWord);
}
