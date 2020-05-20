package com.core.java;

public class TypeCasting {

	
	public static void main(String args[])
	{
		float f = 10;	//implicit value or data type of f is explicitly changed to that of float from integer.
		System.out.println(f);
		
		double a = 10.0;	//explicit type conversion the user himself narrows the size of the variable from double to int explicitly	
		int b = (int)a;
		System.out.println(b);
		
		String s = "32";		
		
		System.out.println("Value as String "+s);
		System.out.println("Value as Int "+Integer.parseInt(s));	//Method for explicit conversion of String type to int type
		
	}
}
