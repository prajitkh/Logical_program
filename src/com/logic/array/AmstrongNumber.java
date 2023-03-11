package com.logic.array;

public class AmstrongNumber {

	public static void main(String[] args) {
		int i;

		int rem;
		int digit;
		for (i = 153; i <= 10000; i++) {
			int sum = 0;
			int temp = i;
			digit = (int) (Math.log10(temp) + 1);
			while (temp > 0) {
				rem = temp % 10;
				sum = sum + (int) Math.pow(rem, digit);
				temp = temp / 10;
			}
			if (sum == i)
				System.out.println(i + " Amstrong number ");
		}
	}

}