package com.foxminded.obotezatu;

public class Main {

	public static void main(String[] args) {
		String[] texts = { "Hello word", "Commons-Collections", "Ordered maps", "getting started", "Hello word",
		"Commons-Collections" };
		Cash cash = new Cash();
		CharactersCount charactersCount = new CharactersCount();
		for (String text : texts) {
			System.out.println(text);
			System.out.println(charactersCount.getCountedletters(text, cash).toString());
		}
	}
}
