package com.oops.java.exception;

public class Exception {
		
		
		//Try catch
		public void First() {
			int i=10;
			try {
				int j= i/0;
				System.out.println(j);
			}
			catch(ArithmeticException e){
				System.out.println("Dividing by zero is a sin in Arithmetic caught exception "+e);
			}
			
			System.out.println("\nArithmetic Exception this statement is executed since its handled");
		}
		
		//Try Catch Finally
		public void Second() {
			try {
				int[] Arr= {1,2,3};
				System.out.println(Arr[4]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("You are looking for an invisible entity, no array element found "+e);
			}
			finally {
				System.out.println("\nFinally Exception this statement is executed since its handled");
			}
		}


		public static void main(String[] args) {
			
			Exception tryObject = new Exception();
			tryObject.First();
			
			Exception secondObject = new Exception();
			secondObject.Second();
		}
}