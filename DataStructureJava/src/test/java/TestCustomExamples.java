import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.develop.custom.examples.ReverseString;

public class TestCustomExamples {
	
	@Test
	public void testReverseString() {
		ReverseString rs = new ReverseString();
		assertEquals("cba", rs.reverseString("abc"));
	}

}
