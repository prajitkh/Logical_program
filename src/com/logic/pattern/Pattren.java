package com.logic.pattern;

public class Pattren {
	public static void main(String[] args) {

		int k;
		int n = 2;
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
//2
//4 8
//6 12 18
//8 16 24 32
//10 20 30 40 50
