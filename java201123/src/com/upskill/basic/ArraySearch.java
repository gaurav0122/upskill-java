package com.upskill.basic;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {

		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Please enter the number!!");
			int num = sc.nextInt();
			boolean search = false;
			for (int n : arr) {
				if (n == num) {
					search = true;
					break;
				}
			}
			if (search) {
				System.out.println("Number found!!!");
			} else {
				System.out.println("Number not found!!!");
			}
		} catch (Exception e) {
			System.out.println("Some error occured !!");
		} finally {
			sc.close();
		}
	}
}
