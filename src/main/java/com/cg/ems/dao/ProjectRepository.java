package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.entity.Project;
import com.cg.ems.entity.Salary;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
