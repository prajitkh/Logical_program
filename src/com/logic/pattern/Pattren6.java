package com.logic.pattern;

public class Pattren6 {
	public static void main(String[] args) {
		int n = 2;
		int k;
		for (int i = 1; i <= 5; i++) {
			k = n;
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k += n;
			}
			System.out.println();
			n += 2;

		}

	}

}
