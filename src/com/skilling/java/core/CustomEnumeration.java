package com.skilling.java.core;

public class CustomEnumeration {

	public static void main(String[] args) {
		
		Cricketer[] cricket = Cricketer.values();
		for(Cricketer cricketers: cricket) {
			System.out.println("Name :" +cricketers.name()+" Speciality :"+cricketers.getAction());
		}
	}
}

enum Cricketer{
		
	VIRAT_KOHLI("Right Arm Batsmen"), DALE_STEYN("Right Arm Fast Bowler"), IRFAN_PATHAN("Allrounder");
		
	private String action;
	
	public String getAction() {
		return this.action;
	}
		
	private Cricketer(String action) {
		this.action = action;
	}
}