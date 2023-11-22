package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.model.UpdateEmployee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	Employee getEmployeeById(long id);

	Employee deleteEmployeeById(long id);

	Employee updateEmployee(UpdateEmployee updateEmployee, long id);

	List<Employee> getAllEmployee();



}
