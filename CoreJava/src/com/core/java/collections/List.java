package com.core.java.collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		//String List
		ArrayList<String> list1= new ArrayList<String>();
		
		list1.add("Saif");
		list1.add("Salman");
		list1.add("Suhaib");
		list1.add("Zoya");
		list1.add("Saif");
		
		System.out.println("List 1"+list1);
		
		//Generic List
		ArrayList list2= new ArrayList();
		list2.add("Mohammed Saif");
		list2.add(23);
		list2.add(34000.40);
		
		
		list2.set(2,"Lowes");
		
		System.out.println("List 2"+list2);
		
		//Get list items
		System.out.println(list1.get(2));
		System.out.println(list2.get(2));
		
		if(list1.contains("Saif")) {
			System.out.println("Saif is part of the first list");
		}
		
		//For each loop
		for(String temp:list1) {
			System.out.println(temp);
		}
	}
}
