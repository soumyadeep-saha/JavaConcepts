package com.soumyadeep.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitiveToString {

	public static void main(String[] args) {

		int input = 12311189;
		int search = 1;

		char[] ch = new Integer(input).toString().toCharArray();
		System.out.println(ch);

		int[] i2 = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			i2[i] = Character.getNumericValue(ch[i]);
		}

		List<Integer> list1 = Arrays.stream(i2).boxed().collect(Collectors.toList());
		System.out.println(list1);

		long count = list1.stream().filter(p -> p == search).count();
		System.out.println("count is: " + count);

	}
}
