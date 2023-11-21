package com.upskill.basic;

import java.util.Scanner;

public class SimpleCompoundInterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int principle;
		double intrestRate;
		double timeYears;
		
		
		try {
			System.out.println("Enter the principle amount");
			principle = sc.nextInt();
			
			System.out.println("Enter the Interest rate");
			intrestRate = sc.nextDouble();
			
			System.out.println("Enter the Time in the Years");
			timeYears = sc.nextDouble();
			
			System.out.println("---- Simple Intrest -----");
			double simpleIntrest = (principle * intrestRate * timeYears)/100;
			System.out.println(simpleIntrest);
			
			System.out.println("\n---- Compound Intrest -----");
			double compoundIntrest = principle * (Math.pow((1+(intrestRate/100)), timeYears)-1);
			System.out.println(compoundIntrest);
			
			
			
		}catch(Exception e) {
			System.out.println("Error occured"+e.getMessage());
		}
		
		sc.close();
	}
}
