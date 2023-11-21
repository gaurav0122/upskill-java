package com.upskill.exception;

import java.util.Scanner;

public class ExceptionBank {
	
	public static void main(String[] args) {
		SavingAccount account = new SavingAccount(1, 100);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter amount to add");
			double amount = sc.nextDouble();
			System.out.println(account.deposit(amount));
			
			System.out.println("Enter amount to withdraw");
			amount = sc.nextDouble();
			System.out.println(account.withdraw(amount));
			
			System.out.println("Enter amount to withdraw");
			amount = sc.nextDouble();
			System.out.println(account.withdraw(amount));
			
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getLocalizedMessage());
		}catch (IllegalBankTransactionException e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			sc.close();
		}
	}
	
}

class SavingAccount{
	
	long id;
	
	double balance;
	
	SavingAccount(int id, double balance){
		 this.balance += balance;
	}
	
	double withdraw(double amount) throws  IllegalBankTransactionException {
		if(amount>balance) {
			throw new InsufficientBalanceException("Your bank balance is less than the withdraw amount");
		}
		if(amount <0) {
			throw new IllegalBankTransactionException("You cant withdraw negative value");
		}
		this.balance -=amount;
		return balance;
	}
	
	double deposit(double amount) {
		this.balance+=amount;
		return balance;
	}
	
}


class InsufficientBalanceException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	InsufficientBalanceException(String message){
		super(message);
	}
}

class IllegalBankTransactionException extends Exception{
	

	private static final long serialVersionUID = 1L;

	IllegalBankTransactionException(String message){
		super(message);
	}
}








