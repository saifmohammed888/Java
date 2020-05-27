package com.design.java.singleton;

public class SingletonPattern {
	
	private static volatile SingletonPattern instance = null;
	
	private SingletonPattern() {
		if(instance !=null) {
			throw new RuntimeException("User getInstance method to create");
		}
	};
	
	public static SingletonPattern getInstance() {
		
		if(instance == null) {
			//Lazy loading
			synchronized(SingletonPattern.class) {
				if(instance == null) {
					instance = new SingletonPattern();
				}
			}
		}
		return instance;
	}
}
