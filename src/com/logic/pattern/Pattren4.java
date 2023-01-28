package com.logic.pattern;

public class Pattren4 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			int n = 5;
			for (int j = 1; j <= i; j++) {
				System.out.print(n);
				n--;
			}
			System.out.println();
		}
	}
}
//54321
//5432
//543
//54
//5