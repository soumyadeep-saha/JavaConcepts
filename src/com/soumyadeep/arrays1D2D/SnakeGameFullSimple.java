package com.soumyadeep.arrays1D2D;

public class SnakeGameFullSimple {

	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		System.out.println(num[0].length);
		System.out.println(num[1].length);

		// Traverse through all rows
		for (int i = 0; i < 5; i++) {

			if (i % 2 == 0) {
				// If current row is even, print from
				// left to right
				for (int j = 0; j < 5; j++) {
					System.out.print(num[i][j] + "	");
				}
			} else {
				// If current row is odd, print from
				// right to left
				for (int j = 4; j >= 0; j--) {
					System.out.print(num[i][j] + "	");
				}
			}
			System.out.println();
		}
	}
}
