package com.logic;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5 };
		double num = arr.length + 1;

		double size = num / 2;
		double totalSum = size * ((double) arr[0] + (double) arr[arr.length - 1]);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
		}
		int ss = (int) (totalSum - count);
		System.out.println(ss);

	}
}
