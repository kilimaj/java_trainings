package dev.kilima.employee.dao;

import java.util.List;

import dev.kilima.employee.beans.Employee;

public interface EmployeeDao {

	int insert(Employee empl);
	List<Employee> getEmpList();
	Employee getById(int empid);
	int update(Employee empl);
	int delete(int empid);
}
