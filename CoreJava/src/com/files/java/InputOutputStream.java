package com.files.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputStream {

	public void writeToFile(File fileToWrite) {

		PrintWriter writer = null;
		try {
			writer = new PrintWriter(fileToWrite);
			writer.println("Writing into the file from Java");
			System.out.println("Successfully wrote into the file using PrintWriter");

		} catch (FileNotFoundException e) {
			System.out.println("Required File was not found " + e);
		} finally {
			writer.close();
			System.out.println("Closing the file");
		}
	}

	public void readFile(File fileToWrite) throws FileNotFoundException {

		Scanner scan = new Scanner(fileToWrite);
		while (scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		File myTextFile = new File("C:\\Users\\Saif\\Desktop\\Saif.txt");

		InputOutputStream fileWriteObject = new InputOutputStream();
		fileWriteObject.writeToFile(myTextFile);
		fileWriteObject.readFile(myTextFile);
	}
}
