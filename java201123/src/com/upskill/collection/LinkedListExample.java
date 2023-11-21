package com.upskill.collection;

import java.time.LocalDate;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedList<LocalDate> list = new LinkedList<>();
		list.add(LocalDate.of(2002, 12, 1));
		list.add(LocalDate.of(2004, 12, 1));
		list.add(LocalDate.of(2000, 12, 1));
		list.add(LocalDate.of(2014, 12, 1));
		list.add(LocalDate.of(2017, 12, 1));
		list.add( LocalDate.of(2020, 12, 1));
		list.add( LocalDate.of(2012, 12, 1));
		list.add( LocalDate.of(2017, 12, 1));
		list.add( LocalDate.of(2032, 12, 1));
		list.add( LocalDate.of(2008, 12, 1));
		list.add( LocalDate.of(2009, 12, 1));
		
		for(LocalDate localDate :list) {
			System.out.println("Your LocalDate of birth is "+localDate+ " and it " +checkleap(localDate)+" year");
		}
		
	}

	private static String checkleap(LocalDate date) {
		return date.isLeapYear()?"was":"was not";
	}
}
