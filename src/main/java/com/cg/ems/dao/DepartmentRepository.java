package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.entity.Department;


@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Integer> {

}
