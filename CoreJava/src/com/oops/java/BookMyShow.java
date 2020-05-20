package com.oops.java;

public abstract class BookMyShow {												//abstract class
	abstract void getFreeMovietickets();										//abstract method
	
	public static void main(String args[])
	{ 
	BookMyShow b;   
	b=new ICICI();
	b.getFreeMovietickets();     
	b=new HSBC();
	b.getFreeMovietickets();   
	}
}

class ICICI extends BookMyShow
{    
void getFreeMovietickets()
{
System.out.println("ICICI 2 movie tickets free/month");								//implementation of abstract method
}    
}    
class HSBC extends BookMyShow
{    
void getFreeMovietickets()
{
System.out.println("HSBC 1 movie tickets free/month");
}   
}    
