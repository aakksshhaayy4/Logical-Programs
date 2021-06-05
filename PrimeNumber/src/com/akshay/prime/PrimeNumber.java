package com.akshay.prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not");
		int num = scn.nextInt();
		
		if(num%2==0 ) {
			System.out.println(num+" is not prime number");
		}
		else
			System.out.println(num+" is prime number");
	}

}
