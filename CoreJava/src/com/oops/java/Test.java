package com.oops.java;

public interface Test {

	
	static final int i=20;
	
	public static void main(String[] args) {
		test3 r=new test3();
		r.display();
	}
	
	public abstract void display();
	
}

class test3 implements Test{

	@Override
	public void display() {
		System.out.println("Value of data in implemented class "+i);
		
	}
	
}

