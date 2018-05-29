package mianshi;

/**
 * 同一对象中，同步的方法与不同步的方法可以同步运行
 * @author 李拜天
 *
 */
public class Test3 {

	public static void main(String[] args) {
		final TT t = new TT();
		Runnable run = new Runnable() {
			public void run() {
				try {
					t.m1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread th = new Thread(run);
		th.start();
		t.m2();
	}
	
}

class TT{
	
	public synchronized void m1() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("m1-----");
	}
	
	public void m2() {
		
		System.out.println("m2---------");
	}
}
