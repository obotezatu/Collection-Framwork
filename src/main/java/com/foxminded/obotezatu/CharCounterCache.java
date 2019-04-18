package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharCounterCache implements CharCounter {

	private Map<String, Map<Character, Long>> cache = new HashMap<>();
	private DistinctCharCounter characters;

	public DistinctCharCounterCache(DistinctCharCounter characters) {
		this.characters = characters;
	}

	public Map<Character, Long> countChars(String text) {
		return cache.computeIfAbsent(text, chars -> characters.countChars(chars));
	}

	public Map<String, Map<Character, Long>> getCache() {
		return cache;
	}
}
