package com.cg.ems.service;

import java.util.List;

import com.cg.ems.entity.Address;
import com.cg.ems.entity.Salary;

public interface SalaryService {
	
	public Salary addSalary(Salary salary) throws Exception;
	public Salary updateSalary(Salary salary) throws Exception;
	public Salary deleteSalaryById(int salaryId)throws Exception;
	public Salary getSalaryById(int salaryId)throws Exception;
	public List<Salary> getAllSalaries() throws Exception;


}
