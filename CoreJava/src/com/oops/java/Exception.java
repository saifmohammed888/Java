package com.oops.java;

public class Exception {

	Exception() {
		
		System.out.println("No Exception");
		
		try {
			System.out.println(10/0);									//Arithmatic Exception
			
		} catch (java.lang.Exception e) {
			
			System.out.println("divide by zero Exception");
		}									

		System.out.println("No Exception");
		}
	
	public static void main(String[] args) {
		
		Exception e=new Exception();
		e.getClass();
	}
}
