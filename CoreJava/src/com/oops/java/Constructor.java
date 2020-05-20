package com.oops.java;

public class Constructor {

	int bowlSpeed;
	String bowlerName;
	
	Constructor(){														//Default constructor calling the super method
		super();
	System.out.println("The default constructor");
				 }
	
	Constructor(int i,String x){										//Default constructor calling the super method
		bowlSpeed = i;
		bowlerName = x;
		System.out.println("The default constructor assigns default values");
	 }

	
	
	public static void main(String[] args) {
		Constructor c =new Constructor();
		Constructor c1 = new Constructor(100,"Mohammed Saif");
		System.out.println("Bowler Name:"+c.bowlerName);			//Calling the default constructor
		System.out.println("Bowler speed:"+c.bowlSpeed);
		
		System.out.println("Bowler Name:"+c1.bowlerName);			//Calling the parameterized constructor
		System.out.println("Bowler Name:"+c1.bowlSpeed);			//we can see constructor overloading based on parameters
	}
	
}
