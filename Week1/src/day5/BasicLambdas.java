package day5;

import java.util.Arrays;
import java.util.Comparator;

public class BasicLambdas {
	
	public static int helperMethod(String s1, String s2) {
		return (s1.indexOf('e') != -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		
		// Sort by length
		System.out.println("Sort by length");
		String[] array = { "task", "Ace", "Washington", "Cole", "Calculate", "The Holy Place" };
		//.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		Arrays.stream(array).sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
		
		// Sort by reverse length
		System.out.println("Order items in reverse order by length");
		Arrays.stream(array).sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println);

		// Sort by first letter
		
		System.out.println("Sort by first letter");
		Comparator<String> firstComp = (s1, s2) -> s1.charAt(0) - s2.charAt(0);
		
		Arrays.stream(array).sorted(firstComp).forEach(System.out::println);
		
		// Sort by string containing an e
		System.out.println("Sort by whether it contains an e");
		Comparator<String> eFirstComp = (s1, s2) -> (s1.indexOf('e') != -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		
		Arrays.stream(array).sorted(eFirstComp).forEach(System.out::println);

		// use static method to help sort
		System.out.println("Sort by whether it contains an e using a helper method");
		Arrays.sort(array, (s1, s2) -> BasicLambdas.helperMethod(s1, s2));
		Arrays.stream(array).forEach(System.out::println);
	}
}
