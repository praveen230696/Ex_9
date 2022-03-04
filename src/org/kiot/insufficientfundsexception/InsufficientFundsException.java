package org.kiot.insufficientfundsexception;

/**
 *	InsufficientFundsException class handle the exception
 *	@version 04/03/2022
 *  @author praveen kandhan
 */

public class InsufficientFundsException extends Exception{
	String errorMessage;

	public InsufficientFundsException(String errorMessage) {
		
		super();
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	
}
