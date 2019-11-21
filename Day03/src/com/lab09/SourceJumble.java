package com.lab09;

public class SourceJumble {
	private String sourceWord;
	private String jumbledWord;
	public SourceJumble(String sourceWord, String jumbledWord) {
		this.sourceWord = sourceWord;
		this.jumbledWord = jumbledWord;
	}
	public String getSourceWord() {
		return sourceWord;
	}
	public String getJumbledWord() {
		return jumbledWord;
	}
}
