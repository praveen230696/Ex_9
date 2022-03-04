package org.kiot.bank;

/**
 *	Bank class retrieves account holder details
 *	@version 04/03/2022
 *  @author praveen kandhan
 */

public class Bank {
	private long accountNumber, initialBalance, amounttoDeposit, 
		amounttoWithdraw;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(long accountNumber, long initialBalance, long amounttoDeposit, 
			long amounttoWithdraw) {
		super();
		this.accountNumber = accountNumber;
		this.initialBalance = initialBalance;
		this.amounttoDeposit = amounttoDeposit;
		this.amounttoWithdraw = amounttoWithdraw;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(long initialBalance) {
		this.initialBalance = initialBalance;
	}

	public long getAmounttoDeposit() {
		return amounttoDeposit;
	}

	public void setAmounttoDeposit(long amounttoDeposit) {
		this.amounttoDeposit = amounttoDeposit;
	}

	public long getAmounttoWithdraw() {
		return amounttoWithdraw;
	}

	public void setAmounttoWithdraw(long amounttoWithdraw) {
		this.amounttoWithdraw = amounttoWithdraw;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountNumber ^ 
				(accountNumber >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ","
				+ " initialBalance=" + initialBalance + ", amounttoDeposit="
				+ amounttoDeposit + ", amounttoWithdraw=" + amounttoWithdraw 
				+ "]";
	}	
}
