package com.oopsjava;

public class Association 
{
	
	public static void main(String[] args) {
		
		Address add =new Address (101,"Lingarajpuram","Bangalore","Karnataka");
		Person p =new Person ("Mohammed Saif",22,"8553548534",add);
		
		System.out.println("Name: "+p.name);
		System.out.println("Age: "+p.age);
		System.out.println("Contact: "+p.contact);
		System.out.println("Address: "+p.add.door+" "+p.add.area+" "+p.add.city+" "+p.add.state);
	}
}

		class Address{
	
			int door;
			String area;
			String city;
			String state;
			
			Address(int d,String a,String c,String s)
			{
				this.door=d;
				this.area=a;
				this.city=c;
				this.state=s;
			}
} 
		
		class Person{
			
			String name;
			int age;
			String contact;
			Address add;
		
			Person(String n,int i,String con,Address addr){
				this.name=n;
				this.age=i;
				this.contact=con;
				this.add=addr;
			}
		}