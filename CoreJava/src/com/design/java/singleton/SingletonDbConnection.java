package com.design.java.singleton;

public class SingletonDbConnection {
	
	public static void main(String[] args) {
		
		SingletonPattern instance = SingletonPattern.getInstance();
		SingletonPattern instance2 = SingletonPattern.getInstance();
		
		System.out.println(instance);
		System.out.println(instance2);
	}
}
