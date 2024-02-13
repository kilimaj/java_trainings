package dev.kilima.springmybatis.empl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kilima.springmybatis.empl.beans.Employee;
import dev.kilima.springmybatis.empl.dao.EmployeeDao;
import dev.kilima.springmybatis.empl.exceptions.EmployeeNotFoundException;
import dev.kilima.springmybatis.empl.exceptions.IdNotAvailableException;
import dev.kilima.springmybatis.empl.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Employee exists = dao.getById(emp.getEmpid());
		if(exists != null)
			throw new IdNotAvailableException();
		calculateNetPay(emp);
		return dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		calculateNetPay(emp);
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
		Employee emp = dao.getById(empid);
		if(emp == null)
			throw new EmployeeNotFoundException("This employee does not exist");
		return emp;
	}

	@Override
	public void calculateNetPay(Employee emp) {
		// TODO Auto-generated method stub
		
		double ctc = emp.getSalary()*12;
		
		emp.setCtc(ctc);
		
		double gross = ctc - 500000;
		
		if (ctc <= 500000)
			emp.setNetpay(ctc);
		else if (gross <= 100000)
			emp.setNetpay(gross - (gross*0.05));
		else if (gross <= 200000)
			emp.setNetpay(gross - (gross*0.1));
		else
			emp.setNetpay(gross - (gross*0.2));
			
		
	}
	
	
}
