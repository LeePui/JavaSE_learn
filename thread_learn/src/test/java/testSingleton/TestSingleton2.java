package testSingleton;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

public class TestSingleton2 {
	


	public static void main(String[] args) {
		MyThread2[] my2 = new MyThread2[10];

		for (int i = 0; i < my2.length; i++) {
			my2[i] = new MyThread2();
		}

		for (int i = 0; i < my2.length; i++) {
			my2[i].start();
		}
	}
	
	
}
