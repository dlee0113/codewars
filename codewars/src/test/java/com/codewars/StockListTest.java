package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class StockListTest {
	@Test
	public void test1() { 
		String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
    		String cd[] = new String[] {"A", "B"};
    		Assert.assertEquals("(A : 200) - (B : 1140)",
    				StockList.stockSummary(art, cd));
	}
	
	@Test
	public void test2() { 
		String art[] = new String[]{"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
    		String cd[] = new String[] {"A", "B", "C", "W"};
    		Assert.assertEquals("(A : 20) - (B : 114) - (C : 50) - (W : 0)",
    				StockList.stockSummary(art, cd));
	}
	
	@Test
	public void test3() { 
		String art[] = new String[]{};
    		String cd[] = new String[] {"B", "R", "D", "X"};
    		Assert.assertEquals("",
    				StockList.stockSummary(art, cd));
	}
}
