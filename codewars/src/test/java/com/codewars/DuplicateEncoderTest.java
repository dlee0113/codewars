package com.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateEncoderTest {
	@Test
	public void test() {
		assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
		assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
	}
}
