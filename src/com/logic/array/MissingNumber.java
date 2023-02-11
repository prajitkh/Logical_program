package com.logic.array;

public class MissingNumber {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 7 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);

		int sum2 = 0;
		for (int i = 1; i <= 6; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
		System.out.println(sum2 - sum);

	}
}
