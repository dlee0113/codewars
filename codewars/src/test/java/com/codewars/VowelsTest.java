package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class VowelsTest {
	@Test
	public void testCase1() {
		Assert.assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
	}
}
