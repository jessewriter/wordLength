package com.jesse.wordLength;


import org.apache.log4j.Logger;

import edu.duke.FileResource;

public class WordLength {

	private static final Logger log = Logger.getLogger(WordLength.class);
	


	private int[] counts;

	public WordLength() {
		counts = new int[30];
	}

	public void countWordLengths(FileResource resources){
		String fileIn = resources.asString();
		log.info("file in: " + fileIn);
		int fileCharCount = fileIn.length();
		int size = 0;
		for (int i = 0; i < fileCharCount; i++) {
			char ch = fileIn.charAt(i);
			log.info("is alphabetic? " + validCharacter(ch) + " " + fileIn.charAt(i));
			if(validCharacter(ch)){
				size ++;
			}
			else{
				counts[size] += 1;
				size = 0; 
				}
		}
		
		for (int i = 0; i < counts.length; i++) {
			if(counts[i] > 0){
				log.info(counts[i] +  " words of length " + (i));
			}
		}
	}
	
	private boolean validCharacter(char ch){
		boolean valid;
		if(Character.isAlphabetic(ch) || ch == '\'' || ch == '-'){
			valid = true;
		}
		else{
			valid = false;
		}
		return valid;
	}

	public int[] getCounts() {
		return counts;
	}
	
	

}
