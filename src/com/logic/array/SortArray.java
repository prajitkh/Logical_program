package com.logic.array;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 1, 67, 89, 65, 24, 56, 55, 30, 224, 224, 34 };
		int i, max = 0, secondMax = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}

		for (i = 0; i < a.length; i++) {
			if (a[i] > secondMax && a[i] < max) {
				secondMax = a[i];
			}
		}
		System.out.println(secondMax);
	}
}