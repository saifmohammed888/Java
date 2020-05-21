package com.oops.java;

	//Class
public class MemberFunctions {													
	
	//Data Member
	static int topSpeed;											
	static String name ;
	
	//Main method
	public static void main(String[] args) {						
		
		//Object
		MemberFunctions c = new MemberFunctions();											
		c.insertValue(100,"Verna");
		c.showvalue();
		
	}
		
	//Member function
	void insertValue(int speed,String Name)							
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
