package com.cg.ems.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

/*
 
 {
	"workinghours" : "12",
	"overtime" : "2",
	"total" : "12",
	"details" : "yz",
	"salaryDate" : "2021-01-29"
}

  
 */

@Entity
public class Salary {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int salaryId;
	private String workinghours;
	private String overtime;
	private String total;
	private String details;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") //2021-01-29
	private LocalDate salaryDate;
	
	public Salary() {
		super();
	}

	public Salary(int salaryId, String workinghours, String overtime, String total, String details,
			LocalDate salaryDate) {
		super();
		this.salaryId = salaryId;
		this.workinghours = workinghours;
		this.overtime = overtime;
		this.total = total;
		this.details = details;
		this.salaryDate = salaryDate;
	}

	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public String getWorkinghours() {
		return workinghours;
	}

	public void setWorkinghours(String workinghours) {
		this.workinghours = workinghours;
	}

	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDate getSalaryDate() {
		return salaryDate;
	}

	public void setSalaryDate(LocalDate salaryDate) {
		this.salaryDate = salaryDate;
	}
	
	
	

}
