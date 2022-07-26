package com.cg.ems.service;

import java.util.List;

import com.cg.ems.entity.User;

public interface UserService {
	
	public User add(User user) throws Exception;
	public User update(User user)throws Exception;
	public User delete(User user)throws Exception;
	public List<User> findByLoginId(String loginId)throws Exception;
	public User findById(int userId)throws Exception;
	public User search(User user)throws Exception;
	public String authenticate(User user)throws Exception;
	public boolean changePassword(int userId, String oldPassword, String newPassword)throws Exception;
    public User registerUser(User user)throws Exception;
    public List<User>  forgetPassword(String loginId)throws Exception;

}
