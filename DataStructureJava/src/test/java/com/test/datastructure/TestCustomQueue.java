package com.test.datastructure;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Ignore;
import org.junit.Test;

public class TestCustomQueue {
	com.develop.custom.queue.Queue customQueue=null;
	com.develop.custom.queue.QueueWithStack queueWithStack=null;
	com.develop.custom.queue.PriorityQueue priorityQueue=null;
    @Test
    @Ignore
	public void testReverseQueue() {
    	customQueue = new com.develop.custom.queue.Queue();
		Queue<Integer> queue= new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		customQueue.reverse(queue);
	}
    
    @Test
    @Ignore
    public void testEnqueue() {
    	customQueue = new com.develop.custom.queue.Queue();
    	customQueue.enqueue(10);
    	customQueue.enqueue(20);
    	customQueue.enqueue(30);
    	customQueue.enqueue(40);
    	customQueue.enqueue(50);
    	customQueue.print();
    }
    
    @Test
    @Ignore
    public void testStackEnqueue() {
    	queueWithStack = new com.develop.custom.queue.QueueWithStack();
    	queueWithStack.enqueue(10);
    	queueWithStack.enqueue(20);
    	queueWithStack.enqueue(30);
    	queueWithStack.enqueue(40);
    	queueWithStack.enqueue(50);
    	queueWithStack.dequeue();
    }
    @Test
  
    public void testStackPQEnqueue() {
    	priorityQueue = new com.develop.custom.queue.PriorityQueue();
    	priorityQueue.enqueue(10);
    	priorityQueue.enqueue(20);
    	priorityQueue.enqueue(5);
    	System.out.println(priorityQueue);
    }
}
