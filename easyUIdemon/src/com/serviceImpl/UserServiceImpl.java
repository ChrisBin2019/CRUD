package com.serviceImpl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public User findUser(String email, String passWord) {
		// TODO Auto-generated method stub
		User u=this.getUserDao().selectUser(email, passWord);
		System.out.println("欢迎使用业务层！");
		
		return u;
	}

}
