package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
	@Test
	public void testtrue() throws Exception {
		CircleSorted calc = new CircleSorted();

		int[] A = { 3, 0, 1, 2 };
		Assert.assertEquals(true, calc.isCircleSorted(A));
	}

	@Test
	public void testfalse() throws Exception {
		CircleSorted calc = new CircleSorted();
		int[] A = { 9, 10, 14, 12 };
		Assert.assertEquals(false, calc.isCircleSorted(A));
	}
}
