package com.oops.java.encapsulation;

public class Encapsulation {

	private double amount;
	private String name;
	
	public double getAmount() 
	{
		return amount;
	}
	
	public void setAmount(double d) 
	{
		this.amount=d;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setname(String s) 
	{
		this.name=s;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Encapsulated Data using private variables");
	}
}
