package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 15 output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 15;
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		
		// Print first number
		
		System.out.println(" Fibonacci Series" );
		System.out.println(firstNum);
		
		// Iterate from 1 to the range
		
		for (int i = 1; i < range; i++) {
		// add first and second number assign to sum
			sum = firstNum + secondNum;
		// Assign second number to the first number
			firstNum = secondNum;
		// Assign sum to the second number
			secondNum = sum;
		// print sum
			System.out.println(sum);
	}
	}
}
