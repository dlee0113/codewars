package com.codewars;

import java.util.Arrays;

public class Order {
	public static void main(String[] args) {
		String output = Order.order("is2 Thi1s T4est 3a");
		System.out.println(output);
	}

	public static String order(String words) {
		String[] wordsArray = words.split(" ");
		StringBuilder orderedWords = new StringBuilder();;
		
		for (int i = 0; i < wordsArray.length; i ++) {
			for (int j = 0; j < wordsArray.length; j ++) {
				if (wordsArray[j].matches("(.*)" + String.valueOf(i + 1) + "(.*)")) {
					orderedWords = orderedWords.append(wordsArray[j]);
					
					break;
				}
			}
			
			if (i < wordsArray.length - 1) {
				orderedWords = orderedWords.append(" ");
			}
		}
		
		return orderedWords.toString();
	}
}