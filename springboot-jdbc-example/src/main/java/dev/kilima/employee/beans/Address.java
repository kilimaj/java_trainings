package dev.kilima.employee.beans;

public class Address {
	/*
	 * create table address id int primary key auto_increment street varchar(40),
	 * city varchar(40) empid int, foreign key(empid) references employee(empid));
	 */

	private int id;
	private String street;
	private String city;
	private int empid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

}
