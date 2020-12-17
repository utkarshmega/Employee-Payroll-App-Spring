package com.capgemini.employeeparollappspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeeparollappspring.dto.EmployeePayrollDTO;
import com.capgemini.employeeparollappspring.dto.ResponseDTO;
import com.capgemini.employeeparollappspring.exception.InputException;
import com.capgemini.employeeparollappspring.model.EmployeePayrollData;
import com.capgemini.employeeparollappspring.services.EmployeePayrollService;
import com.capgemini.employeeparollappspring.services.IEmployeePayrollService;
import com.capgemini.employeeparollappspring.validations.Validation;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@Autowired
	private IEmployeePayrollService employeepayrollService;
	
	@RequestMapping(value = {"", "/", "/get"})
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = null;
		empDataList = employeepayrollService.getEmployeePayrollData();
		return empDataList;
	}
	
	@GetMapping("/get/{employeeId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("employeeId") int employeeId) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = employeepayrollService.getEmployeePayrollDataById(employeeId);
		ResponseDTO responseDTO = new ResponseDTO("GET Call For ID Successfull", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) throws InputException{
		//Validation validation = new Validation(employeePayrollDTO);
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = employeepayrollService.createEmployeePayrollData(employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data Successfull", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{employeeId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("employeeId") int employeeId, @RequestBody EmployeePayrollDTO employeePayrollDTO) throws InputException {
		//Validation validation = new Validation(employeePayrollDTO);
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = employeepayrollService.updateEmployeePayrollData(employeeId, employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data Successfull", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("employeeId") int employeeId) {
		employeepayrollService.deleteEmployeePayrollData(employeeId);
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted ID: " + employeeId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}


