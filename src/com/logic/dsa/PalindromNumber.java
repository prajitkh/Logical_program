package com.logic.dsa;

public class PalindromNumber {

	public static void main(String[] args) {
		int number = 121;

		int le = number;
		int rem;
		int var = 0;
//		for (int i = number; i > 0; i /= 10) {
//			rem = i % 10;
//			var = var * 10 + rem;
//		}
		while (number > 0) {

			rem = number % 10;
			var = var * 10 + rem;
			number = number / 10;
		}
		if (var == le) {
			System.out.println(var);
		} else {
			System.out.println("ccv");
		}

	}

}
