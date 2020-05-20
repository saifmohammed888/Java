package com.oops.java;

public class Constructor {

	int bowlSpeed;
	String bowlerName;

	// Default Constructor
	Constructor() {
		super();
		System.out.println("The default constructor");
		System.out.println("The default constructor assigns default values");
	}

	// Parameterized Constructor
	Constructor(int i, String x) {
		System.out.println("The paremeterized constructor");
		bowlSpeed = i;
		bowlerName = x;
		System.out.println("The paremeterized constructor assigns parsed values");
	}

	public static void main(String[] args) {

		Constructor constObject1 = new Constructor();
		Constructor constObject2 = new Constructor(100, "Mohammed Saif");

		// Calling the default constructor
		System.out.println("Bowler Name:" + constObject1.bowlerName);
		System.out.println("Bowler speed:" + constObject1.bowlSpeed);

		// Calling the parameterized constructor
		System.out.println("Bowler Name:" + constObject2.bowlerName);
		System.out.println("Bowler speed:" + constObject2.bowlSpeed);
	}
}