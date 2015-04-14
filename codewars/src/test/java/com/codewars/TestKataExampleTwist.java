package com.codewars;

import org.junit.Assert;
import org.junit.Test;

import com.codewars.KataExampleTwist;

public class TestKataExampleTwist {
	@Test
	public void testOutputJava() {
		String[] websites = new String[1000];

		for (int i = 0; i < websites.length; i++) {
			websites[i] = "codewars";
		}

		Assert.assertArrayEquals(websites, KataExampleTwist.kataExampleTwist());
	}
}
