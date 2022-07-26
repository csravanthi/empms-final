package com.cg.ems.service;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.EmployeeRepository;
import com.cg.ems.entity.Employee;


@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		employeeRepository.saveAndFlush(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) throws Exception {
		Employee bean = null;
		try {
			bean = employeeRepository.findById(employeeId).get();
		}
		catch(Exception e) {
			throw new Exception("Employee details not found!");
		}
		return bean;
	}

	@Override
	public List<Employee> getEmployeeByDepartmentDesc() throws Exception {
		List<Employee> ans = new ArrayList<Employee>();
		try {
			ans = employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "age"));
		}
		catch(Exception e) {
			throw new Exception("Employee details not found!");
		}
		return ans;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws Exception {
		Employee bean = null;
		try {
			bean = employeeRepository.findById(employee.getEmployeeId()).get();
		}
		catch(Exception e) {
			throw new Exception("Employee details not found!");
		}
		employeeRepository.saveAndFlush(employee);
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int employeeId) throws Exception {
		Employee bean = null;
		try {
			bean = employeeRepository.findById(employeeId).get();
		}
		catch(Exception e) {
			throw new Exception("Employee details not found!");
		}
		employeeRepository.deleteById(employeeId);
		return bean;
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		return employeeRepository.findAll();
	}

}
