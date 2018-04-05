package com.java.thread.rajib;

public class ThreadBasic01 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Value of i: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		ThreadBasic01 thread = new ThreadBasic01();
		thread.start();

		ThreadBasic01 thread2 = new ThreadBasic01();
		thread2.start();

		// thread.run(); //This will not create any thread. It will run under
		// the main thread.

		// thread2.run(); ////This will not create any thread. It will run under
		// the main thread.
		
		Thread myThread = new Thread(new ThreadExample2());
		myThread.start();

		System.out.println("Active Thread: " + Thread.activeCount());

	}

}

class ThreadExample2 implements Runnable {

	@Override
	public void run() {

		for (int j = 100; j < 109; j++) {

			System.out.println("Char val: " + (char)j);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
