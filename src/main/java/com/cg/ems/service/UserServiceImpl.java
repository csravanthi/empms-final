package com.cg.ems.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.UserRepository;
import com.cg.ems.entity.User;

@Service("UserService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userDao;

	@Override
	public User add(User user) throws Exception {
		userDao.saveAndFlush(user);
		return user;
	}

	@Override
	public User update(User user) throws Exception {
		User bean = null;
		try {
			bean = userDao.findById(user.getUserId()).get();
		}
		catch(Exception e) {
			throw new Exception("User details not found!");
		}
		userDao.saveAndFlush(user);
		return bean;
	}

	@Override
	public User delete(User user) throws Exception {
		User bean = null;
		try {
			bean = userDao.findById(user.getUserId()).get();
		}
		catch(Exception e) {
			throw new Exception("User details not found!");
		}
		userDao.deleteById(user.getUserId());
		return bean;
	}

	@Override
	public List<User> findByLoginId(String loginId) throws Exception {
		List<User> users = new ArrayList<>();
		try {
			for(User i :userDao.findAll()) {
				if(i.getLoginId().equals(loginId)) {
					users.add(i);
				}
			}
		}
		catch(Exception e) {
			throw new Exception("User details not found!");
		}
		return users;
	}

	@Override
	public User findById(int userId) throws Exception {
		User bean = null;
		try {
			bean = userDao.findById(userId).get();
		}
		catch(Exception e) {
			throw new Exception("User details not found!");
		}
		userDao.deleteById(userId);
		return bean;
	}

	@Override
	public User search(User user) throws Exception {
		User bean = null;
		try {
			bean = userDao.findById(user.getUserId()).get();
		}
		catch(Exception e) {
			throw new Exception("User details not found!");
		}
		userDao.deleteById(user.getUserId());
		return bean;
	}

	@Override
	public String authenticate(User user) throws Exception {
		User bean = null;
		try {
			bean = userDao.findById(user.getUserId()).get();
			for(User i : userDao.findAll()) {
				if(bean.getLoginId().equals(i.getLoginId())) {
					if(bean.getPassword().equals(i.getPassword())) {
						return "Authentication Successfull";
					}
					return "User details not found! Invalid details";
				}
			}
		}
		catch(Exception e) {
			throw new Exception("User details not found! Invalid details");
		}
		return null;
	}

	@Override
	public boolean changePassword(int userId, String oldPassword, String newPassword) throws Exception {
		User user = null;
		try {
			user = userDao.findById(userId).get();
		}
		catch(Exception e) {
			throw new Exception("User details not found");
		}
		user.setPassword(newPassword);
		return true;
	}

	@Override
	public User registerUser(User user) throws Exception {
		userDao.saveAndFlush(user);
		return user;
	}

	@Override
	public List<User> forgetPassword(String loginId) throws Exception {
		return findByLoginId(loginId);
	}

}
