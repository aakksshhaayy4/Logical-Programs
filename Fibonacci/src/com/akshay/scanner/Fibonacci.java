package com.akshay.scanner;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int num1=0;
		int num2=1;
		int result;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Any Number that you want to do Fibonacci");
		int count = scn.nextInt();
		
		System.out.print(num1+", "+num2);
		
		for(int i=2; i<count; i++) {
			result = num1+num2;
			System.out.print(", "+result);
			num1=num2;
			num2=result;
		}
		
	
	}

}
