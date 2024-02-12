package dev.kilima.mybatis.entities;

public class Employee {

	private int empid;
	private String empname;
	private Double salary;
	private String doj;

	public Employee(int empid, String empname, Double salary, String doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.doj = doj;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

}
