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

import com.cg.ems.dao.SalaryRepository;
import com.cg.ems.entity.Address;
import com.cg.ems.entity.Employee;
import com.cg.ems.entity.Project;
import com.cg.ems.entity.Salary;
import com.cg.ems.service.AddressService;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.ProjectService;
import com.cg.ems.service.SalaryService;

@RestController
@RequestMapping("/ems-salary")
public class SalaryController {
	
	@Autowired
	SalaryService salaryService;
	
	@PostMapping("/addSalary")
	public Salary addSalary(@RequestBody Salary salary) throws Exception{
		return salaryService.addSalary(salary);
	}
	
	@PutMapping("/updateSalary")
	public Salary updateSalary(@RequestBody Salary salary) throws Exception{
		return salaryService.updateSalary(salary);
	}
	
	@DeleteMapping("/deleteSalaryById/{salaryId}")
	public Salary deleteSalaryById(@PathVariable int salaryId)throws Exception{
		return salaryService.deleteSalaryById(salaryId);
	}
	
	@GetMapping("/getSalaryById/{salaryId}")
	public Salary getSalaryById(@PathVariable int salaryId)throws Exception{
		return salaryService.getSalaryById(salaryId);
	}
	
	@GetMapping("/getAllSalaries")
	public List<Salary> getAllSalaries() throws Exception{
		return salaryService.getAllSalaries();
	}

}
