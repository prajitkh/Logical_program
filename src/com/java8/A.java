package com.java8;

public class A implements MyInterface {

	@Override
	public void m1() {
		System.out.println("override method");
	}

	public void m2() {
		System.out.println("interface *****");
	}

	public static void main(String[] args) {

		A a = new A();
		a.m1();
		a.m2();
		MyInterface.m2();
	}
}
