package com.develop.custom.examples;

import java.util.Stack;

public class BalanceExpression {
	
	public boolean getBalanceString(String s) {
		
		Stack<Character> stack = new Stack();
		
		for(char input:s.toCharArray()) {
			if(input=='(') {
				stack.push(input);
			}
			if(input==')') {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
