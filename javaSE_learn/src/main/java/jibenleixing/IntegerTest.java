package jibenleixing;

public class IntegerTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(500);
		Integer i4 = new Integer(500);
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		
		int a1 = i1;
		int a2 = i2;
		int a3 = i3;
		int a4 = i4;
		System.out.println(a1 == a2);
		System.out.println(a3 == a4);
		
	}
}
