package com.core.java.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		Sets object = new Sets();
		object.Hash();
		object.TreeSet();
	}
	
	public void Hash() {
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Mohammed Saif");
		set1.add("Mohammed Salman");
		set1.add("Mohammed Suhaib");
		set1.add("Mohammed Suhaib");
		set1.add("Zoya Afreen");
		System.out.println("HashSet "+set1);
	}

	public void TreeSet() {
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Mohammed Saif");
		set1.add("Mohammed Salman");
		set1.add("Mohammed Suhaib");
		set1.add("Mohammed Suhaib");
		set1.add("Zoya Afreen");
		System.out.println("Tree Set"+set1);
	}
}
