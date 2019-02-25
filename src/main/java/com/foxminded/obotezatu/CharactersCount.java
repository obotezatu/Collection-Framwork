package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharactersCount {

	private Map<String, Map<String, Integer>> cash = new HashMap<>();

	public Map<String, Integer> getCountedletters(String text) {
		if (!cash.containsKey(text)) {
			cash.put(text, getCharactersCount(text.toLowerCase()));
		}
		return cash.get(text);
	}

	private Map<String, Integer> getCharactersCount(String text) {
		Map<String, Integer> charMap = new LinkedHashMap<>();
		String[] characters = text.split("");
		for (String character : characters) {
			if (!charMap.containsKey(character)) {
				charMap.put(character, 1);
			} else {
				int letterCount = charMap.get(character);
				letterCount++;
				charMap.put(character, letterCount);
			}
		}
		return charMap;
	}
}