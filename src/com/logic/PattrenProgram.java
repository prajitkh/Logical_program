package com.logic;

public class PattrenProgram {

	public static void main(String[] args) {
		int n;
		for (int i = 2; i <= 5; i++) {
			n = i;
			for (int j = 5; j >= i; j--) {
				System.out.print(n);
				n += i;
			}
			System.out.println();
		}
	}
}
