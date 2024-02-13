package dev.kilima.springmybatis.empl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kilima.springmybatis.empl.beans.Employee;
import dev.kilima.springmybatis.empl.dao.EmployeeDao;
import dev.kilima.springmybatis.empl.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public Employee getById(int empid) {
		// TODO Auto-generated method stub
		return dao.getById(empid);
	}

}
