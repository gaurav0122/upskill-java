package com.upskill.intermoops;

public class SingletonClassCheck {
	
	public static void main(String[] args) {
		
//		SingletonClass s = new SingletonClass();
		
		SingletonClass instance1 = SingletonClass.getInstance();
		
		SingletonClass instance2 = SingletonClass.getInstance();
		
		System.out.println(instance1.equals(instance2));
	}
}
