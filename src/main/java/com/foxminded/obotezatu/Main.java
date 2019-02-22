package com.foxminded.obotezatu;

public class Main {

	public static void main(String[] args) {
		Cash cash = new Cash();
		CharactersCount charactersCount = new CharactersCount();
		String[] texts = { "Hello word", "Commons-Collections", "Ordered maps", "getting started", "Hello word",
				"Commons-Collections" };
		for (String text : texts) {
			System.out.println(text);
			System.out.println(charactersCount.getCountedletters(text, cash).toString());
		}
	}
}
