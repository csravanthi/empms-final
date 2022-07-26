package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.SalaryRepository;
import com.cg.ems.entity.Address;
import com.cg.ems.entity.Salary;

@Service("SalaryService")
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public Salary addSalary(Salary salary) throws Exception {
		salaryRepository.saveAndFlush(salary);
		return salary;
	}

	@Override
	public Salary updateSalary(Salary salary) throws Exception {
		Salary bean = null;
		try {
			bean = salaryRepository.findById(salary.getSalaryId()).get();
		}
		catch(Exception e) {
			throw new Exception("Salary details not found!");
		}
		salaryRepository.saveAndFlush(salary);
		return salary;
	}

	@Override
	public Salary deleteSalaryById(int salaryId) throws Exception {
		Salary bean = null;
		try {
			bean = salaryRepository.findById(salaryId).get();
		}
		catch(Exception e) {
			throw new Exception("Salary details not found!");
		}
		salaryRepository.deleteById(salaryId);
		return bean;
	}

	@Override
	public Salary getSalaryById(int salaryId) throws Exception {
		Salary bean = null;
		try {
			bean = salaryRepository.findById(salaryId).get();
		}
		catch(Exception e) {
			throw new Exception("Salary details not found!");
		}
		return bean;
	}

	@Override
	public List<Salary> getAllSalaries() throws Exception {
		return salaryRepository.findAll();
	}

}
