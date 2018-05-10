package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Map1 {
	
	public static void main(String[] args) {
		Map<String, String>m;
		Collection c;
		ArrayList list = new ArrayList();
		list.hashCode();
		
		Object o;
		
//		Integer i = new Integer(1000);
//		System.out.println(i.hashCode());
		
		int i1 = 1000;
		int i2 = 1000;
//		System.out.println(i1==i2);
		
		Integer a1 = new Integer(1000);
		Integer a2 = new Integer(1000);
//		System.out.println(a1==a2);
//		System.out.println(a1.equals(a2));
//		System.out.println(a1.equals(i2));
		
		
//		int i3 = 1000;
//		Integer a3 = new Integer(1000);
//		System.out.println(a3.equals(i3));
		
		Integer b1 = 1000000;
		Integer b2 = 1000000;
		System.out.println("b1 == b2:      " + (b1 == b2));
		System.out.println("b1.equals(b2): " + b1.equals(b2));
		Integer c1 = 127;
		Integer c2 = 127;
		System.out.println("b1 == b2:      " + (c1 == c2));
		System.out.println("b1.equals(b2): " + c1.equals(c2));
		
	}

}
