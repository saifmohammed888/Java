package com.skilling.java.core;

public class LoopingStatements {

	public static void main(String[] args) {
		whileLoop();
		doWhileLoop();
		forLoop();
		enhancedForLoop();
	}

	public static void whileLoop() {

		System.out.println("Entered while loop");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

	}

	public static void doWhileLoop() {

		System.out.println("Entered Do While loop");
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 3);
	}

	public static void forLoop() {

		for (int i = 0; i < 2; i++) {
			System.out.println("Working on for loop");
		}
	}

	public static void enhancedForLoop() {
		
		String[] family = {"Salman","Saif","Suhaib","Zoya"};
		
		for(String familyMembers: family) {
			System.out.println("Family Member: "+familyMembers);
		}
	}
}
