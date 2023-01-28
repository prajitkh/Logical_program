package com.logic.dsa;

public class FibonacciUsingRecursion {

	static int a = 0, b = 1, c;

	public static void main(String[] args) {

		FibonacciUsingRecursion fibonacciUsingRecursion = new FibonacciUsingRecursion();
		fibonacciUsingRecursion.printFibo(10);

	}

	void printFibo(int i) {
		if (i >= 1) {
			System.out.print(c + " ");
			c = a + b;
			a = b;
			b = c;
			printFibo(i - 1);

		}
	}

}
