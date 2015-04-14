package com.codewars;

public class SquareDigit {
	public int squareDigits(int n) {
		char[] numbersArray = String.valueOf(n).toCharArray();
		StringBuilder squared = new StringBuilder();
		
		for (char number : numbersArray) {
			squared.append(Character.getNumericValue(number) * Character.getNumericValue(number));
			
			System.out.println(squared);
		}
		
		return Integer.valueOf(squared.toString());
	}
}
