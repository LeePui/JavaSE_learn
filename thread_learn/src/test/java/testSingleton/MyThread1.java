package testSingleton;

import java.util.concurrent.CountDownLatch;

import singleton.Singleton1;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println(Singleton1.getInstance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
