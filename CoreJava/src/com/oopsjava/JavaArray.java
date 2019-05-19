package com.oopsjava;

public class JavaArray {

	
	public static void main(String[] args) {
		
		String u="Saif";
		String t="Salman";
		System.out.println(u.compareTo(t));
		
		String s[] = new String[2];							//Array declaration
		s[0]="Saif";
		s[1]="salman";
		
		
		for(String temp:s) {								//Enchanced for loop
		System.out.println(temp);
		}
		
	}
}
