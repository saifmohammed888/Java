package com.core.java;

public class TypeCasting {

	
	public static void main(String args[])
	{
		float f = 10;			//implicit type casting the data type of variable 10 is incremented to float
		System.out.println(f);
		
		double a = 10.0;		//explicit type conversion the user himself narrows the size of the variable from double to int explicitly	
		int b = (int)a;
		System.out.println(b);
		
		char c='a';				//type conversion from char to integer
		int s = (int)c;
		System.out.println(s);  // a is the literal assigned to c
		
	}
}
