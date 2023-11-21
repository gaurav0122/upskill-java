package com.upskill.basic;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Please Enter your CTC");
			int CTC = sc.nextInt();
			if(CTC <0) {
				System.out.println("Please ENter valid CTC");
				return;
			}
			if(CTC <=180000 ) {
				System.out.println("Slab A- Tax Nil");
			}else if(CTC <=300000) {
				System.out.println("Slab B- 10% Tax");
				System.out.println("Tax Amount = "+ (CTC *0.1));
			}else if(CTC <=500000) {
				System.out.println("Slab C- 20% Tax");
				System.out.println("Tax Amount = "+ (CTC *0.2));
			}else if(CTC <=1000000){
				System.out.println("slab D- 30% Tax");
				System.out.println("Tax Amount = "+ (CTC *0.3));
			}else {
				System.out.println("please provide valid CTC");
			}
			
			
		}catch(Exception e) {
			System.out.println("Error Occured");
			
		}finally {
			sc.close();
		}
		
	}
}
