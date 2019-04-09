package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

//import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class CharactersMapTest {

	private Characters charactersCount;

	@Before
	public void setUp() {
		charactersCount = new CharactersMap();
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

	/*@Test
	public void testPrintResult() {
		StringBuilder expected = new StringBuilder();
		expected.append("\"H\" - 1").append(lineSeparator())
				.append("\"e\" - 1").append(lineSeparator())
				.append("\"l\" - 2").append(lineSeparator())
				.append("\"o\" - 2").append(lineSeparator())
				.append("\" \" - 1").append(lineSeparator())
				.append("\"w\" - 1").append(lineSeparator())
				.append("\"r\" - 1").append(lineSeparator())
				.append("\"d\" - 1").append(lineSeparator());
		assertEquals(expected.toString(), charactersCount.printResult(charactersCount.createCharactersMap("Hello word")).toString());
	}*/
}
