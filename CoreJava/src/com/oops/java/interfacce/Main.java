package com.oops.java.interfacce;

public class Main {

	public static void main(String[] args) {

		HDFC hdfcObject = new HDFC();
		ICICI iciciObject = new ICICI();
		
		System.out.println(hdfcObject.getFreeTickets());
		System.out.println(iciciObject.getFreeTickets());
	}
}
