package com.soumyadeep.arrays1D2D;

public class MatrixInSpiralFormSimple1D {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		System.out.println(a.length);

		int rs = 0;
		int re = a.length;
		int cs = 0;
		int ce = a.length;
		int i;
		while (rs < re && cs < ce) {

			// Print the first row from the remaining rows
			for (i = cs; i < ce; ++i) {
				System.out.print(" " + a[rs][i]);
			}
			rs++;

			// Print the last column from the remaining columns
			for (i = rs; i < re; ++i) {
				System.out.print(" " + a[i][ce - 1]);
			}
			ce--;

			// Print the last row from the remaining rows
			if (rs < re) {
				for (i = ce - 1; i >= 1; --i) {
					System.out.print(" " + a[re - 1][i]);
				}
				re--;
			}
			// Print the first column from the remaining columns
			if (cs < ce) {
				for (i = re - 1; i >= rs; --i) {
					System.out.print(" " + a[i][cs]);
				}
				cs++;
			}
		}
	}
}