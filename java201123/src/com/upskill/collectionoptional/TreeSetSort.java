package com.upskill.collectionoptional;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {
	public static void main(String[] args) {
		Person p1 = new Person("gaurav", 56.7, 4.5);
		Person p2 = new Person("nihal", 60.7, 4.5);
		Person p3 = new Person("akash", 60.7, 4.9);
		Person p4 = new Person("anil", 52.7, 5.5);
		Person p5 = new Person("parmeshwar", 52.7, 5.2);
		
		Set<Person> set = new TreeSet<>(new ComparePerson());
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		for(Person p:set) {
			System.out.println(p.toString());
		}
	}
}

class ComparePerson implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.weight ==p2.weight) {
			if(p2.height<p1.height) {
				return 1;
			}
			return -1;
		}
		if(p2.weight<p1.weight) {
			return 1;
		}
		return -1;
	}
	
}

class Person{
	public String name;
	
	public double weight;
	
	public double height;
	
	Person(){	
	}

	public Person(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

	
}

