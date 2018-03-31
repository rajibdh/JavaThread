package com.java.thread.rajib;

public class ThreadSyncTest {

	private int count = 0;
	
	public static void main(String[] args) {
		
		ThreadSyncTest threadSyncTest = new ThreadSyncTest();
		threadSyncTest.execute();
	}
	
	private synchronized void increment(){
		
		count++;
	}

	private void execute() {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0 ; i<15000; i++){
					increment();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0 ; i<15000; i++){
					increment();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Count = "+count);
		
	}
}
