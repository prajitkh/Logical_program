package com.logic;

public class FibonacciSeries {
	static int a = 0, b = 1, c;

	void printFibo(int i) {

		if (i >= 0) {

			c = a + b;

			System.out.print(c + " ");
			a = b;
			b = c;
			printFibo(i - 1);

		}
	}

	public static void main(String[] args) {
		FibonacciSeries fib = new FibonacciSeries();
		System.out.print(a + " " + b + " ");
		fib.printFibo(10);

	}

}
