package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharCounterCache implements CharCounter {

	private Map<String, Map<Character, Long>> cache = new HashMap<>();
	private CharCounter charCounter;

	public UniqueCharCounterCache(CharCounter charCounter) {
		this.charCounter = charCounter;
	}

	public Map<Character, Long> countChars(String text) {
		return cache.computeIfAbsent(text, chars -> charCounter.countChars(chars));
	}
}
