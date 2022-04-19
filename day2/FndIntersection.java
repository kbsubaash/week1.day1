package week1.day2;
import java.util.Arrays;

/*
 * Pseudo Code
 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FndIntersection {
	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		int m = 0;

		int len1 = arr1.length;
		int len2 = arr2.length;

		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if (arr1[i] == arr2[j]) {
					m = arr1[i];
					i=arr1.length;
					System.out.println("The first match number is : " + m);
					break;
				}

			}
			
		}
		//System.out.println("The first match number is : " + m);
		
	}
}