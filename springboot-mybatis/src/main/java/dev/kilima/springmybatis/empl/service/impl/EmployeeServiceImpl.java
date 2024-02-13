package dev.kilima.springmybatis.empl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kilima.springmybatis.empl.beans.Employee;
import dev.kilima.springmybatis.empl.dao.EmployeeDao;
import dev.kilima.springmybatis.empl.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao dao;

	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}
	
}
