package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CombineToString {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(100);
		String result = intList.stream().map((i) -> (i % 2 == 0) ? "e" + i : "o" + i).collect(Collectors.joining(","));
		System.out.println(result);
		

	}

}
