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

import com.cg.ems.entity.Address;
import com.cg.ems.entity.Employee;
import com.cg.ems.entity.Project;
import com.cg.ems.service.AddressService;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.ProjectService;

@RestController
@RequestMapping("/ems-project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project project) throws Exception{
		return projectService.addProject(project);
	}
	
	@PutMapping("/updateProject")
	public Project updateProject(@RequestBody Project project) throws Exception{
		return projectService.updateProject(project);
	}
	
	@DeleteMapping("/deleteProjectById/{projectId}")
	public Project deleteProjectById(@PathVariable int projectId)throws Exception{
		return projectService.deleteProjectById(projectId);
	}
	
	@GetMapping("/getProjectById/{projectId}")
	public Project getProjectById(@PathVariable int projectId)throws Exception{
		return projectService.getProjectById(projectId);
	}

	@GetMapping("/getAllProjects")
	public List<Project> getAllProjects() throws Exception{
		return projectService.getAllProjects();
	}

}
