package com.core.java;

public class Methods {

	// Method to add two numbers - Implementation
	public Integer addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Calling other methods");

		Methods addObject = new Methods();

		// Method calling
		int resultSum = addObject.addNumbers(10, 15);

		System.out.println("Result of Sum " + resultSum);
	}
}
