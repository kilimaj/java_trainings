package dev.kilima.springmybatis.empl.service;

import java.util.List;

import dev.kilima.springmybatis.empl.beans.Employee;

public interface EmployeeService {

	int addEmployee(Employee emp);
	
	int updateEmployee(Employee emp);
	
	int deleteEmployee(int empid);
	
	List<Employee> getAllEmployee();
	
	Employee getById(int empid);
	
	void calculateNetPay(Employee emp);
}
