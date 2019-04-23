package com.foxminded.obotezatu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.LinkedHashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class CacheCharCounterTest {

	@Mock
	private CharCounter charCounter;

	@InjectMocks
	private CacheCharCounter charCounterCache;

	@Test
	public void testCacheCountChars() {
		Map<Character, Long> expected = new LinkedHashMap<Character, Long>();
		expected.put('H', 1L);
		expected.put('e', 1L);
		expected.put('l', 3L);
		expected.put('o', 2L);
		expected.put(' ', 1L);
		expected.put('w', 1L);
		expected.put('r', 1L);
		expected.put('d', 1L);
		when(charCounter.countChars("Hello world")).thenReturn(expected);

		charCounterCache.countChars("Hello world");
		charCounterCache.countChars("Hello world");
		Map<Character, Long> actual = charCounterCache.countChars("Hello world");

		assertEquals(expected, actual);
		verify(charCounter, times(1)).countChars("Hello world");
	}
}