package com.skilling.java.core;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		ArrayClass array = new ArrayClass();
		array.oneDimensional();
		array.multiDimensional();
		array.functions();
		
	}

	private void functions() {
		String nameList[] = {"Mohammed Saif","Mohammed Salman","Mohammed Suhaib","Zoya Afreen"};
		
		//sot
		Arrays.sort(nameList);
		 System.out.println("Mohammed Saif" 
                 + " found at index = "
                 + Arrays 
                       .binarySearch(nameList, "Mohammed Salman")); 
		 
		 
		 System.out.println("Array is "+Arrays.toString(nameList));
		 
	}

	private void multiDimensional() {
		
		String employeeDetail[][] = {{"Mohamed Saif","saifmohammed888@gmail.com"},{"Mohamed Salman","salman.m1992@gmail.com"}};
		for(String[] employee: employeeDetail) {
			for(String value:employee) {
				System.out.println();
				System.out.println(value);	
			}
		}
	}

	private void oneDimensional() {
		
		String nameList[] = {"Mohammed Saif","Mohammed Salman","Mohammed Suhaib","Zoya Afreen"};
		
		for(String name: nameList) {
			System.out.println(name);
		}
	}

}
