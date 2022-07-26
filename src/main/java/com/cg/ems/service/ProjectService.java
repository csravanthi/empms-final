package com.cg.ems.service;

import java.util.List;

import com.cg.ems.entity.Project;
import com.cg.ems.entity.Salary;

public interface ProjectService {
	
	
	public Project addProject(Project project) throws Exception;
	public Project updateProject(Project project) throws Exception;
	public Project deleteProjectById(int projectId)throws Exception;
	public Project getProjectById(int projectId)throws Exception;
	public List<Project> getAllProjects() throws Exception;


}
