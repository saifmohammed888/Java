package com.skilling.java.core;

	enum Family {
		SALMAN, SUHAIB, SAIF, ZOYA;

	public void familyMember() {
		System.out.println("Method to get family Members");

		System.out.println(Family.SAIF);
		System.out.println(Family.SALMAN);
		System.out.println(Family.SUHAIB);
		System.out.println(Family.ZOYA);
	}
	}
	
	public class Enumeration {

	public static void main(String[] args) {

		Family familyMember = Family.SAIF;
		System.out.println(familyMember);
		familyMember.familyMember();
	}
	}	
