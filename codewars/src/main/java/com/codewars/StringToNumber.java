package com.codewars;

public class StringToNumber {
	public static int stringToNumber(String str) {
		if (str.startsWith("-")) {
			return -1 * Integer.valueOf(str.substring(1));
		}
		else {
			return Integer.valueOf(str);
		}
	}
}
