package dev.kilima.employee.utils.exceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandling {

	@ExceptionHandler(value = EmployeeIdAlreadyExistsException.class)
	public String exception(EmployeeIdAlreadyExistsException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public ResponseEntity<String> exception(EmptyResultDataAccessException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}
