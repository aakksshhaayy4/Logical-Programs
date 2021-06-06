package com.akshay.palindrome;

public class PalindromeString {

	public static void main(String[] args) {

		String sn = "madam";

		String sb = new StringBuffer(sn).reverse().toString();

		if (sn.equals(sb)) {
			System.out.println("Is palindrom");
		} else {
			System.out.println("Is not palindrome");
		}

	}

}
