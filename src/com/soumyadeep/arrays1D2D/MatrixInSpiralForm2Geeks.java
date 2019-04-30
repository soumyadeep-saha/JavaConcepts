package com.soumyadeep.arrays1D2D;

public class MatrixInSpiralForm2Geeks {

	public static void main(String[] args) {

		int[][] a = new int[100][100];
		System.out.println(a.length);

		// Initialize value to be filled in matrix
		int val = 1;
		int k = 0;
		int l = 0;
		int m = 4;
		int n = 4;
		while (k < m && l < n) {
			/*
			 * Print the first row from the remaining rows
			 */
			for (int i = l; i < n; ++i) {
				a[k][i] = val++;
			}

			k++;

			/*
			 * Print the last column from the remaining columns
			 */
			for (int i = k; i < m; ++i) {
				a[i][n - 1] = val++;
			}
			n--;

			/*
			 * Print the last row from the remaining rows
			 */
			if (k < m) {
				for (int i = n - 1; i >= l; --i) {
					a[m - 1][i] = val++;
				}
				m--;
			}

			/*
			 * Print the first column from the remaining columns
			 */
			if (l < n) {
				for (int i = m - 1; i >= k; --i) {
					a[i][l] = val++;
				}
				l++;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}