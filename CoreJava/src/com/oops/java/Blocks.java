package com.oops.java;

public class Blocks {

	
	static int i=10;
	static String s="Saif";
	
	
	static void first(int m){
		System.out.println("Static Method is executed first");						//static block
		System.out.println(m);
	}
	
	static {
		System.out.println("Static Block executed first");
	}
	
	public static void main(String[] args) {
	
		System.out.println("Main method is executed next`");
		first(50);
	}
	
	
}
