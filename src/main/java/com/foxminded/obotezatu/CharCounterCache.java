package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.Map;

public class CharCounterCache implements CharCounter {

	private Map<String, Map<Character, Long>> cache = new HashMap<>();
	private CharCounter charCounter;

	public CharCounterCache(CharCounter charCounter) {
		this.charCounter = charCounter;
	}

	public Map<Character, Long> countChars(String text) {
		return cache.computeIfAbsent(text, chars -> charCounter.countChars(chars));
	}

	public Map<String, Map<Character, Long>> getCache() {
		return cache;
	}
}
