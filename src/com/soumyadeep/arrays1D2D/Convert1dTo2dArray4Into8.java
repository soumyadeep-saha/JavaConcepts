package com.soumyadeep.arrays1D2D;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert1dTo2dArray4Into8 {

	public static void main(String[] args) {

		int[] array1d = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[][] array2d = new int[4][2];

		System.out.println(array2d[2].length);
		System.out.println(array2d[3].length);

		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {

				if (count == array1d.length) {
					break;
				}

				array2d[i][j] = array1d[count];
				count++;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array2d[i][j] + "    ");
			}
			System.out.println();
		}

		List<Integer> list = Arrays.stream(array1d).boxed().collect(Collectors.toList());
		System.out.println(list);
	}
}
