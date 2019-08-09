package com.javaclass.bank.application;

import com.javaclass.bank.serviceImpl.BankServiceImpl;

public class BankApplication {

	private double currentBalnce;
	
	public static void main(String[] args){
		
		BankApplication application=new BankApplication();
		BankServiceImpl bankservice=new BankServiceImpl();
		
		application.currentBalnce=bankservice.checkBalance();
		System.out.println("Your current account balane is : "+application.currentBalnce+" LKR");
		System.out.println(bankservice.depositeMoney(20000));
		System.out.println(bankservice.depositeMoney(45000));
		System.out.println(bankservice.changePin(1234));
	}
}
