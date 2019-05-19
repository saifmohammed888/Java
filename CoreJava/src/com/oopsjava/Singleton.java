package com.oopsjava;

public class Singleton {
	
	private static Singleton con=null;
	
	public static Singleton getObject() {
		
		if(con==null)
		{
			con=new Singleton();
			
		}
		return con;
	}
	
	public static void main(String[] args) {
			Singleton con1 =Singleton.getObject();
			Singleton con2 =Singleton.getObject();
			
			System.out.println(con1);
			System.out.println(con2);
			
	}
	

}
