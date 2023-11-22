package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {

	private long employeeId;
	
	private String employeeeName;
	
	private String employeeDepartment;
	
	private String employeeDesignation;
	
	private double employeeSalary;
}
