package com.oops.java.encapsulation;

public class Child {
	
	public static void main(String[] args) {
		System.out.println("Trying to access Name and Amount");
		
		Encapsulation childObject = new Encapsulation();
		childObject.setAmount(10000);
		childObject.setname("Mohammed Saif");
		System.out.println(childObject.getName());
		System.out.println(childObject.getAmount());
		
	}
}
