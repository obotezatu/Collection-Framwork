package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueCharCounterTest {

	private CharCounter charactersCount;
	private Map<Character, Long> expected;

	@Before
	public void setUp() {
		charactersCount = new UniqueCharCounter();
		expected = new LinkedHashMap<Character, Long>();
	}

	@Test
	public void testGetCountedLetters() {
		expected.put('H', 1L);
		expected.put('e', 1L);
		expected.put('l', 3L);
		expected.put('o', 2L);
		expected.put(' ', 1L);
		expected.put('w', 1L);
		expected.put('r', 1L);
		expected.put('d', 1L);
		assertEquals(expected, charactersCount.countChars("Hello world"));
	}
	
	@Test 
	public void testTakeVoidString() {
		assertEquals(expected, charactersCount.countChars(""));
	}
}
