package dev.kilima.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kilima.employee.beans.Employee;
import dev.kilima.employee.service.EmployeeService;

@RestController
@RequestMapping("/empl")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping
	public String addEmployee(@RequestBody Employee emp) {
		int rows = service.addEmployee(emp);
		if (rows > 0)
			return "inserted";
		else
			return "not-inserted";
	}

	@GetMapping
	public List<Employee> getEmpList() {
		return service.getEmpList();
	}

	@GetMapping("/{empid}")
	public Employee getById(@PathVariable int empid) {
		Employee emp = service.getById(empid);
		return emp;
	}

	@PutMapping("/{empid}")
	public String updateEmployee(@RequestBody Employee empl, @PathVariable int empid) {
		empl.setEmpid(empid);
		int rows = service.updateEmployee(empl);
		if (rows > 0)
			return "updated";
		else
			return "not-updated";
	}
	
	@DeleteMapping("/{empid}")
	public String deleteEmployee(@PathVariable int empid) {
		int rows = service.deleteEmployee(empid);
		if (rows > 0)
			return "deleted";
		else
			return "not-deleted";
	}
}
