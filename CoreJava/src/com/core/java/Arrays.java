package com.core.java;

public class Arrays {

	//MultiDimensional Arrays
	public static void MultiDimArray(){
		
		int a[][] = new int[][] {{1,2},{3,4},{5,6}};
		
		System.out.println(a.length);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
			}
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
	}
}
