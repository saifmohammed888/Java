package com.oops.java;

public class Methods {

	
	public static void main(String[] args) {
		
		Methods m =new Methods();
				m.nonstatic();
									// non static gives error
				stat();												//object is not required to call the static method
	}
	
	void nonstatic() {												//Non static method can be accessed only using object
		System.out.println("Non static method");
		
	}
	
	static void stat() {											//static method can be accessed directly
		System.out.println("Static method");
		
	}
}
