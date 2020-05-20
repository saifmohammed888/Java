package com.oops.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;



public class Collections {

	
	
	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<String>();							//Collection
		c.add("Saif");
		c.add("Salman");
	
		for(Object temp:c)
		System.out.println(temp);
		
		ArrayList<String> L = new ArrayList<String>();
		L.add("saif");
		L.add("Jubail");

		for(Object temp:L)
		System.out.println(temp);

		LinkedList<Object> l =new LinkedList<Object>();							//Linked List
		l.add("saif");
		l.add(1996);
		l.add("Bangalore");
		//for(Object s:l)
		System.out.println(l);
		System.out.println(l.size());
		l.remove("saif");
		l.remove(0);
		l.removeFirst();
		System.out.println(l);
		
		
	}
}
