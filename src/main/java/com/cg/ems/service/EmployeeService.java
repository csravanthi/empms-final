package com.cg.ems.service;

import java.util.List;

import com.cg.ems.entity.Department;
import com.cg.ems.entity.Employee;


public interface EmployeeService {
	
	public Employee addEmployee(Employee employee) throws Exception;
	public Employee updateEmployee(Employee employee) throws Exception;
	public Employee deleteEmployeeById(int employeeId)throws Exception;
	public List< Employee> getAllEmployees() throws Exception;
	public Employee getEmployeeById(int employeeId)throws Exception;
	public List<Employee> getEmployeeByDepartmentDesc() throws Exception;


}
