package com.codewithakshay;

public class CheckArmstrong {

	/*
	 * This program is to check the given number is Armstrong Number or not
	 * 
	 * So, here is the sample number, we're taking..
	 *
	 * Whatever the number we're taking or user given input, the result should be
	 * the the addition of the cube of the numbers
	 *
	 * 153 -> 1 5 3 1*1*1 5*5*5 3*3*3 1 + 125 + 27 Result = 153
	 * 
	 */

	public static void main(String[] args) {

		int n = 153;
		int temp = n; // here we're assigning n's value to the temp variable.. and all the operations
						// we're going to perform on the temp's value

		int r;
		int sum = 0;

		while (n > 0) {
			r = n % 10; // by this line, will get the last value which is 3
			n = n / 10; // by this line, will get the remaining value which is 15
			sum = sum + r * r * r;
		}

		if (temp == sum) {
			System.out.println("It is Armstrong Number");
		} else {
			System.out.println("It is not Armstrong Number");
		}

	}

}
