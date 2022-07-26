package com.cg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.ems.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.dao.SalaryRepository;
import com.cg.ems.entity.Address;
import com.cg.ems.entity.Employee;
import com.cg.ems.entity.Project;
import com.cg.ems.entity.Salary;
import com.cg.ems.entity.User;
import com.cg.ems.service.AddressService;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.ProjectService;
import com.cg.ems.service.SalaryService;

@RestController
@RequestMapping("/ems-user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public User add(@RequestBody User user) throws Exception{
		return userService.add(user);
	}
	
	@PutMapping("/updateuser")
	public User update(@RequestBody User user)throws Exception{
		return userService.update(user);
	}
	
	@DeleteMapping("/deleteuser")
	public User delete(@RequestBody User user)throws Exception{
		return userService.delete(user);
	}
	
	@GetMapping("/getuserbyloginid/{loginId}")
	public List<User> findByLoginId(@PathVariable String loginId)throws Exception{
		return userService.findByLoginId(loginId);
	}
	
	@GetMapping("/getuserbyid/{userId}")
	public User findById(@PathVariable int userId)throws Exception{
		return userService.findById(userId);
	}
	
	@GetMapping("/getuser")
	public User search(@RequestBody User user)throws Exception{
		return userService.search(user);
	}
	
	@GetMapping("/authenticate")
	public String authenticate(@RequestBody User user)throws Exception{
		return userService.authenticate(user);
	}
	
	@PutMapping("/updatepassword/{userId}/{oldPassword}/{newPassword}")
	public boolean changePassword(@PathVariable int userId,@PathVariable  String oldPassword,@PathVariable  String newPassword)throws Exception {
		return userService.changePassword(userId, oldPassword, newPassword);
	}

	@PostMapping("/registeruser")
    public User registerUser(@RequestBody User user)throws Exception{
    	return userService.registerUser(user);
    }
    
	@GetMapping("/forgotpassword/{loginId}")
    public List<User>  forgetPassword(@PathVariable String loginId)throws Exception{
    	return userService.forgetPassword(loginId);
    }

}
