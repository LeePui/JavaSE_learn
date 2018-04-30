package testSingleton;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

public class TestSingleton1 {
	


	public static void main(String[] args) {
		MyThread1[] my1 = new MyThread1[10];

		for (int i = 0; i < my1.length; i++) {
			my1[i] = new MyThread1();
		}

		for (int i = 0; i < my1.length; i++) {
			my1[i].start();
		}
	}
	
	
}
