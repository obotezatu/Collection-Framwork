package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

//import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class CharacterCounterCacheTest {

	private CharCounter charactersCount;

	@Before
	public void setUp() {
		charactersCount = new CharacterCounterCache(new CharacterCounter());
	}

	@Test
	public void testGetCountedletters() {
		Map<Character, Long> expected = new LinkedHashMap<Character, Long>();
		expected.put('H', 1L);
		expected.put('e', 1L);
		expected.put('l', 2L);
		expected.put('o', 2L);
		expected.put(' ', 1L);
		expected.put('w', 1L);
		expected.put('r', 1L);
		expected.put('d', 1L);
		assertEquals(expected, charactersCount.countChar("Hello word"));
	}
}