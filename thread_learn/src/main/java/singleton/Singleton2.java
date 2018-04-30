package singleton;
/**
 * 懒汉式
 * 同步代码块实现,采用双重锁检测
 * @author 李拜天
 *
 */
public class Singleton2 {

	private static Singleton2 s = null;
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() throws InterruptedException {
		if(s != null) {
		}else {
			Thread.sleep(1000);	//可能有一些耗时性工作
			synchronized(Singleton2.class) {
				if(s == null) {
					s = new Singleton2();
				}
			}
		}
		return s;
	}
}
