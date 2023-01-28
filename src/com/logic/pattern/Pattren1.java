package com.logic.pattern;

public class Pattren1 {
	public static void main(String[] args) {
//		12345
//		1234
//		123
//		12
//		1
//		1
//		12
//		123
//		1234
//		12345
//		for (int i = 5; i >= 1; i--) {
//			int s = 5;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(s);
//				s--;
//			}
//			System.out.println();
//
//		}
		for (int i = 1; i <= 5; i++) {
			// for (int j = i; j >= 1; j--) {
			int ss = 5;
			for (int j = i; j >= 1; j--) {
				System.out.print(ss);
				ss--;
			}
			System.out.println();
		}
	}

}
