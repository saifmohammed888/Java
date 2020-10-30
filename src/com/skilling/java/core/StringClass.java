package com.skilling.java.core;

import java.util.*;

public class StringClass {
	
	public static void main(String[] args) {
		
		StringClass obj = new StringClass();
		obj.StringBuffer();
		obj.StringBuilder();
		obj.StringTokenizer();
		obj.StringJoiner();
		
	}

	private void StringJoiner() {
		
		System.out.println("\nString Joiner");
		ArrayList<String> list = new ArrayList<>();
		list.add("Saif");
		list.add("Salman");
		list.add("Suhaib");

		StringJoiner sj1 = new StringJoiner(",","","");
		sj1.add(list.get(0)).add(list.get(1));
		StringJoiner sj2 = new StringJoiner(",","","");
		sj1.add(list.get(2));
		
		sj1.merge(sj2);
		
		System.out.println(sj1);	 
	}

	private void StringTokenizer() {
		
		String sentence ="I am Learning String tokenizer";
		StringTokenizer token = new StringTokenizer(sentence," ",false);
		System.out.println("\nString tokenizer");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

	private void StringBuilder() {
		
		StringBuilder string = new StringBuilder();
		string.append("Using String Builder Name is Mohammed Saif");
		System.out.println(string);
	}

	private void StringBuffer() {
		StringBuffer string = new StringBuffer("Mohammed Saif");
		System.out.println(string);
		System.out.println("Length of string: "+string.length());
		string.append(" M");
		System.out.println("Appended String "+string);
	}
}
