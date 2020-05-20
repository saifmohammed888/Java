package com.oops.java.abstraction;

public class Child extends DataAbstraction{

	@Override
	public void Display() {
		System.out.println("Giving Implementation to Display abstract class");
	}

	@Override
	public void WriteData() {
		System.out.println("Giving Implementation to Write Data abstract class");
	}
	
}