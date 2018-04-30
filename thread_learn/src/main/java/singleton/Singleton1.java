package singleton;
/**
 * 懒汉式
 * 同步代码块实现,由测试可见，这一种并不是线程安全的
 * @author 李拜天
 *
 */
public class Singleton1 {

	private static Singleton1 s = null;
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() throws InterruptedException {
		if(s != null) {
		}else {
			Thread.sleep(1000);	//可能有一些耗时性工作
			synchronized(Singleton1.class) {
				s = new Singleton1();
			}
		}
		return s;
	}
}
