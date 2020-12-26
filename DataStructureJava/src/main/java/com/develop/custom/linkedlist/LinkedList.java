package com.develop.custom.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<E> {

	private Node first;
	private Node last;
	private int size=0;

	private class Node{	
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	/**
	 * 
	 * @param element
	 */
	public void addLast(int element) {

		var node = new Node(element);

		if(first==null) {
			first=last=node;
		}else {
			last.next=node;
			last=node;

		}
		size++;

	}

	/**
	 * 
	 * @param element
	 */
	public void addFirst(int element) {

		var node = new Node(element);

		if(first==null) {
			first=last=node;
		}else {
			node.next=first;
			first=node;

		}
		size++;
	}

	/**
	 * 
	 * @param elem
	 * @return
	 */
	public int indexOf(int elem) {
		int index=0;
		var current=first;
		while(current!=null) {
			if(current.value==elem) {
				return index;
			}
			current=current.next;
			index++;
		}
		return -1;
	}

	/*
	 * 
	 */
	public boolean contains(int item) {
		return indexOf(item)!=-1;
	}

	/*
	 * 
	 */
	public void removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(first==last) {
			first=last=null;
		}else {
			var second= first.next;
			first=null;
			first=second;
		}
		size--;

	}

	/*
	 * 
	 */
	public void removeLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(first==last) {
			first=last=null;
		}
		else {
			var node = getPrevious(last);
			node.next=null;
			last=node;
		}
		size--;
	}

	/**
	 * 
	 * @return
	 */
	public int[] toArray() {
		int[] arr = new int[size];
		var current=first;
		int index=0;
		while(current!=null) {
			arr[index]=current.value;
			current=current.next;
			index++;
		}
		return arr;
	}

	/**
	 * 
	 */
	public void reverse() {
		if(isEmpty())
			throw new NoSuchElementException();
		var previous=first;
		var current=first.next;
		while(current!=null) {
			var next = current.next;
			current.next=previous;
			previous=current;
			current=next;

		}
		last=first;
		last.next=null;
		first=previous;
	}

	public int getKthNodeFromEnd(int k) {
		var a= first;
		var b =first; 

		for(int i=0;i<k-1;i++) { 
			b=b.next;
		}
		while(b!=last) {
			a=a.next;
			b=b.next;
		}
		return a.value;
	}

	public int[] getMiddle() { 

		var a=first;
		var b=first;

		while(b!=null && b.next!=last) {
			a=a.next;
			b=b.next.next;
		}

		if(b==last) {
			return new int[] {a.value};
		}else {
			return new int[] {a.value,a.next.value};
		}
	}

	/**
	 * Print
	 */
	public void print(String content) { 

		var current=first;
		while(current!=null) {
			System.out.println(content+current.value);
			current=current.next;
		}
	}

	public int size() {
		return size;
	}
	private boolean isEmpty() {
		return (first==null);
	}

	private Node getPrevious(Node node) {
		var current = first;

		while(current!=null) {
			if(current.next==node) {
				return current;

			}
			current=current.next;
		}
		return null;
	}

}

