package com.logic.array;

public class SwapValue {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;

		System.out.println(a + " before swapping " + b);

		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println(a + " " + b);

	}
}
