package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.Map;

public class CacheCharCounter implements CharCounter {

	private Map<String, Map<Character, Long>> cache = new HashMap<>();
	private CharCounter charCounter;

	public CacheCharCounter(CharCounter charCounter) {
		this.charCounter = charCounter;
	}

	public Map<Character, Long> countChars(String text) {
		return cache.computeIfAbsent(text, chars -> charCounter.countChars(chars));
	}
}
