package com.codewars;

//Return the number(count) of vowels in the given string. We will consider a, e, i, o, and u as vowels for this kata.
public class Vowels {
	public static int getCount(String str) {
		int vowelsCount = 0;
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || 
				charArray[i] == 'e' || 
				charArray[i] == 'i' || 
				charArray[i] == 'o' || 
				charArray[i] == 'u') {
				vowelsCount++;
			}
		}
		
		return vowelsCount;
	}
}
