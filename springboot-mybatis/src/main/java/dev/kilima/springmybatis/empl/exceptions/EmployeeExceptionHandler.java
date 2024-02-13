package dev.kilima.springmybatis.empl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler(value = IdNotAvailableException.class)
	public String exception(IdNotAvailableException ex) {
		return ex.getMessage();
	}

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<String> exception2(EmployeeNotFoundException ex) {
		System.out.println(ex.getMessage());
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}
