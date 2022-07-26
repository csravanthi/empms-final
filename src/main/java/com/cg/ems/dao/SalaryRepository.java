package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.entity.Salary;
import com.cg.ems.entity.User;

@Repository
public interface SalaryRepository  extends JpaRepository<Salary, Integer> {

}
