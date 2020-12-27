package com.develop.custom.queue;

import java.util.Stack;

public class QueueWithStack {
	
	private Stack<Integer> stack1=null;
	private Stack<Integer> stack2=null;
	
	public  QueueWithStack() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	
	public void enqueue(int item) {
		stack1.push(item);
	}
	public int dequeue() {
		if(stack2.isEmpty())
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
				
			}
		return stack1.pop();
	}
	
}
