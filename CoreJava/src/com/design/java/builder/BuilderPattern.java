package com.design.java.builder;

public class BuilderPattern {
	
	public static void main(String[] args) {
		
		StringBuilder builderObject = new StringBuilder();
		
		builderObject.append("Mohammed Saif ");
		builderObject.append("is a clas software engineer ");
		builderObject.append("with some amazing java skills with years of exp ");
		builderObject.append(2);
		
		System.out.println(builderObject.toString());
		
	}
}
