package dev.kilima.springmybatis.empl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import dev.kilima.springmybatis.empl.beans.Employee;

@Mapper
public interface EmployeeDao {

	@Insert("insert into employee values (#{empid},#{empname}, #{salary}, #{doj}, #{ctc}, #{netpay})")
	int addEmployee(Employee emp);

	@Update("update employee set empname=#{empname}, salary=#{salary}, doj=#{doj}, #{ctc}, #{netpay} where empid=#{empid}")
	int updateEmployee(Employee emp);

	@Delete("delete from employee where empid=#{empid}")
	int deleteEmployee(int empid);

	@Select("select * from employee")
	List<Employee> getAllEmployee();

	@Select("select * from employee where empid=#{empid}")
	Employee getById(int empid);

}
