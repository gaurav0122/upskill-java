package com.employee.controller;

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

import com.employee.mapper.EmployeeMapper;
import com.employee.model.PostEmployee;
import com.employee.model.UpdateEmployee;
import com.employee.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@PostMapping("/emp")
	public ResponseEntity<?> postEmployee(@RequestBody PostEmployee postEmployee){
		
		return new ResponseEntity<>(employeeService.addEmployee(employeeMapper.PostEmployeeToEmployee(postEmployee)),HttpStatus.OK);
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable long id){
		
		return new ResponseEntity<>(employeeMapper.employeeToEmployeeDto( employeeService.getEmployeeById(id)),HttpStatus.OK);
	}
	
	@DeleteMapping("/emp/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable long id){
		
		return new ResponseEntity<>(employeeMapper.employeeToEmployeeDto(employeeService.deleteEmployeeById(id)),HttpStatus.OK);
	}
	
	@PutMapping("/emp/{id}")
	public ResponseEntity<?> updateEmployee(@RequestBody UpdateEmployee updateEmployee, @PathVariable long id){
		
		return new ResponseEntity<>(employeeMapper.employeeToEmployeeDto(employeeService.updateEmployee(updateEmployee,id)),HttpStatus.OK);
	}
	
	@GetMapping("/emp/all")
	public ResponseEntity<?> getAllEmployee(){
		
		return new ResponseEntity<>(employeeMapper.employeeListToEmployeeDtoList(employeeService.getAllEmployee()),HttpStatus.OK);
	}
}
