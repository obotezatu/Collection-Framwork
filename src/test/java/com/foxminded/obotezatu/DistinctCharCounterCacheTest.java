package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctCharCounterCacheTest {

	private DistinctCharCounterCache charCounterCache;

	@Before
	public void setUp() {
		charCounterCache = new DistinctCharCounterCache(new DistinctCharCounter());
	}

	@Test
	public void testGetCountedletters() {
		Map<Character, Long> expected = new LinkedHashMap<Character, Long>();
		charCounterCache.countChars("Hello world");
		expected.put('H', 1L);
		expected.put('e', 1L);
		expected.put('l', 3L);
		expected.put('o', 2L);
		expected.put(' ', 1L);
		expected.put('w', 1L);
		expected.put('r', 1L);
		expected.put('d', 1L);
		assertEquals(expected, charCounterCache.getCache().get("Hello world"));
	}
}