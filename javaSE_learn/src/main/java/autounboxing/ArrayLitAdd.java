package autounboxing;

import java.util.ArrayList;
import java.util.List;

public class ArrayLitAdd {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();		//1完全使用泛型参数
//		List<Integer> list2 = new ArrayList<>();  		//2 与情况1相同
//		List list3 = new ArrayList<Integer>();		//3
		list1.add(10);
		
		/**
		 * 以上代码反编译:
		 * ArrayList arrayList = new ArrayList();
        	arrayList.add(Integer.valueOf(100));
		 */
		//这就是自动装箱
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a==b);
		
		
		Integer aa = 10;
		Integer bb = 10;
		System.out.println(aa==bb);
		
		
	}

}
