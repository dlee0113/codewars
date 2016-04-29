package com.codewars;

public class CalculateRotation {
	public static void main(String[] args) {
		String word = "abc";
		
//		String rotate1 = word.substring(1, 3) + word.substring(0, 1);
//		System.out.println(rotate1);
//		
//		String rotate2 = word.substring(2, 3) + word.substring(0, 2);
//		System.out.println(rotate2);
		
		int rotationCount = word.length();
		
		for (int i = 0; i < word.length(); i ++) {
			rotationCount --;
			String rotatedWord = word.substring(i + 1, word.length()) + word.substring(0, i + 1);
			System.out.println(rotationCount);
			System.out.println(rotatedWord);
		}
	}
	
	static int shiftedDiff(String first, String second) {
		int rotationCount = first.length();
		boolean matchFlag = false;
		
		for (int i = 0; i < first.length(); i ++) {
			rotationCount --;
			String rotatedWord = first.substring(i + 1, first.length()) + first.substring(0, i + 1);
			System.out.println(rotationCount);
			System.out.println(rotatedWord);
			
			if (rotatedWord.equals(second)) {
				matchFlag = true;
				break;
			}
		}
		
		if (matchFlag == false) {
			rotationCount = -1;
		}
		
		return rotationCount;
	}
}
