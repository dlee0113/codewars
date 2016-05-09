package com.codewars;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PaginationHelperTest {
	private PaginationHelper<Character> helper;
	
	@Before
	public void setUp() {
		helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
	}

	@After
	public void tearDown() {
		helper = null;
	}	
	
	@Test
	public void testPageCount() {
		assertEquals(2, helper.pageCount());
	}
	
	@Test
	public void testItemCount() {
		assertEquals(6, helper.itemCount());
	}
	
	@Test
	public void testPageItemCount_0() {
		assertEquals(4, helper.pageItemCount(0));
	}
	
	@Test
	public void testPageItemCount_1() {
		assertEquals(2, helper.pageItemCount(1));
	}
	
	@Test
	public void testPageItemCount_2() {
		assertEquals(-1, helper.pageItemCount(2));
	}
	
	@Test
	public void testPageIndex_5() {
		assertEquals(1, helper.pageIndex(5));
	}
	
	@Test
	public void testPageIndex_2() {
		assertEquals(0, helper.pageIndex(2));
	}
	
	@Test
	public void testPageIndex_20() {
		assertEquals(-1, helper.pageIndex(20));
	}
	
	@Test
	public void testPageIndex_minus10() {
		assertEquals(-1, helper.pageIndex(-10));
	}
}
