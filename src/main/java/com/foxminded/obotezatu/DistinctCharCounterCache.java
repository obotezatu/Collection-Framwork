package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounterCache implements CharCounter {

	private Map<String, Map<Character, Long>> cache = new HashMap<>();
	private CharCounter characters;

	public CharacterCounterCache(CharCounter characters) {
		this.characters = characters;
	}

	public Map<Character, Long> countChar(String text) {
		return cache.computeIfAbsent(text, chars -> characters.countChar(chars));
	}
}
