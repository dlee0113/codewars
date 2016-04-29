package com.codewars;

public class DuplicateEncoder {
	static String encode(String word) {
		char[] characters = word.toLowerCase().toCharArray();
		int characterCount = 0;
		StringBuilder encodedWord = new StringBuilder();
		
		for (int i = 0; i < characters.length; i ++) {
			characterCount = 0;
			
			for (int j = 0; j < characters.length; j ++) {
				if (characters[i] == characters[j]) {
					characterCount ++;
				}
			}
			
			if (characterCount == 1) {
				encodedWord.append("(");
			}
			else {
				encodedWord.append(")");
			}
		}
		
		return encodedWord.toString();
	}
}
