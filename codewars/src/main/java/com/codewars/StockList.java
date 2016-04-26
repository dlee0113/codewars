package com.codewars;

import java.util.Arrays;
import java.util.HashMap;

public class StockList {
	// 1st parameter is the stocklist (L in example),
	// 2nd parameter is list of categories (M in example)
	
//	L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}
//	M = {"A", "B", "C", "W"}
//	(A : 20) - (B : 114) - (C : 50) - (W : 0)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
	    String output = "";
	    
	    if (lstOfArt.length == 0) {
	    	return output;
	    }
		
		HashMap<String, Integer> categoryMap = new HashMap<String, Integer>();
		
		for (String stock : lstOfArt) {
			String[] stockArray = stock.split(" ");
			String category = stockArray[0].substring(0, 1);
			Integer quantity = Integer.valueOf(stockArray[1]);
			
			if (categoryMap.get(category) == null) {
				categoryMap.put(category, quantity);
			}
			else {
				categoryMap.put(category, categoryMap.get(category) + quantity);
			}
		}
		
		for (int i = 0; i < lstOf1stLetter.length; i++) {
			Integer quantity = 0;
			if (categoryMap.get(lstOf1stLetter[i]) != null) {
				quantity = categoryMap.get(lstOf1stLetter[i]);
			}
			
			output += "(" + lstOf1stLetter[i] + " : " + quantity + ")";
			
			if (i !=  lstOf1stLetter.length - 1) {
				output += " - ";
			}
		}
		
		return output;
	}
}
