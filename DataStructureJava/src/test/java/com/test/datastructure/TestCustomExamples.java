package com.test.datastructure;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import com.develop.custom.examples.BalanceExpression;
import com.develop.custom.examples.RepeatedChar;
import com.develop.custom.examples.ReverseString;

public class TestCustomExamples {
	
	@Test
	@Ignore
	public void testReverseString() {
		ReverseString rs = new ReverseString();
		assertEquals("cba", rs.reverseString("abc"));
	}
	
	@Test
	@Ignore
	public void testBalanceString() {
		BalanceExpression be = new BalanceExpression();
		assertTrue("", be.getBalanceString("({678})"));
	}
	
	@Test
	public void testFirstRepeativeString() {
		RepeatedChar be = new RepeatedChar();
		System.out.println(be.firstNonRepeatedChar("a apple is green"));
	}

}
