package com.logic.dsa;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 12;
		int temp = 0;
		int i;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				break;
			}
		}
		if (i == n) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is  not prime");
		}
	}

}
