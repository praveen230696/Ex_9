package org.kiot.invalidamountexception;

/**
 *	InvalidAmountException class handle the exception
 *	@version 04/03/2022
 *  @author praveen kandhan
 */

public class InvalidAmountException extends Exception{
	String errorMessage;
	public InvalidAmountException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	
}
