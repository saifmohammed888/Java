package com.oops.java;

public class MemberFunctions {													//Class
	
	static int topSpeed;											//Data Member
	static String name ;
	
	public static void main(String[] args) {						//Main method
		
		MemberFunctions c = new MemberFunctions();											//Object
		c.insertValue(100,"Verna");
		c.showvalue();
		
	}
		
	void insertValue(int speed,String Name)							//Member function
	{
		topSpeed =speed;
		name=Name;
		
	}
	
	void showvalue()
	{
		System.out.println("Speed "+topSpeed);
		System.out.println("Name "+name);
		
	}
}
