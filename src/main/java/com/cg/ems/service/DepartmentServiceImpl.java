package com.cg.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.DepartmentRepository;
import com.cg.ems.entity.Department;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department addDepartment(Department department) throws Exception {
		departmentRepository.saveAndFlush(department);
		return department;
	}

	@Override
	public Department getDepartmentById(int departmentId) throws Exception {
		Department bean = null;
		try {
			bean = departmentRepository.findById(departmentId).get();
		}
		catch(Exception e) {
			throw new Exception("Department details not found!");
		}
		return bean;
	}

	@Override
	public List<Department> getDepartmentByEmployeeAsc() throws Exception {
		List<Department> ans = new ArrayList<Department>();
		try {
			ans = departmentRepository.findAll(Sort.by(Sort.Direction.ASC, "departmentName"));
		}
		catch(Exception e) {
			throw new Exception("Department details not found!");
		}
		return ans;
	}

	@Override
	public Department updateDepartment(Department department) throws Exception {
		Department bean = null;
		try {
			bean = departmentRepository.findById(department.getDepartmenttId()).get();
		}
		catch(Exception e) {
			throw new Exception("Department details not found!");
		}
		departmentRepository.saveAndFlush(department);
		return department;
	}

	@Override
	public Department deleteDepartmentById(int departmentId) throws Exception {
		Department bean = null;
		try {
			bean = departmentRepository.findById(departmentId).get();
		}
		catch(Exception e) {
			throw new Exception("Department details not found!");
		}
		departmentRepository.deleteById(departmentId);
		return bean;
	}

	@Override
	public List<Department> getAllDepartments() throws Exception {
		return departmentRepository.findAll();
	}

}
