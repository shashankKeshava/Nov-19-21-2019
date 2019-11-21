package com.lab09;

public class Lab09Main {

	public static void main(String[] args) {
		String word = "zebra";
		System.out.println("***Simple cipher at work");
		Cipher simple = new SimpleCipher();
		String encryptedWord = encrypt(simple, word);
		decrypt(simple, encryptedWord);
		
		System.out.println("***Complex cipher at work");
		Cipher complex = new ComplexCipher();
		encryptedWord = encrypt(complex, word);
		decrypt(complex, encryptedWord);
	}
	
	static String encrypt(Cipher cipher, String word) {
		String encryptedWord = cipher.encrypt(word);
		System.out.println("Encrypted word: " + encryptedWord);
		return encryptedWord;
	}
	
	static void decrypt(Cipher cipher, String word) {
		String decryptedWord = cipher.decrypt(word);
		System.out.println("Decrypted word: " + decryptedWord);
	}

}
