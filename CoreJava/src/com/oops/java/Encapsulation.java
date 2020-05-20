package com.oops.java;

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
		
		Encapsulation e=new Encapsulation();
		e.setAmount(1000000);
		System.out.println(e.getAmount());
		e.setname("Mohammed Saif");
		System.out.println(e.getName());
	}
}
