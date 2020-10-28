package com.skilling.java.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputClass {
	
	
	public static void main(String[] args) {
		InputOutputClass obj = new InputOutputClass();
		obj.charStream();
		obj.byteStream();
	}

	private void byteStream() {
		
		FileInputStream inputStream =null;
		FileOutputStream outStream  =null;
		
		try {
			System.out.println("Writing to Output");
			inputStream = new FileInputStream("C:\\Users\\Saif\\Desktop\\Saif2.txt");
			outStream   = new FileOutputStream("C:\\Users\\Saif\\Desktop\\Output.txt");
			
			int temp;
			while((temp = inputStream.read()) !=-1) {
				outStream.write((byte)temp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
				outStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	private void charStream() {
		
		FileReader inputStream = null;
		try {
			inputStream = new FileReader("C:\\Users\\Saif\\Desktop\\Saif.txt");
			int temp;
			
			while((temp = inputStream.read()) !=-1) {
				System.out.println((char)temp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(inputStream !=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
