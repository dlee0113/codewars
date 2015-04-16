package com.codewars;

import java.util.ArrayList;
import java.util.List;

public class SequenceSum {
	public static void main(String[] args) {
		sumOfN(3);
	}
	
	public static int[] sumOfN(int n) {
		List<Integer> numberList = new ArrayList<Integer>();
		
		if (n >= 0) {
			for (int i = 0; i <= n; i++) {
				numberList.add(i);
			}
		}
		else {
			for (int i = 0; i >= n; i--) {
				numberList.add(i);
			}
		}

		List<Integer> sumList = new ArrayList<Integer>();
		int sum = 0;
		
		for (int i = 0; i < numberList.size(); i++) {
			sum = sum + numberList.get(i);
			sumList.add(sum);
		}
		
		int[] sumArray = new int[sumList.size()];
		for (int i = 0; i < sumList.size(); i++) {
			sumArray[i] = sumList.get(i);
		}
		
		return sumArray; 
	}
}
