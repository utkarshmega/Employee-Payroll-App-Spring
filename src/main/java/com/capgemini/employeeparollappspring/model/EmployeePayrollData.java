package com.capgemini.employeeparollappspring.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.capgemini.employeeparollappspring.dto.EmployeePayrollDTO;

@Entity
@Table(name = "employees")
public class EmployeePayrollData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String profilePic;
	private String gender;
	private long salary;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentId")
	private List<Department> departments;
	private Date startDate;
	private String notes;
	
	public EmployeePayrollData() {
		
	}
	
	public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.setName(employeePayrollDTO.name);
		this.setProfilePic(employeePayrollDTO.profilePic);
		this.setGender(employeePayrollDTO.gender);
		this.setSalary(employeePayrollDTO.salary);
		List<Department> departments = new ArrayList<Department>();
		for(String department : employeePayrollDTO.departments) {
			departments.add(new Department(department));
		}
		this.departments = departments;
		this.setNotes(employeePayrollDTO.notes);
		this.setStartDate(employeePayrollDTO.startDate);
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

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String[] getDepartments() {
		String array[] = new String[departments.size()];              
		for(int j =0;j<departments.size();j++){
		  array[j] = departments.get(j).getDepartmentName();
		}
		return array;
	}

	public void setDepartments(String[] departments) {
		List<Department> departmentList = new ArrayList<Department>();
		for(String department : departments) {
			departmentList.add(new Department(department));
		}
		this.departments = departmentList;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
