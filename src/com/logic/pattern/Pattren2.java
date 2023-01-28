package com.logic.pattern;

public class Pattren2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			int num = 5;
			for (int j = 1; j <= i; j++) {
				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}

}
//5
//54
//543
//5432
