package day3;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FindCharacter {
	public static void main(String[] args) {
		int counter = 0;
		String addedPath = "src/day3/";
		try (Scanner scanner = new Scanner(new File(addedPath + args[0]))) {

			while(scanner.hasNext()){
				char[] line = scanner.nextLine().toCharArray();
				for(char letter : line) {
					if(letter == args[1].toString().toCharArray()[0]) {
						counter++;
					}
				}
			}
			System.out.println("The file you gave me has " + counter + " of " + args[1]);

		} catch (IOException e) {
			System.out.println("Error: File not found!");
		}
	}
}
