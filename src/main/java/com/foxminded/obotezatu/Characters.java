package com.foxminded.obotezatu;

import java.util.Map;

public interface Characters {
	
	public Map<Character, Integer> createCharactersMap(String text);
	public void printResult(Map<Character, Integer> charMap);
}
