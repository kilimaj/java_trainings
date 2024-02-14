package dev.kilima.employee.utils.exceptions;

public class EmployeeIdAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeIdAlreadyExistsException() {
		super("emp ID is already available ... try another one ....");
	}

}
