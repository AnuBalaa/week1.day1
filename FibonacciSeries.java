
package week1.day1.assignments;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)

		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
	

		// Print first number
		System.out.println("The First number is " + firstNum);
		System.out.println("The Fibonocci series till " +range+ "is: ");

		// Iterate from 1 to the range
		//while (i <= range) {

		for (int i = 1; i <= range; i++) {
		System.out.println(firstNum+" ");

			// add first and second number assign to sum
			sum = firstNum + secNum;
			
			// Assign second number to the first number
			firstNum = secNum;
			// Assign sum to the second number
			secNum = sum;
			
			//i ++;
			
		}
			
		}
		

	}

