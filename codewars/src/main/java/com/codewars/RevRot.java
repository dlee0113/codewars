package com.codewars;

import java.util.ArrayList;
import java.util.List;

public class RevRot {
    
    public static String revRot(String strng, int sz) {
    	if (sz <= 0 || strng == null || strng.equals("") ||strng.length() < sz) {
    		return "";
    	}
    	
    	List<String> chunks = new ArrayList<String>();
    	int beginIndex = 0;
    	int endIndex = sz;
    	
    	while (beginIndex < strng.length() && endIndex <= strng.length()) {
    		chunks.add(strng.substring(beginIndex, endIndex));
    		
    		beginIndex += sz;
    		endIndex += sz;
    	}
    	
    	System.out.println("chunks: " + chunks);
    	
    	StringBuilder strngMod = new StringBuilder();
    	
    	for (String chunk : chunks) {
    		int sum = 0;
        	
        	for (int i = 0; i < chunk.length(); i++) {
        		sum += Character.getNumericValue(chunk.charAt(i)) * Character.getNumericValue(chunk.charAt(i)) * Character.getNumericValue(chunk.charAt(i));
        	}
        	
        	if (sum % 2 == 0) {
        		strngMod.append(reverse(chunk));
        	}
        	else {
        		strngMod.append(rotate(chunk));
        	}
    	}
    	
    	return strngMod.toString();
    }
    
    private static String reverse(String str) {
    	StringBuilder reversedStr = new StringBuilder();
    	
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr.append(str.charAt(i));
		}
		
    	return reversedStr.toString();
    }
    
    private static String rotate(String str) {
    	StringBuilder rotatedStr = new StringBuilder();
    	
    	rotatedStr.append(str.substring(1) + str.substring(0, 1));
    	
    	return rotatedStr.toString();
    }
}
