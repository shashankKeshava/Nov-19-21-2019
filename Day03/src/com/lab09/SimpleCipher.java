package com.lab09;

public class SimpleCipher implements Cipher {

	public String encrypt(String word) {
		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if(letter == 'z') {
				letter = 'a';
			}
			else {
				letter++;	
			}
			
			builder.append(letter);
		}
		return builder.toString();
	}

	public String decrypt(String word) {
		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if(letter == 'a') {
				letter = 'z';
			}
			else {
				letter--;
			}
			builder.append(letter);
		}
		return builder.toString();
	}

}
