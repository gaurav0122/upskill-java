package com.upskill;

import java.util.Scanner;

public class StudentMarksAndAverage {
	
	public static void main(String[] args) {
		
		//row for subject
		//col for student
		Scanner sc = new Scanner(System.in);
		int[][] marks =new int[3][3];
		
		try {
			for(int i=0;i<3;i++) {
				System.out.println("\nPlease Enter marks of "+(i+1) +" subject.");
				for(int j=0;j<3;j++) {
					System.out.println("Please Enter marks of "+(j+1)+" Student");
					marks[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Total score of stud1 = "+ (marks[0][0]+marks[1][0]+marks[2][0]));
			System.out.println("Total score of stud2 = "+ (marks[0][1]+marks[1][1]+marks[2][1]));
			System.out.println("Total score of stud3 = "+ (marks[0][2]+marks[1][2]+marks[2][2]));
			
			System.out.println("Average score of stud1 = "+ ((double)(marks[0][0]+marks[1][0]+marks[2][0])/3));
			System.out.println("Average score of stud2 = "+ ((double)(marks[0][1]+marks[1][1]+marks[2][1])/3));
			System.out.println("Average score of stud3 = "+ ((double)(marks[0][2]+marks[1][2]+marks[2][2])/3));
			
			System.out.println("Total score of sub1 = "+ (marks[0][0]+marks[0][1]+marks[0][2]));
			System.out.println("Total score of sub2 = "+ (marks[1][0]+marks[1][1]+marks[1][2]));
			System.out.println("Total score of sub3 = "+ (marks[2][0]+marks[2][1]+marks[2][2]));
			
			System.out.println("Average score of sub1 = "+ ((double)(marks[0][0]+marks[0][1]+marks[0][2])/3));
			System.out.println("Average score of sub2 = "+ ((double)(marks[1][0]+marks[1][1]+marks[1][2])/3));
			System.out.println("Average score of sub3 = "+ ((double)(marks[2][0]+marks[2][1]+marks[2][2])/3));
			
			
			
		}catch (Exception e) {
			System.out.println("Error occured !!");
		}finally {
			sc.close();
		}
	}
}
