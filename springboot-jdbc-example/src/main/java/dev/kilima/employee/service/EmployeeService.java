package dev.kilima.employee.service;

import java.util.List;

import dev.kilima.employee.beans.Employee;

public interface EmployeeService {

	int addEmployee(Employee emp);
	List<Employee> getEmpList();
	Employee getById(int empid);
	int updateEmployee(Employee empl);
	int deleteEmployee(int empid);
}
