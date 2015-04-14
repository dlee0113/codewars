package com.codewars;

import org.junit.Assert;
import org.junit.Test;

import com.codewars.CaffeineBuzz;

public class TestCaffeineBuzz {
	@Test
	public void testOutputJava() {
		Assert.assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
	}

	@Test
	public void testOutputJavaScript() {
		Assert.assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
	}

	@Test
	public void testOutputCoffeeScript() {
		Assert.assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
	}

	@Test
	public void testOutputMochaMissing() {
		Assert.assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
	}

	@Test
	public void test_caffeineBuzz() throws Exception {
		int[] mochaMissingArgs = new int[] { 1, 5, 7, 11, -1, -5, -7, -11 };
		for (int i = 0; i < mochaMissingArgs.length; i++) {
			Assert.assertEquals("mocha_missing!",
					CaffeineBuzz.caffeineBuzz(mochaMissingArgs[i]));
		}

		int[] javaArgs = new int[] { 3, 9, 15, 21, -3, -9, -15, -21 };
		for (int i = 0; i < javaArgs.length; i++) {
			Assert.assertEquals("Java", CaffeineBuzz.caffeineBuzz(javaArgs[i]));
		}

		int[] javaScriptArgs = new int[] { 6, 18, 30, 42, -6, -18, -30, -42 };
		for (int i = 0; i < javaScriptArgs.length; i++) {
			Assert.assertEquals("JavaScript",
					CaffeineBuzz.caffeineBuzz(javaScriptArgs[i]));
		}

		int[] coffeeScriptArgs = new int[] { 12, 24, 36, 48, -12, -24, -36, -48 };
		for (int i = 0; i < coffeeScriptArgs.length; i++) {
			Assert.assertEquals("CoffeeScript",
					CaffeineBuzz.caffeineBuzz(coffeeScriptArgs[i]));
		}

	}
}
