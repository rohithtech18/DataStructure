package com.test.datastructure;
import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import com.develop.custom.linkedlist.LinkedList;

public class TestCustomLinkedList {
	LinkedList linkedList=null;
	@Test
	@Ignore
	public void TestAddFirst() {
		linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		linkedList.print("Add First ==>");
	}
	@Test
	@Ignore
	public void TestLastFirst() {
		linkedList = new LinkedList();
		linkedList.addLast(10);
		linkedList.addLast(20);
		linkedList.addLast(30);
		linkedList.addLast(40);
		linkedList.print("Add Last ==>");
	}
	
	@Test
	@Ignore
	public void TestRemoveFirst() {
		linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		linkedList.removeFirst();
		linkedList.print("Remove First ==>");
	}
	
	@Test
	@Ignore
	public void TestRemoveLast() {
		linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		linkedList.removeLast();
		linkedList.print("Remove Last ==>");
	}
	
	@Test
	@Ignore
	public void TestFindKthElementEnd() {
		linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		System.out.println("Kth Element from End::"+linkedList.getKthNodeFromEnd(1));
	}
	
	@Test
	@Ignore
	public void TestReverse() {
		linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		linkedList.reverse();
		linkedList.print("Reverse>>");
	}
	
	@Test
	@Ignore
	public void TestMiddleElement() {
		linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		int middle[]=linkedList.getMiddle();
		System.out.println("Middle element>>>"+Arrays.toString(middle));
	}

}
