package extend;

public class Son1 extends Father1{

	public static void staticMethod() {
		System.out.println("Son1  static");
	}
	public static void main(String[] args) {
		Father1 f1 = new Son1();
		f1.staticMethod();
	}
}
