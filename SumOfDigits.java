package week1.day1.classroom;

public class SumOfDigits {
	
	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input number (int)
		
		int number = 345;

		// Initialize an integer variable by name: sum
		int sum = 0;
		int quotient = 1;
		int remainder=0;

		// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
		while (quotient !=0) {
			// Within loop: get the remainder when done by 10 -> Tip: use mod %
			remainder = number %10;
			// Print the remainder to confirm
			System.out.println("Remainder = " +remainder);
			// Within loop: add that remainder to the sum
			sum = sum + remainder;
			// Print the sum to confirm
			System.out.println("The Sum is " +sum);
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			quotient = number /10;
			// Print the quotient to confirm
			System.out.println("The Quotient is " +quotient);
			number = quotient;
		}	
				
		// Outside the loop: print the final sum
		System.out.println("The Final Sum of the number is "+sum);
		

	}

}
