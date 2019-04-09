package com.foxminded.obotezatu;

import java.util.HashMap;
import java.util.Map;

public class Cache implements Characters{
	
	private Map<String, Map<Character, Integer>> cache = new HashMap<>();
	private Characters characters;
	
	public Cache(Characters characters) {
		this.characters = characters;
	}
		
	public Map<Character, Integer> createCharactersMap(String text){
		cache.putIfAbsent(text, characters.createCharactersMap(text));
		return cache.get(text);
	}
	
	public void printResult(Map<Character, Integer> charMap) {
		characters.printResult(charMap);
	}
}
