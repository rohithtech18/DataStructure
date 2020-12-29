package com.develop.custom.queue;

import java.util.Arrays;

public class PriorityQueue {

	private int arr[]=null;
	int count;
	
	public PriorityQueue() {
		arr = new int[5];
	}
	
	public void enqueue(int item) {
		int i;
		for( i=count-1;i>=0;i--) {
			if(arr[i]>item) {
				arr[i+1]=arr[i];
			}
			else {
				break;
			}
		}
		arr[i+1]=item;
		
		count++;
	}

	@Override
	public String toString() {
		return "PriorityQueue [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}

}
