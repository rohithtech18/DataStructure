package com.develop.custom.queue;

import java.util.Arrays;
import java.util.Stack;

import org.apache.log4j.*;




public class Queue {
	

	private int rear;
	private int front;
	private int arr[]=null;
	
	public Queue() {
		arr = new int[5];
	}
	public void enqueue(int ele) {
		arr[rear]=ele; 
		rear = (rear+1)%arr.length;
		
	}
	public int dequeue() {
		var item=arr[front];
		arr[front++]=0;
		return item;
	}
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 
	 * @param values
	 */
	public void reverse(java.util.Queue<Integer> values) {
		Stack<Integer> stack = new Stack();
		while(!values.isEmpty())
			stack.push(values.remove());
		
		while(!stack.isEmpty())
			values.add(stack.pop());
		System.out.println(values);
	}

}
