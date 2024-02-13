package dev.kilima.springmybatis.empl.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kilima.springmybatis.empl.beans.Employee;
import dev.kilima.springmybatis.empl.service.EmployeeService;

@RestController
@RequestMapping("/empl")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
		String mesg;
		int rows = service.addEmployee(emp);
		if (rows > 0)
			mesg = "inserted";
		else
			mesg = "not-inserted";
		return new ResponseEntity<String>(mesg, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee emp) {
		String mesg;
		int rows = service.updateEmployee(emp);
		if (rows > 0)
			mesg = "updated";
		else
			mesg = "not-updated";
		return new ResponseEntity<String>(mesg, HttpStatus.OK);

	}

	@DeleteMapping("/{empid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int empid) {
		String mesg;
		int rows = service.deleteEmployee(empid);
		if (rows > 0)
			mesg = "deleted";
		else
			mesg = "not-deleted";
		return new ResponseEntity<String>(mesg, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> allEmp = service.getAllEmployee();
		return new ResponseEntity<List<Employee>>(allEmp, HttpStatus.OK);
	}

	@GetMapping("/{empid}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int empid) {
		Employee empl = service.getById(empid);
		return new ResponseEntity<Employee>(empl, HttpStatus.OK);
	}
}
