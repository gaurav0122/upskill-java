package com.upskill.basic;

import java.util.Scanner;

public class CalculateResult {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of three Subjets");
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		if(first>100|| second>100||third>100 || first<0||second<0||third<0) {
			System.out.println("Please enter the valid marks");
		}else {
			if(first>60 && second >60 && third >60) {
				System.out.println("Passed");
			}else if((first>60 &&  second>60 ) || (first>60 &&  third>60 )|| (second>60 &&  third>60 )) {
				System.out.println("Promoted");
			}else {
				System.out.println("failed");
			}
		}
		sc.close();
		
	}
}
