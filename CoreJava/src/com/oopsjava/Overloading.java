package com.oopsjava;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading o =new Overloading();
		int total = o.sum(10,20);
		int total1=o.sum(10,20,30);
		double total4 = o.sum(20.5,10);
		double total2 = o.sum(1.2, 1.2);
		System.out.println(total4);
		System.out.println(total2);
		System.out.println(total1);
		System.out.println(total);
		
	}
	
	double sum(float a,int b)									//Method1 with order of parameters
	{
		return a+b;
	}
	
	int sum(int a,int b)										//Method2 with 2 parameters
	{
		return a+b;
	}
	
	int sum(int a,int b,int c)									//Method3 with 3 parameters
	{
		return a+b+c;
	}
	
	double sum(double a,double b)								//Method4 with different type parameters
	{
		return a+b;
	}
}
