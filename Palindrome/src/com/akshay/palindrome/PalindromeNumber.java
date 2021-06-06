//checking palindrome number using for loop

package com.akshay.palindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int r = 0;
		int remainder;
		int temp;

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number to check whether it is palindrome or not !");
		int num = scn.nextInt();

		temp = num;

		for (; num != 0; num /= 10) {
			remainder = num % 10;
			r = r * 10 + remainder;
		}

		if (temp == r) {
			System.out.println("Is palindome");
		} else {
			System.out.println("Is not palindrome");
		}
	}

}
