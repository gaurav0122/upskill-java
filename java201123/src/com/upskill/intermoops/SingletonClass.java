package com.upskill.intermoops;

public class SingletonClass {
	
	String s ;
	
	private static SingletonClass instance;
	
	private SingletonClass() {
		this.s = "This is singleton class";
	}
	
	public static SingletonClass getInstance() {
		if(instance==null) {
			instance = new SingletonClass();
		}
		return  instance;
	}
}

