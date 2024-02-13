package dev.kilima.springmybatis.empl.exceptions;

public class IdNotAvailableException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public IdNotAvailableException() {
		super("The Employee Id Already exists .....");
	}
	

}
