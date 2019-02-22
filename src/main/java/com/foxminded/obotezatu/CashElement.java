package com.foxminded.obotezatu;

import java.util.Map;

public class CashElement {

	Map<String, Integer> countedCharacters;

	public Map<String, Integer> getCountedCharacters() {
		return countedCharacters;
	}

	public void setCountedCharacters(Map<String, Integer> countedCharacters) {
		this.countedCharacters = countedCharacters;
	}

	@Override
	public String toString() {
		StringBuilder printMap = new StringBuilder();
		for (Map.Entry<String, Integer> entry : countedCharacters.entrySet()) {
			printMap.append(String.format("\"" + entry.getKey() + "\" - " + entry.getValue()))
					.append(System.lineSeparator());
		}
		return printMap.toString();
	}
}
