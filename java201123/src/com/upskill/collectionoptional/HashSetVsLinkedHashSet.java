package com.upskill.collectionoptional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetVsLinkedHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hashset= new HashSet<>();
		LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
		
		hashset.addAll(Arrays.asList(1,1,4,9,5,5,15,76,44,36,52,9));
		
		linkedHashSet.addAll(Arrays.asList(1,1,4,9,5,5,15,76,44,36,52,9));
		System.out.println("---- Printing Hashset -Unordered and unSorted -----");
		for(int n:hashset) {
			System.out.print(n+" ");
		}
		
		System.out.println("\n\n---- Printing LinkedHashset - ordered and unSorted -----");
		for(int n:linkedHashSet) {
			System.out.print(n+" ");
		}
	}
	
	
}
