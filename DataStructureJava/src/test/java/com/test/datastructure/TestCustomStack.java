package com.test.datastructure;
import org.junit.Ignore;
import org.junit.Test;

import com.develop.custom.stack.Stack;

public class TestCustomStack {
	Stack stack =null;
	@Test
	@Ignore
	public void testPushStack() {
		stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.print();
	}
	@Test
	@Ignore
	public void testPopStack() {
		stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.print();
		System.out.println("-------------");
		stack.pop();
		stack.print();
	}
	@Test
	@Ignore
	public void testPeekStack() {
		stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.peek());
	}
	
	@Test
	@Ignore
	public void testIsEmptyStack() {
		stack = new Stack();
		
		System.out.println(stack.isEmpty());
	}

}
