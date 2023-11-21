package com.upskill.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class TenUniqueElements {
	
	public static void main(String[] args) {
		usinghashset();
		usingArrayList();
	}
	
	private static void usingArrayList() {
		ArrayList<String> list = new ArrayList<>();
		if(!list.contains("a"))
			list.add("a");
		if(!list.contains("b"))
			list.add("b");
		if(!list.contains("c"))
			list.add("c");
		if(!list.contains("a"))
			list.add("a");
		if(!list.contains("b"))
			list.add("b");
		if(!list.contains("d"))
			list.add("d");
		if(!list.contains("e"))
			list.add("e");
		if(!list.contains("f"))
			list.add("f");
		if(!list.contains("i"))
			list.add("i");
		if(!list.contains("j"))
			list.add("j");
		if(!list.contains("e"))
			list.add("e");
		if(!list.contains("r"))
			list.add("r");
		if(!list.contains("z"))
			list.add("z");
		
		System.out.println("\nusing arraylist - ordered");
		System.out.println(list.toString());
	}

	private static void usinghashset() {
		
		HashSet<String> hashset = new HashSet<>();
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		hashset.add("a");
		hashset.add("b");
		hashset.add("d");
		hashset.add("e");
		hashset.add("f");
		hashset.add("i");
		hashset.add("j");
		hashset.add("e");
		hashset.add("r");
		hashset.add("z");
		System.out.println("using hashset - unordered");
		System.out.println(hashset.toString());
	}
}
