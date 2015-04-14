package com.codewars;

import org.junit.Assert;
import org.junit.Test;

import com.codewars.TrailingZeroes;

public class TestTrailingZeroes {
	@Test
	public void testZeros() throws Exception {
		Assert.assertEquals(0, TrailingZeroes.zeros(0));
		Assert.assertEquals(1, TrailingZeroes.zeros(6));
		Assert.assertEquals(2, TrailingZeroes.zeros(14));
	}
}
