package com.core.java;

public class Arrays {

	//MultiDimensional Arrays
	public static void MultiDimArray(){
		
		int a[][] = new int[][] {{1,2},{3,4},{5,6}};
		
		System.out.println(a.length);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Multidimensional Array "+a[i][j]);
			}
		}
		
	}
	
	//Activity
	public static void activityArray(){
		char ch[] = new char[] {'a','b','c','d'};
		
		char copy[]= new char[4];
		copy = ch.clone();
		for(char temp:copy) {
			System.out.println("Copied Array "+temp);
		}
		
		for(int i=1;i<ch.length;i++) {
			if(i==1) 
			{
				for(int j=i+1;i<ch.length-1;i++) {
					ch[i] = ch[j];
				}
			}
			;
		}
		
		for(char temp:ch) {
			System.out.println("Deleted Array "+temp);
		}
		
		
	}
	
	//Single Dimensional Arrays
	
	public static void main(String[] args) {

		//Array Initialization and Declaration 
		int a[] = new int[] { 1, 2, 3, 4, 5 };

		for (int temp : a) {
			System.out.println(temp);
		}
		
		//Array Initialization and Declaration
		String b[] = {"Saif","Salman","Suhaib","Zoya"};
		for (String temp : b) {
			System.out.println(temp);
		}
				
		System.out.println(a.length);
		Arrays.MultiDimArray();
		Arrays.activityArray();
	}

}
