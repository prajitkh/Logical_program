package com.logic.array;

public class AmstrongNumber {

	public static void main(String[] args) {
		int i;

		int rem;
		int digit;
		int temp;
		for (i = 153; i < 10000; i++) {
			temp = i;
			int sum = 0;
			digit = (int) Math.log10(temp) + 1;

			while (temp > 0) {
				rem = temp % 10;
				sum += Math.pow(rem, digit);
				temp = temp / 10;
			}
			if (sum == i) {

				System.out.println(i + "Amstrong number ");
			}
		}
	}
}