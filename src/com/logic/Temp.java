package com.logic;

import java.util.Arrays;

public class Temp {

	static long minimizeSum(int N, int arr[]) {
		// code here
		Arrays.sort(arr);
		long ans = 0;
		long val = arr[0];
		for (int i = 1; i < N; i++) {
			val += arr[i];
			ans += val;
		}
		return ans;
	}

	public static void main(String[] args) {

//		int arr[] = { 0, 5, 3, 0, 2, 5, 0 };
//		// how many time index numbere occur like 0=3 ,3=1, 5=2
//		int count = 1;
//		int i;
//		for (i = 0; i < arr.length; i++) {
//
//			for (int j = i + 1; i < arr.length; i++) {
//
//				if (arr[i] == arr[j]) {
//
//					count++;
//				}
//
//			}
//			System.out.println(count + " " + arr[i]);
//		}
//
//	}
		int arr[] = { 1, 4, 7, 10 };
		int n = arr.length;
		System.out.println(minimizeSum(n, arr));

	}
}