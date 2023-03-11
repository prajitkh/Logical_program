package com.java8;

public class A implements MyInterface, Test, Lamda {
	@Override
	public void m1() {

		Test.super.m1();
	}

	public static void main(String[] args) {

		Lamda lamda = (a, b) -> System.out.println(a + b);
		lamda.m1(10, 20);
		A a = new A();
		a.m1();
	}

}
