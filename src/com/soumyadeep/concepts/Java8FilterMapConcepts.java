package com.soumyadeep.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FilterMapConcepts {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
		System.out.println("To upper case");
		// map transform one object into other by applying a function
		list.stream().map(p -> p.toUpperCase()).collect(Collectors.toList()).forEach(p -> System.out.print(p));

		System.out.println();
		System.out.println("To upper case with filter");
		// filters elements based upon a condition
		list.stream().filter(p -> !p.equalsIgnoreCase("a")).map(mapper -> mapper.toUpperCase())
				.forEach(p -> System.out.print(p));
	}
}
