package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
	@Test
	public void testKnownValues() {
		try {
			Circle.area(0);
			Assert.fail("Radius of 0 should throw an IllegalArgumentException");
		} catch (IllegalArgumentException iae) {
		}
		for (int i = 0; i < 3; i++) {
			double x = 3D;
			Assert.assertEquals(28.27D, Circle.area(x), 0.01);
		}
	}
}
