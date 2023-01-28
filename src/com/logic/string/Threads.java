package com.logic.string;

public class Threads extends Thread {

	@Override
	public void run() {
		System.out.println(1);
		super.run();
	}

	public static void main(String[] args) {
		Threads threads = new Threads();
		threads.start();

	}
}
