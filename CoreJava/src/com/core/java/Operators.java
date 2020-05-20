package com.core.java;

public class Operators {
	
	public static void main(String[] args) {
		
		System.out.println("sum: "+10+5); 			//Arithmetic operators
		System.out.println("dif: "+(10-5)); 
		System.out.println("pro: "+10*5); 
		System.out.println("quo: "+10/5); 
		System.out.println("mod: "+10%5); 
		
		int a=10;
		System.out.println(++a);					//unary ++
		System.out.println(--a);					//unary --
		
		int x=100;
		System.out.println("Assigned Value"+x); 						//Simple Assignment operator =
		int t,y,z; 
		t=y=z=200;
		System.out.println("Chained Assigned Value "+t+" "+y+" "+z); 	//Chained Assignment operator =
		
		int d =x+5;
		System.out.println("Chained Assigned Value "+d); 				//compound Assignment operator =
				
		String name="saif";												//String concatination operator
		String comment=" is the best" ;
		System.out.println(name+comment);
		
		int q=10;
		System.out.println("Preincrement: "+(++q));										//pre increment
		System.out.println("predecrement: "+(--q));										//pre decrement
		System.out.println("Preincrement: "+(q++));										//post increment
		System.out.println("predecrement: "+(q--));										//post decrement
		
		if(true && true)
		{
			System.out.println("Logical and operator");									//logical operator
		}
		
		if (20>10)
		{
			System.out.println("Relational operator");									//Relational operator
		}
		
		if (x==100)
		{
			System.out.println("Equality operator");									//Equality operator
		}
		
	
	}

}
