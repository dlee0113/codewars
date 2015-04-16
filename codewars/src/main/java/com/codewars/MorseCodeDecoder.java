package com.codewars;

public class MorseCodeDecoder {
	public static void main(String[] args) {
		System.out.println(decode(".... . -.--   .--- ..- -.. ."));
	}
	
	public static String decode(String morseCode) {
		String decodedText = "";
		String[] chunks = morseCode.split("   ");
		
		for (int i = 0; i < chunks.length; i++)	 {
			String[] codes = chunks[i].split(" ");
			
			for (String code : codes) {
//				MorseCode.get(code);
				decodedText += code;
			}
			
			if (i != chunks.length - 1) {
				decodedText += " ";
			}
		}
		
		return decodedText;
	}
}
