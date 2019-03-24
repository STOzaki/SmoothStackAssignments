package day5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ReduceStringList {
	
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Something");
		stringList.add("another String");
		stringList.add("and");
		stringList.add("Not it");
		stringList.add("atm");
		
		List<String> reducedList = stringList.parallelStream().filter(s -> s.charAt(0) == 'a' && s.length() == 3).collect(Collectors.toList());
		
		reducedList.forEach(s -> System.out.println(s));
	}

}
