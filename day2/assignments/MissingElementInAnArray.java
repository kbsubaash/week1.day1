package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// Sort the array
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
		int length = arr.length;
		for (int i = 0; i < length; i++) {

			// check if the iterator variable is not equal to the array values respectively
			int compare = i + 1;
			if (arr[i] != compare) {

				// print the number
				System.out.println("Missing number is " + i);
				// once printed break the iteration
			break;
			}
		}
	}
}