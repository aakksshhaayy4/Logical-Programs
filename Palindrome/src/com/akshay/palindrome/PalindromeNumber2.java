//checking palindrome number using while loop

package com.akshay.palindrome;

import java.util.Scanner;

public class PalindromeNumber2 {

	public static void main(String[] args) {

		// declaring and initializing one reverse number/variable
		int reverse = 0;
		// declaring remainder
		int remainder;
		// declaring one temparary variable to store value temporarily
		int temp;

		// taking input from end user
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number, that you want to check whether it is palindrome or not ! : ");
		int num = scn.nextInt();

		// storing input in temporary variable..
		temp = num;

		while (temp > 0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;

		}
		if (num == reverse) {
			System.out.println("Yes ! It is Palindrome NUmber");
		} else {
			System.out.println("It is not Palindrome Number");
		}

	}

}
