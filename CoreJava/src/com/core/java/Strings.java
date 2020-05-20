package com.core.java;

public class Strings {

	
	public static void Buffer() {
		
		StringBuffer buffer = new StringBuffer("hello ");
		buffer.append("Saif");
		System.out.println("String buffer "+buffer);
	}
	
	public static void main(String[] args) {

		String name = "Mohammed Saif";

		System.out.println(name);
		System.out.println("Length " + name.length());
		System.out.println("Substring " + name.substring(2, 5));
		System.out.println("Comparison " + name.compareTo("Saif"));
		System.out.println("Change case " + name.toLowerCase());
		System.out.println("index of " + name.indexOf("s"));
		System.out.println("Trim leading Spaces " + name.trim());

		Strings.Buffer();
	}
}
