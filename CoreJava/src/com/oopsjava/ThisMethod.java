package com.oopsjava;

public class ThisMethod {

	int strikeRate; 
	String batsmenName;
	String team;
	
	ThisMethod(int s,String n,String t) {
		
		this.batsmenName = n;
		this.strike(s);
		this.teams(t);														//this keyword used to call current class method
		
	}
	
	void teams(String ts) {													//method providing team name
		this.team =ts;
	}
	
	void strike(int r) {													//method providing Strike rate
		this.strikeRate =r;
	}
	
	public static void main(String[] args) {
		
		ThisMethod m = new ThisMethod (140,"Rohit Sharma","Mumbai Indians");
		ThisMethod m2 = new ThisMethod (130,"Virat Kohli","RCB");
		System.out.println(m.batsmenName+" plays for "+m.team+" and has a Strike rate of "+m.strikeRate);
		System.out.println(m2.batsmenName+" plays for "+m2.team+" and has a Strike rate of "+m2.strikeRate);
		
	}
}
