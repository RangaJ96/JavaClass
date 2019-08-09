package com.javaclass.bank.serviceImpl;

import com.javaclass.bank.service.BankServices;

public class BankServiceImpl implements BankServices {

	@Override
	public double checkBalance() {
		Double currentBalnce=20000.50;
		return currentBalnce;
	}

	@Override
	public String depositeMoney(double amount) {
		String returnMessage="ATM cash Deposite Rs. "+amount+" to A/C No 123xxxxxxxxxx";
		return returnMessage;
	}

	@Override
	public String withdrawMoney(double amount) {
		String returnMessage="ATM cash Withdrawal Rs. "+amount+" from A/C No 123xxxxxxxxxx";
		return returnMessage;
	}

	@Override
	public String changePin(int pinNumber) {
		String returnMessage="Your pin number is updated successfully";
		return returnMessage;
	}

	

}
