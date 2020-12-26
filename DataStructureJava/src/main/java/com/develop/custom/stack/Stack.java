package com.develop.custom.stack;

import java.util.Arrays;

public class Stack {
	
	private int arr[]=null;
	private int counter=0;
	private int initialCapacity=2;
	

	/**
	 * 
	 * @param element
	 */
	public void push(int element) {
		if(arr==null)
			this.arr= new int[initialCapacity];
		if(counter==initialCapacity) {
			int tempArr[] = new int[initialCapacity];
			for(int i=0;i<initialCapacity;i++) {
				tempArr[i]=arr[i];
			}
			initialCapacity=initialCapacity*2;
			this.arr= new int[initialCapacity] ;
			for(int i=0;i<tempArr.length;i++) {
				arr[i]=tempArr[i];
			}
		}
		arr[counter]=element;
		counter++;
	}
	
	/**
	 * POP
	 */
	public void pop() {
		int temparr[]= new int[arr.length-1];
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				temparr[counter]=arr[i];
				counter++;
			}
		}
		arr=temparr;
		temparr=null;
	}
	
	/**
	 * PEEK
	 */
	public int peek() {
		return arr[arr.length-1];
	}
	
	/**
	 * isEmpty
	 */
	public boolean isEmpty() {
		
		return arr==null;
	}
	/**
	 * Print
	 */
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}

}
