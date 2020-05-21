package com.files.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			EmployDetails detailsObject = new EmployDetails("Mohammed Saif", 23, 34040);
			new Serialization().serializeFile(new File("C://Users//Saif//Desktop//Serialize"), detailsObject);
			new Serialization().deSerializeFile(new File("C://Users//Saif//Desktop//Serialize"));
	}
	
	public void serializeFile(File fileToSerialize,EmployDetails detailsObject) throws IOException {
	
		FileOutputStream outputStream = new FileOutputStream(fileToSerialize);
		ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);
		objectStream.writeObject(detailsObject);
		objectStream.flush();
		objectStream.close();
		System.out.println("Created serialization successfully");
	}

	public void deSerializeFile(File fileToDeSerialize) throws IOException, ClassNotFoundException {
		
		FileInputStream inputStream = new FileInputStream(fileToDeSerialize);
		ObjectInputStream objectStream = new ObjectInputStream(inputStream);
		
		EmployDetails employObject = (EmployDetails) objectStream.readObject();
		System.out.println("Deserialized object Name "+employObject.employeeName);
		System.out.println("Deserialized object Age "+employObject.employeeAge);
		System.out.println("Deserialized object Salary "+employObject.employeeSalary);
		objectStream.close();
	}
}
