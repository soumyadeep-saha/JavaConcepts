package com.soumyadeep.arrays1D2D;

public class SnakeGameSimple {

	public static void main(String[] args) {
		int[] array1d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[][] array2d = new int[4][4];
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {

				if (count == array1d.length) {
					break;
				}
				array2d[i][j] = array1d[count];
				count++;
			}
		}

		System.out.println("Normal form");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(array2d[i][j] + "    ");
			}
			System.out.println();
		}

		System.out.println("Snake form");
		// Traverse through all rows
		for (int i = 0; i < 4; i++) {
			// If current row is even, print from
			// left to right
			if (i > 1 && i % 2 == 0) {
				for (int j = i; j >= 0; j--) {
					System.out.print(array2d[i][j] + "    ");
				}
			} else {
				// If current row is odd, print from
				// right to left
				for (int j = 0; j <= i; j++) {
					System.out.print(array2d[i][j] + "    ");
				}
			}
			System.out.println();
		}
	}
}
