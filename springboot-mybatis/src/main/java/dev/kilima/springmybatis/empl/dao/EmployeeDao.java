package dev.kilima.springmybatis.empl.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import dev.kilima.springmybatis.empl.beans.Employee;

@Mapper
public interface EmployeeDao {

	@Insert("insert into employee values (#{empid},#{empname}, #{salary}, #{doj})")
	int addEmployee(Employee emp);
}
