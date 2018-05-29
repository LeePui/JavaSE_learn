package mianshi;

/**
 * 
 * @author 李拜天
 *
 */

public class Test2 extends Thread{
	
	public synchronized void m1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("------m1------");
	}
	
	public synchronized void m2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("*******m2*******");
	}
	
	public void run() {
		try {
			m1();
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Test2 t2 = new Test2();
		t2.start();
		Thread.sleep(100);
		t2.m2();
		System.out.println("------main--------");
		
	}
	

}
