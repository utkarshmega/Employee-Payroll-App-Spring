package com.capgemini.employeeparollappspring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeparollappspring.dto.EmployeePayrollDTO;
import com.capgemini.employeeparollappspring.model.EmployeePayrollData;
import com.capgemini.employeeparollappspring.repository.EmployeePayrollDataRepository;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	
	@Autowired
	private EmployeePayrollDataRepository employeePayrollRepository;
	
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return (List<EmployeePayrollData>) employeePayrollRepository.findAll();
	}
	
	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int employeeId) {
		return employeePayrollRepository.findById(employeeId).get();
	}
	
	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
		employeePayrollRepository.save(employeePayrollData);
		return employeePayrollData;
	}
	
	@Override
	public EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(employeeId);
		employeePayrollData.setName(employeePayrollDTO.getName());
		employeePayrollData.setGender(employeePayrollDTO.getGender());
		employeePayrollData.setProfilePic(employeePayrollDTO.getProfilePic());
		employeePayrollData.setSalary(employeePayrollDTO.getSalary());
		employeePayrollData.setNotes(employeePayrollDTO.getNotes());
		employeePayrollData.setDepartments(employeePayrollDTO.getDepartments());
		employeePayrollData.setStartDate(employeePayrollDTO.getStartDate());
		employeePayrollRepository.save(employeePayrollData);
		
		return employeePayrollData;
	}

	@Override
	public void deleteEmployeePayrollData(int employeeId) {	
		
		employeePayrollRepository.deleteById(employeeId);

	}

}
