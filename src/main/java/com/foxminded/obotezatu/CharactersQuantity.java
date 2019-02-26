package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharactersQuantity {

	private Map<String, Map<Character, Integer>> cache = new HashMap<>();

	public Map<Character, Integer> getCharacters(String text) {
		cache.putIfAbsent(text, countCharacters(text.toLowerCase()));
		return cache.get(text);
	}

	private Map<Character, Integer> countCharacters(String text) {
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		char[] characters = text.toCharArray();
		for (Character character : characters) {
			if (!charMap.containsKey(character)) {
				charMap.put(character, 1);
			} else {
				int characterCount = charMap.get(character);
				characterCount++;
				charMap.put(character, characterCount);
			}
		}
		return charMap;
	}
}