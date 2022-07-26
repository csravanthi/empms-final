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

import com.cg.ems.entity.Department;
import com.cg.ems.service.DepartmentService;


@RestController
@RequestMapping("/ems-department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/addDepartment")
	public Department addDepartment(@RequestBody Department department) throws Exception{
		return departmentService.addDepartment(department);
	}
	
	@GetMapping("/getDepartmentById/{departmentId}")
	public Department getDepartmentById(@PathVariable int departmentId)throws Exception{
		return departmentService.getDepartmentById(departmentId);
	}
	
	@GetMapping("/getDepartmentByEmployeeAsc")
	public List<Department> getDepartmentByEmployeeAsc() throws Exception{
		return departmentService.getDepartmentByEmployeeAsc();
	}
	
	@PutMapping("/updateDepartment")
	public Department updateDepartment(@RequestBody Department department) throws Exception{
		return departmentService.updateDepartment(department);
	}
	
	@DeleteMapping("/deleteDepartmentById/{departmentId}")
	public Department deleteDepartmentById(@PathVariable int departmentId)throws Exception{
		return departmentService.deleteDepartmentById(departmentId);
	}
	
	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments() throws Exception{
		return departmentService.getAllDepartments();
	}

}
