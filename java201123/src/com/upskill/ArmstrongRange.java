package com.upskill;

public class ArmstrongRange {
	public static void main(String[] args) {
		System.out.println("armstrong number between 100-999");
		
		for(int i=1;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
					if((i*i*i)+(j*j*j)+(k*k*k) == i*100+j*10+k) {
						System.out.println(i*100+j*10+k);
					}
					
				}
			}
		}
	}
}
