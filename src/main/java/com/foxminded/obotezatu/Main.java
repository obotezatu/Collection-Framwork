package com.foxminded.obotezatu;

import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CharCounter charCounter = new CharCounterCache(new UniqueCharCounter());
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Next string (for exit \"n\"): ");
				String text = scanner.nextLine();
				if (text.equals("n")) {
					System.out.println("Program end");
					break;
				}
				printResult(charCounter.countChars(text));
			}
		}
	}

	public static void printResult(Map<Character, Long> charactersMap) {
		for (Map.Entry<Character, Long> entry : charactersMap.entrySet()) {
			System.out.println(("\"" + entry.getKey() + "\" - " + entry.getValue()));
		}
	}
}