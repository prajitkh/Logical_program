package com.logic;

public class S {

	public static void main(String args[]) {
		int arr[] = { 0, 4, 6, 0, 6, 2, 0, 3 };

//		int num[] = new int[arr.length];
//
//		int i, j;
//		int count = 1;
//		int lock = -1;
//		for (i = 0; i < arr.length; i++) {
//			count = 1;
//			for (j = i + 1; j < arr.length; j++) {
//
//				if (arr[i] == arr[j]) {
//					count++;
//					num[j] = lock;
//				}
//			}
//			if (num[i] != lock) {
//				num[i] = count;
//				System.out.println(arr[i] + " " + num[i]);
//			}

		int i, j;
		int count = 1;
		int lock = -1;
		int num[] = new int[arr.length];

		for (i = 0; i < arr.length; i++) {

			count = 1;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					num[j] = lock;
				}

			}
			if (num[i] != lock) {
				num[i] = count;
				System.out.println(count + " " + arr[i]);
			}
		}

	}

}
