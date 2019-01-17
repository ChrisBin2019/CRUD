package com.daoImpl;


import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.dao.UserDao;
import com.pojo.User;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {
	
	@Override
	public User selectUser(String email,String passWord) {
		User jspU=new User();
		jspU.setEmail(email);
		jspU.setPassWord(passWord);
		User u= (User) this.getSqlMapClientTemplate()
				.queryForObject("selectUser",jspU);
		System.out.println("dbUser:"+u);
		return u;
	}
	
}
