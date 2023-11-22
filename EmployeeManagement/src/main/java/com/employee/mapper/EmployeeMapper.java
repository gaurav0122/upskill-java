package com.employee.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.model.PostEmployee;
import com.employee.model.UpdateEmployee;

@Component
public class EmployeeMapper {

	public EmployeeDto employeeToEmployeeDto(Employee employee) {
		return EmployeeDto.builder()
					.employeeId(employee.getEmployeeId())
					.employeeDepartment(employee.getEmployeeDepartment())
					.employeeDesignation(employee.getEmployeeDesignation())
					.employeeeName(employee.getEmployeeeName())
					.employeeSalary(employee.getEmployeeSalary())
					.build();
	}
	
	public Employee PostEmployeeToEmployee(PostEmployee employee) {
		return Employee.builder()
					.employeeDepartment(employee.getEmployeeDepartment())
					.employeeDesignation(employee.getEmployeeDesignation())
					.employeeeName(employee.getEmployeeeName())
					.employeeSalary(employee.getEmployeeSalary())
					.build();
	}
	
	public Employee UpdateEmployeeToEmployee(UpdateEmployee employee) {
		return Employee.builder()
					.employeeDepartment(employee.getEmployeeDepartment())
					.employeeDesignation(employee.getEmployeeDesignation())
					.employeeeName(employee.getEmployeeeName())
					.employeeSalary(employee.getEmployeeSalary())
					.build();
	}

	public List<EmployeeDto> employeeListToEmployeeDtoList(List<Employee> allEmployee) {
		List<EmployeeDto> list = new ArrayList<>();
		allEmployee.stream().forEach(e->{
			list.add(employeeToEmployeeDto(e));
		});
		
		return list;
	}
	
}
