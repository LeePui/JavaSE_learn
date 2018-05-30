package singleton;

public class Singleton {
	public static int value1;
	public static int value2 = 0;
	private static Singleton s = new Singleton();
	
	private Singleton() {
		value1++;
		value2++;
	}
	
	public static Singleton getSingleton() {
		return s;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		System.out.println("Singleton1 value1:" + Singleton.value1);
        System.out.println("Singleton1 value2:" + Singleton.value2);
		Singleton2 singleton2 = Singleton2.getSingleton();
		System.out.println("Singleton2 value1:" + Singleton2.value1);
        System.out.println("Singleton2 value2:" + Singleton2.value2);
		
	}
	

}

class Singleton2{
	private static Singleton2 s = new Singleton2();
	public static int value1;
	public static int value2 = 0;
	
	private Singleton2() {
		value1++;
		value2++;
	}
	
	public static Singleton2 getSingleton() {
		return s;
	}
}
