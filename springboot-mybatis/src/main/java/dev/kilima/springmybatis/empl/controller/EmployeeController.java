package dev.kilima.springmybatis.empl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
}
