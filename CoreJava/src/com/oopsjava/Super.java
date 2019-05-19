package com.oopsjava;

public class Super {

		
		public static void main(String[] args) {
			
			base b =new base();
			b.display();
		}
}


		class base extends run{																	//child class
	
			void display()
			{
				System.out.println("Super class variable="+super.i);							//using super keyword to access parent class variable
				System.out.println("Super class variable="+super.sho());						//using super keyword to acces parent class method
			}
}
		
		
		class run{
			int i=10;
			
			void display()
			{
				System.out.println("Main method");												//Parent class
			}
			
			String sho() 
			{
				System.out.println("Base class method");
				return null;
			}
		}