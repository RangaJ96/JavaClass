package com.javaclass.bank.service;

public interface BankServices {
	public abstract double checkBalance();
	public abstract String depositeMoney(double amount);
	public abstract String withdrawMoney(double amount);
	public abstract String changePin(int pinNumber);
	
}
