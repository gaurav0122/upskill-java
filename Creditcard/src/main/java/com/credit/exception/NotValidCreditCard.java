package com.credit.exception;


public class NotValidCreditCard extends RuntimeException{
	

	private static final long serialVersionUID = 1L;
	
	String message;
	public NotValidCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotValidCreditCard(String message) {
		super(message);
		this.message=message;
	}
	
}
