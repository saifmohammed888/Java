package com.core.java;

public class Variables {

	static String staticVariable = "Static Variable";		// --> Static Variable
	String instanceVariable;

	public static void main(String args[]) {
		
		String locaVariabl = "local Variable";				// --> Local Variable

		Variables instance = new Variables();
		instance.instanceVariable = "Instance Variable";	// --> Instance Variable

		System.out.println(staticVariable);
		System.out.println(locaVariabl);
		System.out.println(instance.instanceVariable);
	}
}
