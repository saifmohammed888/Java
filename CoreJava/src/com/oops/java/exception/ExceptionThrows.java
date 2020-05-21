package com.oops.java.exception;

public class ExceptionThrows{

	//Throw keyword
	public static void main(String[] args) {
		
		ExceptionThrows throwsObject = new ExceptionThrows();
		throwsObject.Throws();
		
		int age=15;
		if(age<18) {
			throw new ArithmeticException("Invalid Age");
		}	
	}
	
	public void Throws() throws IndexOutOfBoundsException{
	
		System.out.println(2/0);
	}
}
