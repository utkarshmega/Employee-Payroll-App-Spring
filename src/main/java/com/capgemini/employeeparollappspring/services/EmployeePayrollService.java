package com.capgemini.employeeparollappspring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.employeeparollappspring.dto.EmployeePayrollDTO;
import com.capgemini.employeeparollappspring.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = new ArrayList<EmployeePayrollData>();
		empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Aditya", 30000)));
		return empDataList;
	}
	
	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int employeeId) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Aditya", 30000));
		return employeePayrollData;
	}
	
	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeePayrollData;
	}
	
	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeePayrollData;
	}

	@Override
	public void deleteEmployeePayrollData(int employeeId) {

	}

}
