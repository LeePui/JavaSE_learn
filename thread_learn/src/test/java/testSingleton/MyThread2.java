package testSingleton;

import java.util.concurrent.CountDownLatch;

import singleton.Singleton2;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println(Singleton2.getInstance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
