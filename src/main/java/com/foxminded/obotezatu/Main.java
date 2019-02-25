package com.foxminded.obotezatu;

import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CharactersCount charactersCount = new CharactersCount();
		boolean finish = false;
		try (Scanner inputText = new Scanner(System.in)) {
			String text;
			while (!finish) {
				System.out.println("Next string (for exit \"n\"): ");
				text = inputText.nextLine();
				if (!text.equals("n")) {
					System.out.println(printResult(charactersCount.getCountedletters(text)));
				} else {
					System.out.println("Program end");
					finish = true;
				}
			}
		}
	}

	public static String printResult(Map<String, Integer> charMap) {
		StringBuilder printMap = new StringBuilder();
		for (Map.Entry<String, Integer> entry : charMap.entrySet()) {
			printMap.append(String.format("\"" + entry.getKey() + "\" - " + entry.getValue()))
					.append(System.lineSeparator());
		}
		return printMap.toString();
	}
}