package com.core.java;

public class FlowControl {

	public static void main(String[] args) 
	{
		FlowControl.conditional();
		FlowControl.looping();
		FlowControl.transfer();
	}
		
		//Conditional statements
		
		static void conditional() 
		{
		if(20>10)												//if condition
		{
			System.out.println("it is a if conditional statement");		
		}
		
		int a =10;
		if(a>20)
		{
			System.out.println("Wont enter");
		}
		else if(a<20)
		{	
			System.out.println("Else if condition");				//else if condition
		}
		
		
	}

		static void looping()
		{
			int i=0;
			while(i<3)													//while loop
			{
				System.out.println("while loop");
				i++;
			}
			
			int j=0;													//do while loop
			do {
				 System.out.println("Do while");
				 j++;
			   }
			while(j<3);
		
			for(int k=0;k<3;k++) 										//for loop
			{
				System.out.println("for loop");
			}
		
		}
		
		static void transfer() {
			int x=3;
			switch(x) {	
																							//switch
			case 1: 
				System.out.println("Case1");
				break;
			case 2: 
				System.out.println("Case2");
				break;
			case 3: 
				System.out.println("Case3");
				break;
			default:
				System.out.println("No input");
			}
		}
	}

