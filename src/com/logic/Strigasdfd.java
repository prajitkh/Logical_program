package com.logic;

public class Strigasdfd {
	public static void main(String[] args) {

		String str = "sanket";

		// System.out.println(str.length());

		int arr[] = { 6, 4, 9, 1, 7, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int a;

					a = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];
				}
			}
			System.out.print(arr[i] + " ");

		}

	}

}

///