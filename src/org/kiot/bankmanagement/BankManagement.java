package org.kiot.bankmanagement;

import org.kiot.bank.Bank;
import org.kiot.invalidamountexception.InvalidAmountException;
import org.kiot.insufficientfundsexception.InsufficientFundsException;

/**
 *	BankManagement class retrieves account holder details
 *	@version 04/03/2022
 *  @author praveen kandhan
 */

public class BankManagement {

	public static void main(String[] args) throws InsufficientFundsException,
		InvalidAmountException {
		// TODO Auto-generated method stub
		Bank bank = new Bank(123, 1000, 200, 5000);		
		try {
			if(bank.getAmounttoWithdraw() > bank.getInitialBalance())  {
				throw new InsufficientFundsException("Insufficient Fund");
			} else {
				System.out.println("Amount withdrwan successfully");
			}
		} catch (InsufficientFundsException e) {
			// TODO: handle exception
			System.out.println(e.getErrorMessage());
		}

		try {
			if(bank.getAmounttoDeposit() < 500) {
				throw new InvalidAmountException("Please enter amount in "
						+ "500 or 2000");
			} else {
				System.out.println("Amount deposited successfully");
			}
			if(bank.getAmounttoWithdraw() > bank.getInitialBalance()) {
				throw new InvalidAmountException("Insufficient Fund");
			} else {
				System.out.println("Amount withdrwan successfully");
			}
		} catch (InvalidAmountException e) {
			// TODO: handle exception
			System.out.println(e.getErrorMessage());
			}
	}
}
