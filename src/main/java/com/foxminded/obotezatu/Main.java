package com.foxminded.obotezatu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Characters charactersMap = new CharactersMap();
		charactersMap = new Cache(charactersMap);
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				String text;
				System.out.println("Next string (for exit \"n\"): ");
				text = scanner.nextLine();
				if (text.equals("n")) {
					System.out.println("Program end");
					break;
				}
				charactersMap.printResult(charactersMap.createCharactersMap(text));
			}
		}
	}
}