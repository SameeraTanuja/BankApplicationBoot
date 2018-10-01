package com.capgemini.bankapplication.service;

import com.capgemini.bankapplication.exception.InsufficientBalanceException;

public interface BankAccountService {
	public double getBalance(long accountId);
	public double withdraw(long accountId, double amount) throws InsufficientBalanceException;

	public double deposit(long accountId, double amount) throws InsufficientBalanceException;

	public boolean fundTransfer(long fromAcc, long toAcc, double amount) throws InsufficientBalanceException;

}
