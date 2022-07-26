package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.ProjectRepository;
import com.cg.ems.entity.Project;
import com.cg.ems.entity.Salary;

@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project addProject(Project project) throws Exception {
		projectRepository.saveAndFlush(project);
		return project;
	}

	@Override
	public Project updateProject(Project project) throws Exception {
		Project bean = null;
		try {
			bean = projectRepository.findById(project.getProjectId()).get();
		}
		catch(Exception e) {
			throw new Exception("Project details not found!");
		}
		projectRepository.saveAndFlush(project);
		return project;
	}

	@Override
	public Project deleteProjectById(int projectId) throws Exception {
		Project bean = null;
		try {
			bean = projectRepository.findById(projectId).get();
		}
		catch(Exception e) {
			throw new Exception("Project details not found!");
		}
		projectRepository.deleteById(projectId);
		return bean;
	}

	@Override
	public Project getProjectById(int projectId) throws Exception {
		Project bean = null;
		try {
			bean = projectRepository.findById(projectId).get();
		}
		catch(Exception e) {
			throw new Exception("Project details not found!");
		}
		return bean;
	}

	@Override
	public List<Project> getAllProjects() throws Exception {
		return projectRepository.findAll();
	}

}
