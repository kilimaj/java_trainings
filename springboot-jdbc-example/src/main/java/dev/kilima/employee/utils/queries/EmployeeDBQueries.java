package dev.kilima.employee.utils.queries;

public class EmployeeDBQueries {

	public static String insert = "insert into employee values(?,?,?,?)";
	public static String getall = "select * from employee";
	public static String getById = "select * from employee where empid=?";
	public static String update = "update employee set empname=?, salary=?, doj=? where empid=?";
	public static String delete = "delete from employee where empid=?";

}
