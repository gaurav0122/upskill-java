package com.employee.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostEmployee {

	private String employeeeName;
	
	private String employeeDepartment;
	
	private String employeeDesignation;
	
	private double employeeSalary;
}
