package day1;
import java.util.Scanner;

public class Main {
	private final int pattern;
	private final int lines;
	public Main(int pattern, int lines) {
		this.pattern = pattern;
		this.lines = lines;
	}
	
	private String repeat(String item, int times) {
		String return_value = "";
		for(int j = 0; j < times; j++) {
			return_value += item;
		}
		return return_value;
	}
	
	public void generatePattern() {
		for(int i = 0; i < lines; i++) {
			switch(pattern) {
			case 1:
				System.out.println(repeat("*", i + 1));
				break;
			case 2:
				System.out.println(repeat("*", lines - i));
				break;
			case 3:
				System.out.print(repeat(" ", lines - i));
				System.out.println(repeat("*", (2 * i) + 1));
				break;
			case 4:
				System.out.print(repeat(" ", i + 1));
				System.out.println(repeat("*", (2 * (lines - (i + 1)) + 1)));
				break;
			default:
				System.out.println("does not exist!");
				break;
			}
		}
	}

	public static void main(String args[]) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Which patter would you like to try (1-4)?");
		int pattern = user_input.nextInt();
		boolean correct_pattern = (pattern > 0 && pattern < 5) ? true : false;
		while(!correct_pattern) {
			System.out.println("I am sorry that is not a pattern that we have.");
			System.out.println("Please choice a pattern between 1 and 4.");
			pattern = user_input.nextInt();
			correct_pattern = (pattern > 0 && pattern < 5) ? true : false;
		}

		int line_limit = (pattern == 1 || pattern == 2) ? 180 : 90;
		System.out.println("How many lines would you like to print (1-" + Integer.toString(line_limit) + ")?");
		int lines = user_input.nextInt();
		boolean correct_lines = (lines > 0 && lines <= line_limit) ? true : false;
		while(!correct_lines) {
			System.out.println("I am sorry but that is not between 1 and " + Integer.toString(line_limit) + " lines.");
			System.out.println("Please try again.");
			lines = user_input.nextInt();
			correct_lines = (lines > 0 && lines <= line_limit) ? true : false;
		}
		
		Main store = new Main(pattern, lines);
		store.generatePattern();
		user_input.close();
	}
}
