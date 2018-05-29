package mianshi;

public class Test extends Thread{
	
	public T t;
	public Test(T t) {
		this.t = t;
	}

	public void run() {
		try {
			t.m1();
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		T t = new T();
		Test test = new Test(t);
		test.start();
		test.t.m2();
		System.out.println("main i: " + test.t.i);
	}
}

class T {
public int i = 0;
	synchronized void m1() throws InterruptedException {
//		Thread.sleep(1);	//1
		i = 20;
		Thread.sleep(3000);
		System.out.println("m1 -- i: " + i);
	}
	synchronized void m2() throws InterruptedException {
		i = 10;
		Thread.sleep(200);
	}
}
