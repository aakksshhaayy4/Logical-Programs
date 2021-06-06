//Factorial using taking input from user

package com.akshay.factorial;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {

		int factorial = 1;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number tha you want to get Factorial :");
		int num = scn.nextInt();

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is : " + factorial);
	}

}
