package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class CharactersCountTest {
	
	private CharactersCount charactersCount;
	private Cash cash;
	
	@Before
	public void setUp() {
		charactersCount = new CharactersCount();
		cash = new Cash();
	}

	@Test
	public void testGetCountedletters() {
		Map <String, Integer> expected = new LinkedHashMap<String, Integer>();
		expected.put("h",1);
		expected.put("e",1);
		expected.put("l",2);
		expected.put("o",2);
		expected.put(" ", 1);
		expected.put("w", 1);
		expected.put("r", 1);
		expected.put("d", 1);
		CashElement cashElement = charactersCount.getCountedletters("Hello word", cash);
		assertEquals(expected, cashElement.getCountedCharacters());
	}
	
	@Test
	public void testToString() {
		StringBuilder expected = new StringBuilder();
		expected.append("\"h\" - 1").append(lineSeparator())
				.append("\"e\" - 1").append(lineSeparator())
				.append("\"l\" - 2").append(lineSeparator())
				.append("\"o\" - 2").append(lineSeparator())
				.append("\" \" - 1").append(lineSeparator())
				.append("\"w\" - 1").append(lineSeparator())
				.append("\"r\" - 1").append(lineSeparator())
				.append("\"d\" - 1").append(lineSeparator());
		
		assertEquals(expected.toString(),String.valueOf(charactersCount.getCountedletters("Hello word", cash)));
	}

}
