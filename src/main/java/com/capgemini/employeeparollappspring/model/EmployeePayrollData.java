package com.capgemini.employeeparollappspring.model;

import com.capgemini.employeeparollappspring.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
	
	private int employeeId;
	private String name;
	private long salary;
	
	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.setEmployeeId(employeeId);
		this.setName(employeePayrollDTO.name);
		this.setSalary(employeePayrollDTO.salary);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
