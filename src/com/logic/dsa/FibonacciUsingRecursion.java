package com.logic.dsa;

public class FibonacciUsingRecursion {

	static int a = 0, b = 1, c;

	void printFibo(int i) {
		if (i >= 1) {
			System.out.print(c + " ");
			c = a + b;
			a = b;
			b = c;
			printFibo(i - 1);

		}
	}

	public static void main(String[] args) {
		FibonacciUsingRecursion fib = new FibonacciUsingRecursion();
		
		fib.printFibo(10);

	}

}
