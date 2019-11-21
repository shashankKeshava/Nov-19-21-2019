package com.lab09;

import java.util.ArrayList;
import java.util.List;

public class ComplexCipher implements Cipher {

	private List<SourceJumble> store = new ArrayList<>();
	
	public String encrypt(String word) {
		StringBuilder encryptedWord = new StringBuilder("");
		String[] tempStore = word.split("");
		int count = 0;
		while(count < word.length()) {
			int randomIndex = (int)(Math.random() * word.length());
			if(tempStore[randomIndex] != null) {
				char letter = word.charAt(randomIndex);
				tempStore[randomIndex] = null;
				encryptedWord.append(letter);
				count++;
			}
		}
		store.add(new SourceJumble(word, encryptedWord.toString()));
		return encryptedWord.toString();
	}

	public String decrypt(String word) {
		String decryptedWord = null;
		for (SourceJumble sourceJumble : store) {
			if(sourceJumble.getJumbledWord().equals(word)) {
				decryptedWord = sourceJumble.getSourceWord();
				break;
			}
		}
		return decryptedWord;
	}

}
