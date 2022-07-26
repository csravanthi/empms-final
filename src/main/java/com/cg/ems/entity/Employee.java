package com.cg.ems.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;


/*
  {
	"employeeName" : "kiran",
	"gender" : "Male",
	"age" : 25,
	"salary" : {
	    "salaryId": 3,
	    "workinghours": "8",
	    "overtime": "2",
	    "total": "10",
	    "details": "This is montly salary",
	    "salaryDate": "2021-01-29"
	},
	"project" :    {
	    "projectName" : "X",
	    "projectMaxHours" : "34",
	    "projectDescription" : "op",
	    "assignedDate" : "2021-01-29",
	    "lastDate" :"2021-06-29"
	  },
	"address" :  {
		"addressId": 4,
		"street": "wall street",
		"city": "california",
		"state": "california",
		"country": "USA",
		"zip": 16101
    }
	  
  }
  
  ---------------------------------------------------
  
  {
    "employeeId": 3,
    "employeeName": "kiran",
    "gender": "Male",
    "age": 25,
    "department": {
	    "departmenttId": 1,
	    "departmentName": "HR",
	    "totalNumberOfEmployee": 100,
	    "employees": null,
	    "projects": null
	},
    "salary": {
        "salaryId": 3,
        "workinghours": "8",
        "overtime": "2",
        "total": "10",
        "details": "This is montly salary",
        "salaryDate": "2021-01-29"
    },
    "project": {
        "projectId": 1,
        "projectName": "X",
        "projectMaxHours": "34",
        "projectDescription": "op",
        "assignedDate": "2021-01-29",
        "lastDate": "2021-06-29"
    },
    "address" :  {
		"addressId": 4,
		"street": "wall street",
		"city": "california",
		"state": "california",
		"country": "USA",
		"zip": 16101
    }
}
  
 */

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	private String employeeName;
	private String gender;
	private int age;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "departmentt_id", referencedColumnName = "departmenttId")
	private Department department;

	@OneToOne
	@JoinColumn(name = "salary_id", referencedColumnName = "salaryId")
	private Salary salary;
	
	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "addressId")
	private Address address;
	
	@OneToOne
	@JoinColumn(name = "project_id", referencedColumnName = "projectId")
	private Project project;
	

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, String gender, int age, Department department, Salary salary,
			Project project, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.project = project;
		this.address = address;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
