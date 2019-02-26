package com.foxminded.obotezatu;

import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CharactersQuantity charactersCount = new CharactersQuantity();
		try (Scanner inputText = new Scanner(System.in)) {
			String text;
			while (true) {
				System.out.println("Next string (for exit \"n\"): ");
				text = inputText.nextLine();
				if (!text.equals("n")) {
					System.out.println(printResult(charactersCount.getCharacters(text)));
				} else {
					System.out.println("Program end");
					break;
				}
			}
		}
	}

	public static String printResult(Map<Character, Integer> charMap) {
		StringBuilder printMap = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			printMap.append(String.format("\"" + entry.getKey() + "\" - " + entry.getValue()))
					.append(System.lineSeparator());
		}
		return printMap.toString();
	}
}