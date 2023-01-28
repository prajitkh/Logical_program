package com.logic.dsa;

public class OneTo100PrimeNumber {

	public static void main(String[] args) {
		int i, j;
		for (i = 2; i <= 100; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}

			}
			if (i == j) {
				System.out.print(j + " ");
			}
		}

	}

}
