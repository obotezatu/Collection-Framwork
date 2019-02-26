package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class CharactersCountTest {

	private CharactersQuantity charactersCount;
	private Map<String, Map<Character, Integer>> cache;

	@Before
	public void setUp() {
		charactersCount = new CharactersQuantity();
		cache = new HashMap<>();
		cache.put("Hello word", charactersCount.getCharacters("Hi word"));
		cache.put("Hi word", charactersCount.getCharacters("Hi word"));
	}

	@Test
	public void testGetCountedletters() {
		Map<String, Integer> expected = new LinkedHashMap<String, Integer>();
		expected.put("h", 1);
		expected.put("e", 1);
		expected.put("l", 2);
		expected.put("o", 2);
		expected.put(" ", 1);
		expected.put("w", 1);
		expected.put("r", 1);
		expected.put("d", 1);
		assertEquals(expected, charactersCount.getCharacters("Hello word"));
	}

	@Test
	public void testPrintResult() {
		StringBuilder expected = new StringBuilder();
		expected.append("\"h\" - 1").append(lineSeparator())
				.append("\"e\" - 1").append(lineSeparator())
				.append("\"l\" - 2").append(lineSeparator())
				.append("\"o\" - 2").append(lineSeparator())
				.append("\" \" - 1").append(lineSeparator())
				.append("\"w\" - 1").append(lineSeparator())
				.append("\"r\" - 1").append(lineSeparator())
				.append("\"d\" - 1").append(lineSeparator());
		assertEquals(expected.toString(), Main.printResult(charactersCount.getCharacters("Hello word")));
	}
	
	@Test
	public void testCacheUsing() {
		Map<Character, Integer> expected = cache.get("Hello word");
		Map<Character, Integer> current = cache.putIfAbsent("Hello word", countCharacters("Hello word".toLowerCase()));
		assertEquals(expected, current);
	}

	private Map<Character, Integer> countCharacters(String text) {
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		char[] characters = text.toCharArray();
		for (Character character : characters) {
			if (!charMap.containsKey(character)) {
				charMap.put(character, 1);
			} else {
				int characterCount = charMap.get(character);
				characterCount++;
				charMap.put(character, characterCount);
			}
		}
		return charMap;
	}

}
