package com.jesse.wordLength;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.duke.FileResource;

public class WordLengthTest {

	WordLength wl;
	
	@Before
	public void setUp() throws Exception {
		wl = new WordLength();
	}

	@Test
	public void testWordLength() {
		assertNotNull(wl);
	}

	@Test
	public void testCountWordLengths() {
		System.out.println("be sure to choose lotsOfWords.txt file");
		FileResource fr = new FileResource();
		wl.countWordLengths(fr);
		assertEquals(384, wl.getCounts()[8]);  // this only works if you choose my lotsOfWords.txt
		
	}
	
	@Test
	public void testCountWordLengthsMinusExtraneousCharacters() {
		System.out.println("be sure to choose smallHamlet.txt file");
		FileResource fr = new FileResource();
		wl.countWordLengths(fr);
		assertEquals(2, wl.getCounts()[4]);  // there are 2 words of length 4
		
	}

}
