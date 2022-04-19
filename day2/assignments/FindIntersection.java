package week1.day2.assignments;

import java.util.Arrays;

/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FindIntersection {
public static void main(String[] args) {
	int [] arr1 = {3,2,11,4,6,7};
	int [] arr2 = {1,2,8,4,9,7};
	
	int length1 = arr1.length;
	int length2 = arr2.length;
	
	for(int i = 0; i < length1; i++) {
		for(int j = 0; j < length2; j++) {
			if (arr1 [i] == arr2 [j]) {
				System.out.println(" Array 1 and array 2 have the FIRST matching item at" + arr1 [i] +"position of the array");
				break;
			}
					
		}
		
	}
		
}
	
}

