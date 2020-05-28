package com.core.java.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class Adapter {

	public static void main(String[] args) {
		
		Integer[] arrayInteger = new Integer[] {32,22,333};
		List<Integer> integerList = Arrays.asList(arrayInteger);
		
		System.out.println(arrayInteger);
		System.out.println(integerList);
	}
}
