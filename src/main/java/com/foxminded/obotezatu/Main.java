package com.foxminded.obotezatu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CharCounter charactersMap = new CharacterCounter();
		charactersMap = new CharacterCounterCache(charactersMap);
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Next string (for exit \"n\"): ");
				String text = scanner.nextLine();
				if (text.equals("n")) {
					System.out.println("Program end");
					break;
				}
				CharacterCounter.printResult(charactersMap.countChar(text));
			}
		}
	}
}