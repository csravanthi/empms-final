package com.cg.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 
  
  {
	  "firstName": "string",
	  "lastName": "string",
	  "loginId": "string",
	  "password": "string",
	  "mobileNo": "string",
	  "emailId": "string",
	  "employee" :   {
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
		    }
		}
   }
   
   ---------------------------------------
   
   
   {
    "userId": 2,
    "firstName": "string",
    "lastName": "string",
    "loginId": "string",
    "password": "string",
    "mobileNo": "string",
    "emailId": "string",
    "employee": {
        "employeeId": 3,
        "employeeName": "kiran",
        "gender": "Male",
        "age": 25,
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
        }
    }
}
  
 */



@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	private String lastName;
	private String loginId;
	private String password;
	private String mobileNo;
	private String emailId;

	@OneToOne
	@JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
	private Employee employee;
	
	public User() {
		super();
	}

	public User(int userId, String firstName, String lastName, String loginId, String password, String mobileNo,
			String emailId, Employee employee) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginId = loginId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.employee = employee;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

	
	

}
