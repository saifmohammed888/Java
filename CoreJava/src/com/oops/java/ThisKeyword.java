package com.oops.java;

public class ThisKeyword {

	int bowlSpeed;
	String bowlerName;
	String team;

	public void assignTeam(String team) {
		this.team = team;
	}

	ThisKeyword(int s, String n, String t) {
		this.bowlSpeed = s;
		this.bowlerName = n;

		// Invoking current class method using this
		this.assignTeam(t);
	}

	public static void main(String[] args) {

		ThisKeyword thisObject = new ThisKeyword(100, "Mohammed Saif", "Standards");

		// calling the constructor
		System.out.println(thisObject.bowlerName + " plays for " + thisObject.team + "and bowls at a speed of "
				+ thisObject.bowlSpeed);
	}
}
