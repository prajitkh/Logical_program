package com.logic.pattern;

public class ZPrint {

//	******
//	    *
//	   *
//	  *
//	 *
//	******
	public static void main(String[] args) {

		int i, j;
		for (i = 6; i >= 1; i--) {
			for (j = 1; j <= 6; j++) {
				if (i == 6 || i == 1)
					System.out.print("*");

				else if (i == j)
					System.out.print("*");

				else if (i != j)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
