package com.test.datastructure;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.develop.custom.examples.BalanceExpression;
import com.develop.custom.examples.ReverseString;

public class TestCustomExamples {
	
	@Test
	public void testReverseString() {
		ReverseString rs = new ReverseString();
		assertEquals("cba", rs.reverseString("abc"));
	}
	
	@Test
	public void testBalanceString() {
		BalanceExpression be = new BalanceExpression();
		assertTrue("", be.getBalanceString("({678})"));
	}

}
