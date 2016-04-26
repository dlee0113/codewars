package com.codewars;

public class JadenCase {
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.length() == 0) {
			return null;
		}
		
		String jadenCasedPhrase = "";
		String[] words = phrase.split(" ");
		
		for (String word: words) {
			jadenCasedPhrase += word.substring(0, 1).toUpperCase() + word.substring(1);
			jadenCasedPhrase += " ";
		}
		
		return jadenCasedPhrase.trim();
	}
}
