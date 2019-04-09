package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharactersMap implements Characters {

	public Map<Character, Integer> createCharactersMap(String text) {
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		char[] characters = text.toCharArray();
		for (Character character : characters) {
			int characterCount = charMap.getOrDefault(character, 0);
			characterCount++;
			charMap.put(character, characterCount);
		}
		return charMap;
	}

	public void printResult(Map<Character, Integer> charMap) {
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			System.out.println(("\"" + entry.getKey() + "\" - " + entry.getValue()));
		}
	}
}
