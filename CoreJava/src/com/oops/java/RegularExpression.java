package com.oops.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		String pattern="[a-z]+";
		String check="happy learning";
		
		Pattern compilePattern = Pattern.compile(pattern);
		Matcher matcherString = compilePattern.matcher(check);
		
		while(matcherString.find()) {
			System.out.println(check.substring(matcherString.start(),matcherString.end()));
		}
			
	}
}
