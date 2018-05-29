package singleton;

public class Lanhanshi {

	/**
	 * 懒汉式容易存在线程不安全的问题，下面直接写一个安全的
	 */
	
	private static volatile Lanhanshi l = null;
	
	private Lanhanshi() {}
	
	public static Lanhanshi getInstance() {
		
		if(l == null) {
			synchronized(Lanhanshi.class) {
				if(l == null) {
					l = new Lanhanshi();
				}
			}
		}
		return l;
	}
	
}
