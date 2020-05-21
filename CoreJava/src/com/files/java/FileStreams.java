package com.files.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileStreams outStreamObject = new FileStreams();
		outStreamObject.outputStream(new File("C://Users//Saif//Desktop//OutputStream.txt"));
		outStreamObject.inputStream(new File("C://Users//Saif//Desktop//OutputStream.txt"));
	}

	public void outputStream(File fileToWrite) throws FileNotFoundException, IOException {

		FileOutputStream outputStream = new FileOutputStream(fileToWrite);
		outputStream.write("Hi writing data into this file using output stream".getBytes());
		System.out.println("Successfull written to File");
		outputStream.close();
	}
	
	public void inputStream(File fileread) throws IOException {
		FileInputStream inputStream = new FileInputStream(fileread);
		
		int readFromFile;
		while((readFromFile=inputStream.read())!=-1) {
			System.out.println("Reading as inputstream "+(char)readFromFile);
		}
		
		inputStream.close();
	}
}
