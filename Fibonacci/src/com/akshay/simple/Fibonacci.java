package com.akshay.simple;

public class Fibonacci {

	public static void main(String[] args) {
		
		int m1=0;
		int m2=1;
		int m3;
		int count = 10;
		System.out.print(m1+", "+m2);
		
		for(int i=2; i<count; ++i) {
			m3=m1+m2;
			System.out.print(","+m3);
			m1=m2;
			m2=m3;
			
		}

	}

}
