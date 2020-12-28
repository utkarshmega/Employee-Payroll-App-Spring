package com.capgemini.employeeparollappspring.dto;

import java.sql.Date;
import java.util.List;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

public @Data class EmployeePayrollDTO {
	
	private String name;
	private long salary;
	private String profilePic;
	private String gender;
	private String notes;
	private List<String> departments;
	@JsonFormat(pattern = "dd MMM yyyy")
	private Date startDate;
	
	public EmployeePayrollDTO() {

	}

	public EmployeePayrollDTO(String name, String profilePic, String gender, long salary, List<String> departments, 
			Date startDate, String notes) {
		super();
		this.name = name;
		this.profilePic = profilePic;
		this.gender = gender;
		this.salary = salary;
		this.departments = departments;
		this.startDate = startDate;
		this.notes = notes;
		
	}

}
