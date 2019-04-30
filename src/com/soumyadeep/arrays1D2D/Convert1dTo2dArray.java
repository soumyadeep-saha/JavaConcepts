package com.soumyadeep.arrays1D2D;

public class Convert1dTo2dArray {

	public static void main(String[] args) {

		/*
		 * Explaining the code 
		 * The logic is simple as said earlier. The two dimensional
		 * array contains certain number of rows and cols which are usually the factors
		 * of the single dimensional array size i.e. 5*4 (row*col) is equal to 20 which
		 * is the size of 1-D array.
		 * 
		 * count=0 is a variable whose initial value will be 0. This variable represents
		 * the control which will iterate through the indexes of the 1-D array. So final
		 * value of this will be the size of 1-D array.
		 * 
		 * if(count==d.length) break; Sometimes count can become equal to length of the
		 * 1D array, so upon a[i][j]=d[count]; statement execution, we will get an
		 * exception i.e. when count becomes d.length and when this statement executes,
		 * we get d[d.length] which is absurd, because there will be no index in an
		 * array that is equal to it's length. For you to believe what i said, try
		 * removing one or more elements from the 1-D array and execute keeping this
		 * statement in comments. See what happens. You'll probably get
		 * ArrayIndexOutOfBoundsExecption.
		 * 
		 * a[i][j]=d[count]; Insert the elements into the 2D array. a[0][0] will be
		 * first element, a[0][1] will be second one and so on.
		 * 
		 * count++; Increase the value of count so that next element can be inserted.
		 * 
		 * Print count, you'll get it equal to the no.of elements in the 1-D array.
		 * 
		 * Note that, when 2D array size is more than the 1D array the remaining places
		 * in the 2D array will not be filled. If 1D array size is more than the 2D
		 * array size, then the elements that can be fit into the 2D array will be
		 * inserted, remaining however will not be inserted
		 */

		int[] array1d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println(array1d.length);

		int[][] array2d = new int[5][4];

		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (count == array1d.length) {
					break;
				}
				array2d[i][j] = array1d[count];
				// System.out.printf("a[%d][%d]= %d\n", i, j, array2d[i][j]);
				count++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array2d[i][j]);
			}
			System.out.println();
		}

		System.out.println("Count is " + count);

	}
}
