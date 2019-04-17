package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import java.util.function.Function;

public class DistinctCharCounter implements CharCounter {

	public Map<Character, Long> countChars(String text) {
		return text.chars()
				.mapToObj(character -> (char) character)
				.collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()));
	}
}
