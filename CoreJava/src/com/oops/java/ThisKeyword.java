package com.oops.java;

public class ThisKeyword {

	
		int bowlSpeed;
		String bowlerName;
		String team;
		
		ThisKeyword(int s,String n,String t)
		{
			this.bowlSpeed =s;															//this keyword refers to current objects variable t.bowlSpeed
			this.bowlerName =n;
			this.team = t;
		}
		
		public static void main(String[] args) {
			
			ThisKeyword t = new ThisKeyword(100,"Mohammed Saif", "Standards");			//calling the constructor 
			System.out.println(t.bowlerName+" plays for "+t.team+
					" and bowls at a speed of "+t.bowlSpeed);
		}
}
