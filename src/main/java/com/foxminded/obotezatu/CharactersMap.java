package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharactersMap implements Characters {

	public Map<Character, Integer> createCharactersMap(String text) {
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		text.chars().mapToObj(character -> (char) character).forEach(character -> {
			int characterCount = charMap.getOrDefault(character, 0);
			characterCount++;
			charMap.put(character, characterCount);
		});
		return charMap;
	}

	public void printResult(Map<Character, Integer> charMap) {
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			System.out.println(("\"" + entry.getKey() + "\" - " + entry.getValue()));
		}
	}
}
