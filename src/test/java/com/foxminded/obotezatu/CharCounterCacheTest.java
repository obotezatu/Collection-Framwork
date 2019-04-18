package com.foxminded.obotezatu;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CharCounterCacheTest {

	private CharCounter charCounter;
	private CharCounterCache distinctCharCounterCache;
	
	@Before
	public void init() {
		charCounter = mock(CharCounter.class);
		distinctCharCounterCache = new  CharCounterCache(charCounter);
	}
	
	@Test
	public void testCharCounterCache() {
		distinctCharCounterCache.countChars("text");
		verify(charCounter).countChars("text");
	}
}