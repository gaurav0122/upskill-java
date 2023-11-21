package com.upskill.string;

public class StringBuilderAssignments {

	public static void main(String[] args) {
		String s1 = "StringBuilder ";
		String s2 = "is a peer class of String ";
		String s3 = "That provides much of ";
		String s4 = "the functionality of Strings";
		
		StringBuilder sb = new StringBuilder();
		sb.append(s1).append(s2).append(s3).append(s4);
		
		System.out.println("append method \n"+ sb);
		
		
		StringBuilder sb1 = new StringBuilder("It is used to _ at the specified index position");
		sb1.insert(14, "insert text");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("This method returns the reversed object on which it has called");
		sb2.reverse();
		System.out.println(sb2);
		
	}
}
