package com.develop.custom.examples;

public class ReverseString {

	public String reverseString(String s) {
		if(s==null)
			throw new IllegalArgumentException();
		StringBuffer reverseString= new StringBuffer();
		for(int i=s.length()-1;i>=0;i--) {
			reverseString.append(s.charAt(i));
		}
		return reverseString.toString();
	}
	
}
