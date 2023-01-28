package com.logic;

public class PattrenProgram2 {
	public static void main(String[] args) {
//		1   *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
		int i, j;
		int n = 1;
//
//		for (i = 1; i <= 5; i++) {
//			for (j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (j = 1; j <= i; j++)
//				System.out.print("*" + " ");
//
//			System.out.println();
//
//		}
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= 5; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}

			}
			System.out.println();
		}
	}
}