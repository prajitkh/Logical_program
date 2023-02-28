package com.java8;

@FunctionalInterface
public interface MyInterface {
	void m1();

	static void m2() {
		System.out.println("interface class");
	}

}
