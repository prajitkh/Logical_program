package com.logic;

public class F {
	static int fact(int n) {

		if (n == 1)
			return 1;

		return n * fact(n - 1);

	}

	public static void main(String[] args) {
		int a = fact(5);
		System.out.println("factorial number " + a);
	}

}
