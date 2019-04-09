package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

//import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class CacheTest {

	private Characters charactersCount;

	@Before
	public void setUp() {
		charactersCount = new Cache(new CharactersMap());
	}

	@Test
	public void testGetCountedletters() {
		Map<Character, Integer> expected = new LinkedHashMap<Character, Integer>();
		expected.put('H', 1);
		expected.put('e', 1);
		expected.put('l', 2);
		expected.put('o', 2);
		expected.put(' ', 1);
		expected.put('w', 1);
		expected.put('r', 1);
		expected.put('d', 1);
		assertEquals(expected, charactersCount.createCharactersMap("Hello word"));
	}
}