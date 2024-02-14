package dev.kilima.employee.utils.queries;

public class AddressDBQueries {
	public static String insert = "insert into address values(?,?,?,?)";
	public static String getall = "select * from address";
	public static String getByEmployeeId = "select * from address where empid=?";
	public static String getByAddressId = "select * from address where id=?";
	public static String update = "update address set street=?, city=?, empid=? where id=?";
	public static String delete = "delete from address where id=?";
}
