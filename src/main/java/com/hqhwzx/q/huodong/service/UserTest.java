package com.hqhwzx.q.huodong.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hqhwzx.entity.User;
import com.hqhwzx.q.huodong.repository.UserCRUDRepository;
import com.hqhwzx.utils.MyUtils;

public class UserTest {

	@Autowired
	UserCRUDRepository userCrud;
	@Autowired
	User user;
	@Autowired
	MyUtils myUtils;
	
	public void add() {
		user.setPhone(String.valueOf(myUtils.random(11)));
		userCrud.save(user);
	}
}