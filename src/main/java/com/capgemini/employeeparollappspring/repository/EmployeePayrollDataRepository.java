package com.capgemini.employeeparollappspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.employeeparollappspring.model.EmployeePayrollData;

public interface EmployeePayrollDataRepository extends JpaRepository<EmployeePayrollData, Integer> {
	
}
