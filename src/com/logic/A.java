package com.logic;

public class A {
	A() {

	}

	public static void main(String[] args) {
		int arr[] = { 2, 45, 76, 44, 23, 71 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(arr[i]);
		}
	}
}