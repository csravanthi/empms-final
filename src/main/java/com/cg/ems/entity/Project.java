package com.cg.ems.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

/*
 
 {
    "projectName" : "X",
    "projectMaxHours" : "34",
    "projectDescription" : "op",
    "assignedDate" : "2021-01-29",
    "lastDate" :"2021-06-29"
 }
  
   {
    "projectName" : "X",
    "projectMaxHours" : "34",
    "projectDescription" : "op",
    "assignedDate" : "2021-01-29",
    "lastDate" :"2021-06-29",
    "department" :  {
	    "departmenttId": 1,
	    "departmentName": "HR",
	    "totalNumberOfEmployee": 100,
	    "employees": null,
	    "projects": null
    }
  }
 

 */

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	private String projectName;
	private String projectMaxHours;
	private String projectDescription;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") //2021-01-29
	private LocalDate assignedDate;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") //2021-01-29
	private LocalDate lastDate;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "departmentt_id", referencedColumnName = "departmenttId")
	private Department department;

	public Project() {
		super();
	}

	public Project(int projectId, String projectName, String projectMaxHours, String projectDescription,
			LocalDate assignedDate, LocalDate lastDate, Department department) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectMaxHours = projectMaxHours;
		this.projectDescription = projectDescription;
		this.assignedDate = assignedDate;
		this.lastDate = lastDate;
		this.department = department;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectMaxHours() {
		return projectMaxHours;
	}

	public void setProjectMaxHours(String projectMaxHours) {
		this.projectMaxHours = projectMaxHours;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public LocalDate getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(LocalDate assignedDate) {
		this.assignedDate = assignedDate;
	}

	public LocalDate getLastDate() {
		return lastDate;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
