package com.codewars;

import java.math.BigInteger;

//http://www.purplemath.com/modules/factzero.htm
//Take the number that you've been given the factorial of.
//Divide by 5; if you get a decimal, truncate to a whole number.
//Divide by 52 = 25; if you get a decimal, truncate to a whole number.
//Divide by 53 = 125; if you get a decimal, truncate to a whole number.
//Continue with ever-higher powers of 5, until your division results in a number less than 1. Once the division is less than 1, stop.
//Sum all the whole numbers you got in your divisions. This is the number of trailing zeroes.
public class TrailingZeroes {
	public static void main(String[] args) {
		System.out.println(zeros(6));
	}
	
	public static int zeros(int n) {
		int result = 0;
		int sum = 0;
		int divider = 5;
		
		do {
			result = n / divider;
			sum = sum + result;
			
			divider = divider * 5;
		} while(result > 0);
		
		return sum;
	}
	
//	public static int zeros(int n) {
//		char[] charArray = factorial(n).toCharArray();
//		int trailingZeroCount = 0;
//
//		System.out.println(charArray.length);
//
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			if (charArray[i] == '0') {
//				trailingZeroCount++;
//			} else {
//				break;
//			}
//		}
//
//		return trailingZeroCount;
//	}

	public static String factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		
		return fact.toString();
	}

	// public static BigInteger factorial(BigInteger n) {
	// BigInteger result = BigInteger.ONE;
	//
	// while (!n.equals(BigInteger.ZERO)) {
	// result = result.multiply(n);
	// n = n.subtract(BigInteger.ONE);
	// }
	//
	// return result;
	// }
}