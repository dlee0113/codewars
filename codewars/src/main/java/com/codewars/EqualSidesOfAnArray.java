package com.codewars;

public class EqualSidesOfAnArray {
	public static int findEvenIndex(int[] arr) {
		int index = -1;
		
		for (int i = 1; i < arr.length; i ++) {
			int leftSideSum = 0;
			int rightSideSum = 0;
			
			for (int j = 0; j < i; j ++) {
				leftSideSum = leftSideSum + arr[j];
			}
			
			for (int k = i + 1; k < arr.length; k ++) {
				rightSideSum = rightSideSum + arr[k];
			}
			
			if (leftSideSum == rightSideSum) {
				index = i;
			}
		}
		
		return index;
	}
}
