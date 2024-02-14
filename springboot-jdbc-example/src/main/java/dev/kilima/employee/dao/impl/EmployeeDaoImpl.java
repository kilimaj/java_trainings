package dev.kilima.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dev.kilima.employee.beans.Employee;
import dev.kilima.employee.dao.EmployeeDao;
import dev.kilima.employee.utils.exceptions.EmployeeIdAlreadyExistsException;
import dev.kilima.employee.utils.queries.EmployeeDBQueries;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate template;

	@Override
	public int insert(Employee emp) {
		/* To check for employee id existence in the database before insertion */
		String checkforId = "select count(*) from employee where empid=?";
		int  count = template.queryForObject(checkforId, Integer.class, emp.getEmpid());
		if(count>0)
			throw new EmployeeIdAlreadyExistsException();
		Object args[] = {emp.getEmpid(), emp.getEmpname(), emp.getSalary(), emp.getDoj()};
		int rows = template.update(EmployeeDBQueries.insert, args);
		return rows;
	}

	@Override
	public List<Employee> getEmpList() {
		List<Employee> emplist = template.query(EmployeeDBQueries.getall, 
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return emplist;
	}

	@Override
	public Employee getById(int empid) {
		Employee emp = template.queryForObject(EmployeeDBQueries.getById, 
				new BeanPropertyRowMapper<Employee>(Employee.class), empid);
		return emp;
	}

	@Override
	public int update(Employee empl) {
		Object args[] = {empl.getEmpname(), empl.getSalary(), empl.getDoj(), empl.getEmpid()};
		int rows = template.update(EmployeeDBQueries.update, args);
		return rows;
	}

	@Override
	public int delete(int empid) {
		int rows = template.update(EmployeeDBQueries.delete, empid);
		return rows;
	}
	
	
}
