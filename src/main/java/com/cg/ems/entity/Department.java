package com.cg.ems.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
/*
 
  
{
	"departmentName" : "IT",
	"totalNumberOfEmployee" : 10
}
  
 */

import com.fasterxml.jackson.annotation.JsonIgnore;


/*
 
 {
	"departmentName" : "HR",
	"totalNumberOfEmployee" : 100
}


{
    "departmenttId": 1,
    "departmentName": "HR",
    "totalNumberOfEmployee": 100,
    "employees": null,
    "projects": null
}




 */

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmenttId;
	private String departmentName;
	private int totalNumberOfEmployee;

	@OneToMany(mappedBy = "department" , fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Employee> employees;
	
	
	@OneToMany(mappedBy = "department" , fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Project> projects;

	public Department() {
		super();
	}

	public Department(int departmenttId, String departmentName, int totalNumberOfEmployee, List<Employee> employees,
			List<Project> projects) {
		super();
		this.departmenttId = departmenttId;
		this.departmentName = departmentName;
		this.totalNumberOfEmployee = totalNumberOfEmployee;
		this.employees = employees;
		this.projects = projects;
	}

	public int getDepartmenttId() {
		return departmenttId;
	}

	public void setDepartmenttId(int departmenttId) {
		this.departmenttId = departmenttId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getTotalNumberOfEmployee() {
		return totalNumberOfEmployee;
	}

	public void setTotalNumberOfEmployee(int totalNumberOfEmployee) {
		this.totalNumberOfEmployee = totalNumberOfEmployee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	

	
	

}
