package com.logic;

public class ArrayProgam {
	public static void main(String[] args) {
		int n = 2;
		for (int i = 1; i <= 15; i++) {

			if (i % 2 == 0) {
				System.out.print(n + " ");
				n *= 2;
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
