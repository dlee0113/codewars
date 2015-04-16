package com.codewars;

import java.util.ArrayList;
import java.util.List;

public class UniqueArray {
	public static int[] unique(int[] integers) {
		List<Integer> uniqueList = new ArrayList<Integer>();
		
		if (integers.length > 0) {
			uniqueList.add(integers[0]);
			
			for (int i = 1; i < integers.length; i++) {
				boolean isUnique = true;
				
				for (Integer number : uniqueList) {
					if (number == integers[i]) {
						isUnique = false;
						break;
					}
				}
				
				if (isUnique) {
					uniqueList.add(integers[i]);
				}
			}
		}
		
		int[] uniqeArray = new int[uniqueList.size()];
		for (int i = 0; i < uniqueList.size(); i++) {
			uniqeArray[i] = uniqueList.get(i);
		}
		
		return uniqeArray;
	}
}
