package com.upskill;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check");
		
		try {
			int n = sc.nextInt();
			int tempNumber = n;
			int check = 0;

			int count = 0;
			while (n > 0) {
				count++;
				n /= 10;
			}
			n = tempNumber;
			while (n > 0) {
				int x = n % 10;
				check += power(x, count);
				n /= 10;
			}
			if (check == tempNumber) {
				System.out.println("Number is armstrong");
			} else {
				System.out.println("Number is not armstrong");
			}
		}catch(Exception e) {
			System.out.println("Error occured!");
		}finally {
			sc.close();
		}
		

	}

	private static int power(int x, int pow) {
		int ret = 1;
		while (pow-- > 0) {
			ret = ret * x;
		}
		return ret;
	}
}
