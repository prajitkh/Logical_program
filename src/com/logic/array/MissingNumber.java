package com.logic.array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] n = { 1, 5, 3, 4 };
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];

		}
		int sum2 = 0;

		for (int j = 1; j <= 5; j++) {
			sum2 += j;
		}

		System.out.println(sum2 - sum + "  is Missing Number");

	}
}
