package dev.kilima.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kilima.employee.beans.Employee;
import dev.kilima.employee.dao.EmployeeDao;
import dev.kilima.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.insert(emp);
	}

	@Override
	public List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		return dao.getEmpList();
	}

	@Override
	public Employee getById(int empid) {
		// TODO Auto-generated method stub
		return dao.getById(empid);
	}

	@Override
	public int updateEmployee(Employee empl) {
		// TODO Auto-generated method stub
		return dao.update(empl);
	}

	@Override
	public int deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.delete(empid);
	}

}
