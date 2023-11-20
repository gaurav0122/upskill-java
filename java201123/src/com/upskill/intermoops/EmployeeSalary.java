package com.upskill.intermoops;


public class EmployeeSalary{

	public static void main(String[] args) {
		
		Employee empLabour = new Labour();
		System.out.println(empLabour.calculateTotalSalary(20));
		
		Employee empManager = new Manager();
		System.out.println(empManager.calculateTotalSalary(20));

	}
}

class Employee {
	
	public int calculateTotalSalary(int days) {
		return days;
	}
}

class Labour extends Employee{
	 int overtime=500;
	 
	 @Override
	 public int calculateTotalSalary(int days) {
			return (days *200) + overtime;
	}
}

class Manager extends Employee{
	int incentive=1000;
	
	@Override
	public int calculateTotalSalary(int days) {
		return (days*100)+incentive;
	}
}
