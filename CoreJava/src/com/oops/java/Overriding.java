package com.oops.java;

public class Overriding {

	public static void main(String[] args) {
		
		Father s=new Son();
		s.lifestyle();
		s.profession();
		
	}
}

		class Father															//PArent class
		{
			void lifestyle() 
			{
				System.out.println("Father works,studies");
			}
			
			void profession() {
				System.out.println("Father works as Doctor");
			}
		}

		
		class Son extends Father												//child class
		{
			void lifestyle() 													//overriding rewriting parent class method in child class
			{
				System.out.println("Son chills,party spends and plays");
			}
			
			void profession() {
				System.out.println("Child works as Engineer");
			}
		}