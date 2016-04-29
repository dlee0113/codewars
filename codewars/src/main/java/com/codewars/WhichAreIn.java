package com.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		List<String> sortedList = new ArrayList<String>();
		
		for (String word2 : array2) {
			for (String word1 : array1) {
				if (word2.contains(word1) && !sortedList.contains(word1)) {
					sortedList.add(word1);
				}
			}
		}
		
		Collections.sort(sortedList);
		
		return sortedList.toArray(new String[sortedList.size()]);
	}
}
