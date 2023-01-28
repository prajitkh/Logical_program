package com.logic.multihreading;

public class Threading implements Runnable {

	@Override
	public void run() {
		System.out.println("thread");

	}

	public static void main(String[] args) {
		Threading threading = new Threading();
		Thread thread = new Thread(threading.);
		thread.start();
	}

}
