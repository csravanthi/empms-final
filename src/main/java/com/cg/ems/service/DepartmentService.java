package com.cg.ems.service;

import java.util.List;

import com.cg.ems.entity.Department;


public interface DepartmentService {
	
	public Department addDepartment(Department department) throws Exception;
	public Department updateDepartment(Department department) throws Exception;
	public Department deleteDepartmentById(int departmentId)throws Exception;
	public Department getDepartmentById(int departmentId)throws Exception;
	public List<Department> getAllDepartments() throws Exception;
	public List<Department> getDepartmentByEmployeeAsc() throws Exception;

}
