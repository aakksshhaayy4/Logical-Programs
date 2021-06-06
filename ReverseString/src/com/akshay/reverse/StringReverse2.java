package com.akshay.reverse;

public class StringReverse2 {

	public static void main(String[] args) {

		String name = "Akshay";

		char[] charArray = name.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

	}

}
