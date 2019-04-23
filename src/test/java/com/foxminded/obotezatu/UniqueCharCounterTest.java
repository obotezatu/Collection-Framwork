package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueCharCounterTest {

	private UniqueCharCounter charCount;

	@Before
	public void setUp() {
		charCount = new UniqueCharCounter();
	}

	@Test
	public void testCountChars() {
		Map<Character, Long> expected = new LinkedHashMap<Character, Long>();
		expected.put('H', 1L);
		expected.put('e', 1L);
		expected.put('l', 3L);
		expected.put('o', 2L);
		expected.put(' ', 1L);
		expected.put('w', 1L);
		expected.put('r', 1L);
		expected.put('d', 1L);
		
		assertEquals(expected,charCount.countChars("Hello world"));
		
	}
	
	@Test 
	public void testTakeVoidString() {
		Map<Character, Long> expected = new LinkedHashMap<Character, Long>();
		
		assertEquals(expected, charCount.countChars(""));
	}
}
