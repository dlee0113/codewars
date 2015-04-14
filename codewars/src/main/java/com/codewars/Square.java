package com.codewars;

import java.util.Arrays;


public class Square {
	public static void main(String[] args) {
		System.out.println(isSquare(-1));
	}
	
	public static boolean isSquare(int n) {
		if (n < 0) {
			return false;
		}
		
		System.out.println(n);
		
		double squareRoot = Math.sqrt(n);
		String[] squareRootArray = (String.valueOf(squareRoot)).split("\\.");
		
		System.out.println(Arrays.toString(squareRootArray));
		
		for (char character : squareRootArray[1].toCharArray()) {
			System.out.println(character);
			
			if (character != '0') {
				return false;
			}
		}
		
		return true;
	}
}
