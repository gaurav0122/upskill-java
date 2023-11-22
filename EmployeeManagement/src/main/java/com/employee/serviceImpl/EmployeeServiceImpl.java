package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.model.UpdateEmployee;
import com.employee.repo.EmployeeRepository;
import com.employee.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
	}


	@Override
	public Employee deleteEmployeeById(long id) {
		Employee emp = getEmployeeById(id);
		employeeRepository.delete(emp);
		return emp;
	}


	@Override
	public Employee updateEmployee(UpdateEmployee updateEmployee, long id) {
		Employee emp = getEmployeeById(id);
		if(updateEmployee.getEmployeeeName()!=null) {
			emp.setEmployeeeName(updateEmployee.getEmployeeeName());
		}
		if(updateEmployee.getEmployeeDepartment()!=null) {
			emp.setEmployeeDepartment(updateEmployee.getEmployeeDepartment());
		}
		if(updateEmployee.getEmployeeDesignation()!=null) {
			emp.setEmployeeDesignation(updateEmployee.getEmployeeDesignation());
		}
		if(updateEmployee.getEmployeeSalary()!=0) {
			emp.setEmployeeSalary(updateEmployee.getEmployeeSalary());
		}
		
		return employeeRepository.save(emp);
	}


	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

}
