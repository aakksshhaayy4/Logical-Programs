//Reversing string by using string buffer

package com.akshay.reverse;

public class StringReverse {

	public static void main(String[] args) {

		String name = "Akshay";

		StringBuffer bfr = new StringBuffer(name);

		StringBuilder stbldr = new StringBuilder(name);

		StringBuffer reverse = bfr.reverse();
		System.out.println(reverse);

	}

}
