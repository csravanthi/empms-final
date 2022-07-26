package com.cg.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.entity.Employee;



@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
	
}
