package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

public class CharacterCounter implements CharCounter {

	public Map<Character, Long> countChar(String text) {
		return text.chars()
				.mapToObj(character -> (char) character)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	}

	public static void printResult(Map<Character, Long> map) {
		for (Map.Entry<Character, Long> entry : map.entrySet()) {
			System.out.println(("\"" + entry.getKey() + "\" - " + entry.getValue()));
		}
	}
}
