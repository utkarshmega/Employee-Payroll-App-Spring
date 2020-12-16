package com.capgemini.employeeparollappspring.dto;

import java.sql.Date;

public class EmployeePayrollDTO {
	
	public String name;
	public long salary;
	public String profilePic;
	public String gender;
	public String notes;
	public String[] departments;
	public Date startDate;
	
	public EmployeePayrollDTO(String name, String profilePic, String gender, long salary, String[] departments, 
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
