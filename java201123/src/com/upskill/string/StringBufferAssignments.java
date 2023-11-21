package com.upskill.string;

public class StringBufferAssignments {
	
	public static void main(String[] args) {
		String s1 = "StringBuffer ";
		String s2 = "is a peer class of String ";
		String s3 = "That provides much of ";
		String s4 = "the functionality of Strings";
		
		StringBuffer sb = new StringBuffer();
		sb.append(s1).append(s2).append(s3).append(s4);
		
		System.out.println("append method \n"+ sb);
		
		
		StringBuffer sb1 = new StringBuffer("It is used to _ at the specified index position");
		sb1.insert(14, "insert text");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("This method returns the reversed object on which it has called");
		sb2.reverse();
		System.out.println(sb2);
		
		
		
	}
}
