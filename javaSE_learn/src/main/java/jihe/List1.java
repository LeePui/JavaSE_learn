package jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
//		Long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
//			l.add(i);	//6257  6474   6256
//		}
//		Long end = System.currentTimeMillis();
		
		for (int i = 0; i < 10000000; i++) {
			a.add(i);	//4259  4213   4243
		}
//		Long end = System.currentTimeMillis();
//		System.out.println("insert time: " + (end-start));
		
	
//		start = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
//			a.add(i);
//		}
//		end = System.currentTimeMillis();
//		System.out.println("arrayList insert: " + (end-start));

		/**
		 * 测试中间插入与查找
		 */
		long start = System.currentTimeMillis();
		a.get(999999);		//get: 0   0   0
		a.get(999998);
		a.get(999993);		//add: 16  16  31  15   32
		long end = System.currentTimeMillis();
		System.out.println("arr insert: " + (end-start));
//		
//		long start = System.currentTimeMillis();
//		l.get(999999);		//get: 15  31  15
//		l.get(999993);
//		l.get(999998);		//add: 31  16  15  16   16
//		long end = System.currentTimeMillis();
//		System.out.println("link insert: " + (end-start));
		
		System.out.println(1000>>1);
	}

}
