package com.foxminded.obotezatu;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CharactersCount {

	List<CashElement> cash;

	private CashElement getCharactersCount(String text) {
		CashElement item = new CashElement();
		item.setInitialText(text);
		String[] characters = text.split("");
		Map<String, Integer> charMap = new LinkedHashMap<>();
		for (String character : characters) {
			if (!charMap.containsKey(character)) {
				charMap.put(character, 1);
			} else {
				int val = charMap.get(character);
				val++;
				charMap.put(character, val);
			}
		}
		item.setCountedCharacters(charMap);
		return item;
	}

	public CashElement getCountedletters(String text, Cash cash) {
		CashElement item = new CashElement();
		if (cash.getCash().containsKey(text)) {
			return cash.getCash().get(text);
		} else {
			item = getCharactersCount(text);
			cash.getCash().put(text, item);
			return item;
		}
	}
}
