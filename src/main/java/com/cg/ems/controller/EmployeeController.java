package com.cg.ems.controller;


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

import com.cg.ems.entity.Employee;
import com.cg.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems-employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) throws Exception{
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/getEmployeeById/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId)throws Exception{
		return employeeService.getEmployeeById(employeeId);
	}
	
	@GetMapping("/getEmployeeByDepartmentDesc")
	public List<Employee> getEmployeeByDepartmentDesc() throws Exception{
		return employeeService.getEmployeeByDepartmentDesc();
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) throws Exception{
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/deleteEmployeeById/{employeeId}")
	public Employee deleteEmployeeById(@PathVariable int employeeId)throws Exception{
		return employeeService.deleteEmployeeById(employeeId);
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees()throws Exception{
		return employeeService.getAllEmployees();
	}

}

