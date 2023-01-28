package com.logic;

public class SumArray {
	public static void main(String[] args) {

		int arr[] = { 40, -20, 55, 22, 65, 33 };
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a = a + arr[i];
		}
		System.out.println(a);
	}
}
