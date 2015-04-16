package com.codewars;

import java.util.HashMap;

// '2','3','4','5','6','7','8','9','T','J','Q','K','A'
public class Game {
	public String winner(String[] deckSteve, String[] deckJosh) {
		int stevePoints = 0;
		int joshPoints = 0;
		String message = "";
		HashMap<String, Integer> cardMap = new HashMap<String, Integer>();
		cardMap.put("2", 1);
		cardMap.put("3", 2);
		cardMap.put("4", 3);
		cardMap.put("5", 4);
		cardMap.put("6", 5);
		cardMap.put("7", 6);
		cardMap.put("8", 7);
		cardMap.put("9", 8);
		cardMap.put("T", 9);
		cardMap.put("J", 10);
		cardMap.put("Q", 11);
		cardMap.put("K", 12);
		cardMap.put("A", 13);
		
		for (int i = 0; i < deckSteve.length; i++) {
			int compareResult = cardMap.get(deckSteve[i]).compareTo(cardMap.get(deckJosh[i]));
			
			if (compareResult > 0) {
				stevePoints++;
			}
			else if (compareResult < 0) {
				joshPoints++;
			}
		}
		
		if (stevePoints > joshPoints) {
			message = "Steve wins " + stevePoints + " to " + joshPoints;
		}
		else if (stevePoints < joshPoints) {
			message = "Josh wins " + joshPoints + " to " + stevePoints;
		}
		else {
			message = "Tie";
		}
		
		System.out.println("stevePoints: " + stevePoints);
		System.out.println("joshPoints: " + joshPoints);
		System.out.println(message);
		
		return message;
	}
}
