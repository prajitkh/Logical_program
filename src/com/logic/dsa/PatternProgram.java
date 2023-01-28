package com.logic.dsa;

public class PatternProgram {
	public static void main(String[] args) {
		int i, j;

		for (i = 2; i <= 5; i++) {
			int n = i;
			for (j = 5; j >= i; j--) {
				System.out.print(n + " ");
				n += i;
			}
			System.out.println();
		}
	}

}
//2 4 6 8
//3 6 9
//4 8
//5
