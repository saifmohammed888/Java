package com.skilling.java.core;

public class ConditionalStatements {

	public static void main(String[] args) {
		ifStatement();
		ifElseStatement();
		switchStatement();
	}

	public static void ifStatement() {
		if(true) {
			System.out.println("If Condition Works");
		}
	}
	
	public static void ifElseStatement() {

			System.out.println("If Condition failed hence else Executed");	
	}

	public static void switchStatement() {
		
		int i = 2;
		
		switch(i) {
			case 1: System.out.println("Case 1 Executed");
			break;
			case 2: System.out.println("Case 2 Executed");
			break;
			case 3: System.out.println("Case 3 Executed");
			break;
			default:System.out.println("Default Case Executed");
			break;
		}
	}
}
