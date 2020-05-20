package com.oops.java;

//Cant run as we need to create classes in different files
class Parent { // Parent class has the String names

	static String batsmen = "Virat Kohli";
	static String bowler = "Irfan pathan";
}

class Child extends Parent {

	public void printData() { // The child class is using the values from parent
		String team = "india";
		System.out.println("The main Batsmen of team" + team + " is " + batsmen);
		System.out.println("The main Bowler of team" + team + " is " + bowler);
	}

	public static class Inheritance {

		public static void main(String[] args) {

			Child inheritObject = new Child();
			inheritObject.printData();
		}

	}
}