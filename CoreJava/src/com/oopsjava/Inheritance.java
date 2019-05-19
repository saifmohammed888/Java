package com.oopsjava;

public class Inheritance {

public static void main(String[] args) {
	
}
	
}


class Parent {																		//Parent class has the String names
	
	static String batsmen="Virat Kohli";
	static String  bowler="Irfan pathan";
	
	
}

class Child extends Parent{
	
	
	public static void main(String[] args) {										//The child class is using the values from parent
		String team="india";
		System.out.println("The main Batsmen of team"+team+" is "+batsmen);
		System.out.println("The main Bowler of team"+team+" is "+bowler);
	} 

}